package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;

import prog2.exercise4.flight.booking.system.FlightBooking.TripSource;
import prog2.exercise4.flight.booking.system.FlightBooking.TripDestination;


/**
 * Hello world!
 *
 */
public class Main 
{



    public static void main( String[] args )
    {

        Scanner input4 = new Scanner(System.in);
        System.out.println("please input your date of departure");
        String departureDate = input4.nextLine();
        LocalDate departure = LocalDate.parse(departureDate);
        

        Scanner input5 = new Scanner(System.in);
        System.out.println("please input your date of return");
        String returnDate = input4.nextLine();
        LocalDate returningDate = LocalDate.parse(returnDate);
        

        FlightBooking fb = new FlightBooking("null", departure, returningDate, 2, 3);
        fb.setDepartureDate(departure);
        fb.setReturnDate(returningDate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your passengerFullName");
        String passengerFullName = scanner.nextLine();

        System.out.println("Please choose 1.First 2.Business 3.Economy");
        Scanner input1 = new Scanner(System.in);
        int choices1 = input1.nextInt();
        String a = new String();
        switch(choices1){
            case 1:
            a= "1";
            fb.setBookingClass(a);
            break;

            case 2:
            a="2";
            fb.setBookingClass(a);
            break;

            case 3:
            a="3";
            fb.setBookingClass(a);
            break;

        }
        fb.getBookingClass();

        System.out.println("please choose your trip source 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input2 = new Scanner(System.in);
        int choices2 = input2.nextInt();
        String b = new String();
        switch(choices2) {
            case 1:
            b="1";
            fb.setTripSource(b);
            break;

            case 2:
            b="2";
            fb.setTripSource(b);
            break;

            case 3:
            b="3";
            fb.setTripSource(b);
            break;

            case 4:
            b="4";
            fb.setTripSource(b);
            break;
        }
        fb.getTripSource();

        System.out.println("please choose your tripDestination 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input3 = new Scanner(System.in);
        int choices3 = input3.nextInt();
        String c = new String();
        switch(choices3) {
            case 1:
            c="1";
            fb.setTripDestination(b,c);
            break;

            case 2:
            c="2";
            fb.setTripDestination(b,c);
            break;

            case 3:
            c="3";
            fb.setTripDestination(b,c);
            break;

            case 4:
            c="4";
            fb.setTripDestination(b,c);
            break;
        }
        fb.getTripDestination();

        System.out.println("please choose your triptype");
        Scanner input6 = new Scanner(System.in);
        int choices6 = input6.nextInt();
        String d = new String();
        switch(choices6) {
            case 1:
            d="1";
            fb.setTripType(d);
            break;

            case 2:
            d="2";
            fb.setTripType(d);
            break;
        }

        fb.getTripType();

        String company = fb.getFlightCompany();
        String ticketNumber = fb.getTicketNumber();
        TripSource source = fb.getTripSource();
        TripDestination destination = fb.getTripDestination();
        fb.setTotalPassengers(20,10);
        int totalPassengers = fb.getTotalPassengers();

        fb.setTotalTicketPrice();
        double totalTicketPrice = fb.getTotalTicketPrice();



        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        company + "." + "\n" +
        "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + source + " to " + destination + "\n" +
        "Date of departure: " + departure + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice);
        
        int result = returnDate.compareTo(departureDate);
        if(result == 1 || result == 0) {
            System.out.println("IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
        }

    

        scanner.close();
        input1.close();
        input2.close();
        input3.close();
        input4.close();
        input5.close();
        input6.close();


        




            
        
         




    }
}


        
        