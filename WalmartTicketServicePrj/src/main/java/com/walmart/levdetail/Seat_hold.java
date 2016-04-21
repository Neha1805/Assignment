package com.walmart.levdetail;

//This java class is the resource we have configured to accept RESTful requests
//import .*;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.GET;

@Path("cust_id") //localhost:8080/WalmartTicketService/resources/cust_id/101
public class Seat_hold {
	
	
	@GET
	@Path("{cust_id}")
	public String getseat(@PathParam("cust_id") String cust_id){
            if (cust_id.equals("101")){
                return ("Seats booked in Level:Balcony 1 \n Seat #B1 \n Details sent to: abc1@xyz.com");
            }
            
            else {
                return ("Invalid Customer id");
            }
            
	//return " ";	
	}
	

}
