/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walmart.levdetail;
//import static com.sun.xml.internal.ws.api.message.Packet.State.ClientResponse;
//import javax.ws.rs.client.Client;

/**
 *
 * @author Neha
 * This class implements the Level information
 */
public class Level {
    private int Level_Id;
    private String Level_Name;
    private int price;
    private int rows;
    private int seats_in_rows;
    private int availableSeats;   //Keeps on changing on basis of ticket booking
    
    public Level(int Level_Id,String Level_Name,int price,int rows,int seats_in_rows,int availableSeats)

    {
        super();
        this.Level_Id=Level_Id;
        this.Level_Name=Level_Name;
        this.price=price;
        this.rows=rows;
        this.seats_in_rows=seats_in_rows;
        this.availableSeats=availableSeats; 
    }
         //Getters and setters methods
	public int getLevel_ID() {
		return Level_Id;
	}
	public void setLevel_ID(int Level_Id) {
		this.Level_Id = Level_Id;
	}
	public String getLevel_Name() {
		return Level_Name;
	}
	public void setLevel_Name(String Level_Name) {
		this.Level_Name = Level_Name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getseats_in_row() {
		return seats_in_rows;
	}
	public void setseats_in_row(int seats_in_rows) {
		this.seats_in_rows = seats_in_rows;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
    
}
