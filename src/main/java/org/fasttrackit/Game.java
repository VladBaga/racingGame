package org.fasttrackit;

import org.fasttrackit.domain.TopWinner;
import org.fasttrackit.service.TopWinnerService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private TopWinnerService topWinnerService = new TopWinnerService(); // ***vez rez***
    private Track[] tracks = new Track[10]; //sintaxa pt. siruri (lungimea intre paranteze)
    private List<Vehicle> competitors = new ArrayList<>();

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;

    public void start() throws SQLException, IOException, ClassNotFoundException {
        addCompetitors(getCompetitorCountFromUser());
        displayCompetitors();

        addTracks();
        displayAvailableTracks();
        int numberFromUser = getTrackNumberFromUser();
        Track track = tracks[numberFromUser - 1];
        System.out.println("Selected track : " + track.getName() + " - length : " + track.getLength() + " km.");

        boolean noWinnerYet = true;
        int competitorsWithoutFuel = 0;

        while (noWinnerYet && competitorsWithoutFuel < competitors.size()) {
            for (Vehicle vehicle : competitors) {//Pentru - vehicul-vehicul din lista de competitors
                double speed = getAccelerateSpeedFromUser();
                vehicle.accelerate(speed);
                if(vehicle.getFuelLevel() <= 0){
                    competitorsWithoutFuel ++;
                }

                if (vehicle.getTotalTraveledDistance() >= track.getLength()) {
                    System.out.println("Winner is : " + vehicle.getName());

                    TopWinner topWinner = new TopWinner();
                    topWinner.setName(vehicle.getName());
                    topWinner.setWonRaces(1);
                    topWinnerService.createTopWinner(topWinner);

                    noWinnerYet = false;
                    break;
                }
            }
        }
    }

    private void addCompetitors(int competitorCount) { // SCRIERE IN LISTA
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(100);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 15));
            System.out.println("Vehicle mileage : " + vehicle.getMileage());
            //vehicle properties will be populated when we learn to get user's input
            competitors.add(vehicle);
        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter a vehicle name : ");
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            System.out.println("Your vehicle name is : " + name);
            return name;
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a valid name.");
            return getVehicleNameFromUser();
        }
    }

    private int getCompetitorCountFromUser() {
        System.out.println("Please enter number of players : ");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfPlayers = scanner.nextInt();
            System.out.println("Competitors number is :" + numberOfPlayers);
            return numberOfPlayers;
        } catch (InputMismatchException exception) {
//            throw new Exception("Integer required.");
            System.out.println("Please enter a valid integer.");
            return getCompetitorCountFromUser();
        }
    }

    private void displayCompetitors() {  // CITIRE DIN LISTA
        System.out.println("Welcome ! Today's competitors are : ");
        for (int i = 0; i < competitors.size(); i++) {
            System.out.println(competitors.get(i).getName());
        }
    }

    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available tracks: ");
//        System.out.println(tracks[0].getName());
//        System.out.println(tracks[1].getName());

        //CLASSIC for
        //   for (int i = 0; i < tracks.length; i++) { //<= sau >= sau ==
        //       if (tracks[i] != null) { //if sau else if sau else
        //           System.out.println(tracks[i].getName()); // BUCLA for; classic for loop
        //          break; //am iesit din bucla
        //       }

        //   }
        //ENHANCED for / "for each"
        for (Track track : tracks) {
            //          if (track == null) // Daca track = null, se continua cu urmatorul pas, daca nu, SOUT
            //              continue;
            if (track != null) {
                System.out.println(track.getName());
            }
        }
    }

    private int getTrackNumberFromUser() {
        System.out.println("Type the number of the track you wanna play on.");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Please type a valid number for the track");
            return getTrackNumberFromUser();
        }
    }

    private double getAccelerateSpeedFromUser() {
        System.out.println("Please enter acceleration speed : ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Please re-type acceleration speed.");
            return getAccelerateSpeedFromUser();
        }
    }
}