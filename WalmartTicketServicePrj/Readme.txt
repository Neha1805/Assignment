Implement a simple ticket service that facilitates the discovery, temporary hold, and final reservation of seats within a high-demand performance venue.


Run:
Build the code.
Run using Glassfish server and Firefox browser.

I have used Glassfish server,RestAPI for the web services.Used Maven as a build tool.

In order to get number of seats at different levels:
http://localhost:8080/WalmartTicketService/resources/levels/1 ----> Level Name:Orchestra,Available Seats:100,Total Seats:1250
http://localhost:8080/WalmartTicketService/resources/levels/2 ----> Level Name:Main,Available Seats:200,Total Seats:2000
http://localhost:8080/WalmartTicketService/resources/levels/3 ----> Level Name:Balcony 1,Available Seats:800,Total Seats:1500
http://localhost:8080/WalmartTicketService/resources/levels/4 ----> Level Name:Balcony 2,Available Seats:600,Total Seats:1500


In order to get booked seat information:

http://localhost:8080/WalmartTicketService/resources/cust_id/101 ---> Seats booked in Level:Balcony 1 Seat #B1 Details sent to: abc1@xyz.com