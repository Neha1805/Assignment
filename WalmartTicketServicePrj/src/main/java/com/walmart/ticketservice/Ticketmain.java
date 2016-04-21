/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walmart.ticketservice;
import java.util.*;

/**
 *
 * @author Neha
 */
public class Ticketmain {
    public static void main(String [] s)
    {
        TicketServiceActual ta = new TicketServiceActual();
        TicketBase tb = new TicketBase();       //Integer venue = 1;
        System.out.println("Welcome to on-line ticket booking system");
        System.out.println("Enter no.of seats required,Range of levels as min and max");
        Scanner s1 = new Scanner(System.in);
        int seat = s1.nextInt();
        int min =s1.nextInt();
        int max=s1.nextInt();
        
        System.out.println("Number of seats and level is:"+ta.search_seats(seat,min,max));
        //System.out.println(ta.reserveSeats(1, "hh"));
        //ta.findAndHoldSeats(2,1, 3, "neha@gmail.com");
        System.out.println("Your seat id is:"+TicketBase.getseat_Id()+" "+"Your customer_id is:"+TicketBase.getcustid());
       
    }
}
