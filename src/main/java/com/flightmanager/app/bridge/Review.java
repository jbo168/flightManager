

//Circle


package com.flightmanager.app.bridge;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review extends Ticket {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name = "booking_ID")
    private String comment;
    private int score;

    protected Review(TicketImplementor ticket) {
        super(ticket);
    }
    protected Review(TicketImplementor ticket , String comment, int score) {
        super(ticket);
        this.comment = comment;
        this.score = score;
    }

    @Override
    public void checkReview() {

    }

    @Override
    public void addReview(String comment , int score) {
        this.comment = comment;
        this.score = score;
    }


    public String getComment() {
        return this.comment;
    }


    @Override
    public void updateStatus() {

    }
}


