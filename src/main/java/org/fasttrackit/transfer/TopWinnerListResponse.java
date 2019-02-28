package org.fasttrackit.transfer;

import org.fasttrackit.domain.TopWinner;

import java.util.List;

public class TopWinnerListResponse {// Proprietati de instanta-constructori-metode-getteri-setteri

    private List<TopWinner> content;

    public TopWinnerListResponse(List<TopWinner> content) {
        this.content = content;
    }

    public TopWinnerListResponse() {
        //used for unmarshalling or deserialising
    }

    public List<TopWinner> getContent() {
        return content;
    }

    public void setContent(List<TopWinner> content) {
        this.content = content;
    }
}
