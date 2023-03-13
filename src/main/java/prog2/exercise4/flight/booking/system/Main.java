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
        fb.setBookingClass(choices1);
        fb.getBookingClass();

        System.out.println("please choose your trip source 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input2 = new Scanner(System.in);
        int choices2 = input2.nextInt();
        fb.setTripSource(choices2);
        fb.getTripSource();

        System.out.println("please choose your tripDestination 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input3 = new Scanner(System.in);
        int choices3 = input3.nextInt();
        fb.setTripDestination(choices3);
        fb.getTripDestination();

        System.out.println("please choose your triptype");
        Scanner input6 = new Scanner(System.in);
        int choices6 = input6.nextInt();
        fb.setTripType(choices6);
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


        
        