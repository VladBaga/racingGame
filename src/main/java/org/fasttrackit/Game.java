package org.fasttrackit;

public class Game {

    private Track[] tracks = new Track[10]; //sintaxa pt. siruri (lungimea intre paranteze)

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;

    public void start() {
        addTracks();
        displayAvailableTracks();
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
  //       }

  //   }
        //ENHANCED for / "for each"
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
            }
        }
    }
}