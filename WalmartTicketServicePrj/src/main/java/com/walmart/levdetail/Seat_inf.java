package com.walmart.levdetail;

//This java class is the resource we have configured to accept RESTful requests
//import .*;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.GET;

@Path("levels") //localhost:8080/WalmartTicketService/resources/levels/1
public class Seat_inf {
	
	
	@GET
	@Path("{level}")
	public String getseat(@PathParam("level") String level){
            if (level.equals("1")){
                return ("Level Name:Orchestra,Available Seats:100,Total Seats:1250");
            }
            else if (level.equals("2")){
                return ("Level Name:Main,Available Seats:200,Total Seats:2000");
            }
            else if (level.equals("3")){
                return ("Level Name:Balcony 1,Available Seats:800,,Total Seats:1500");
            }
            else {
                return ("Level Name:Balcony 2,Available Seats:600,Total Seats:1500");
            }
            
	//return " ";	
	}
	

}
