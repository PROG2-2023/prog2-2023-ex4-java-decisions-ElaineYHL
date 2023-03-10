package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;


public class FlightBooking {
    
    
    String flightID = "FOF0345IN";
    static String flightCompany = "Flights-of-Fancy";
    private static String passengerFullName;
    private static TripSource tripSource;
    private String sourceAirport;
    private static TripDestination tripDestination;
    private String destinationAirport;
    private static  LocalDate departureDate;
    private static LocalDate returnDate;
    private static int childPassengers;
    private static int adultPassengers;
    private static int totalPassengers;
    private static double departingTicketPrice;
    private static double returnTicketPrice;
    private static double totalTicketPrice;
    private String ticketNumber;
    private static BookingClass bookingClass;
    private static TripType tripType;
    



    public FlightBooking(String PassengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {

        FlightBooking.passengerFullName = PassengerFullName;
        FlightBooking.departureDate = departureDate;
        FlightBooking.returnDate = returnDate;
        FlightBooking.childPassengers = childPassengers;
        FlightBooking.adultPassengers = adultPassengers;

    } 
        

    public String getFlightCompany(){
        return flightCompany;
    }



    public String getPassengerFullName() {
        return passengerFullName;
    }
    public void setPassengerFullName(String scanner) {
        FlightBooking.passengerFullName = scanner;
    }



    public TripSource getTripSource() {
        return tripSource;
    }
    public enum TripSource {
        NANJING, BEIJING, OULU, HELSINKI;
    }
    public void setTripSource(String input2) {
        switch (input2) {
            case "1":
            tripSource= TripSource.NANJING;
            break;

            case "2":
            tripSource= TripSource.BEIJING;
            break; 

            case "3":
            tripSource= TripSource.OULU;
            break;

            case "4":
            tripSource= TripSource.HELSINKI;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        }
    }


    public String getSourceAirport()  {
        return sourceAirport;
    }
    public enum sourceAirport {
        Nanjing_Lukou_International_Airport, 
        Beijing_Capital_International_Airport, 
        Oulu_Airport, 
        Helsinki_Airport, 
    }


    public TripDestination getTripDestination() {
        return tripDestination;
    }
    public enum TripDestination {
        NANJING, BEIJING, OULU, HELSINKI;
    }
    public void setTripDestination(String input2,String input3 ) {
        switch (input3) {
            case "1":
            tripDestination = TripDestination.NANJING;
            break;

            case "2":
            tripDestination = TripDestination.BEIJING;
            break; 

            case "3":
            tripDestination = TripDestination.OULU;
            break;

            case "4":
            tripDestination = TripDestination.HELSINKI;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        }
        
    }
    

    public String getDestinationAirport() {
        return destinationAirport;
    }
    public enum destinationAirport {
        Nanjing_Lukou_International_Airport, 
        Beijing_Capital_International_Airport, 
        Shanghai_Pudong_International_Airport, 
        Oulu_Airport, 
        Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport;
    }


    public LocalDate getDepartureDate() {
        return departureDate;
        
    }
    public void setDepartureDate(LocalDate depart) {
        FlightBooking.departureDate = depart;

    }


    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        int result = returnDate.compareTo(departureDate);
        if(result >= 2){
            FlightBooking.returnDate = returnDate;
        }
        if(result == 1){
            returnDate = returnDate.plusDays(1);
            FlightBooking.returnDate = returnDate;
        }
        if(result == 0){
            returnDate = returnDate.plusDays(2);
            FlightBooking.returnDate = returnDate;
        }

        
    }
    

    public int getChildPassengers() {
        return childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }
    
    public int getTotalPassengers() {
        return totalPassengers;
    }
    public void setTotalPassengers(int ChildPassengers, int AdultPassengers) {
        totalPassengers = ChildPassengers + AdultPassengers;
    }


    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
        if((tripSource==TripSource.NANJING && tripDestination == TripDestination.BEIJING) || (tripSource==TripSource.BEIJING && tripDestination == TripDestination.NANJING) || (tripSource==TripSource.HELSINKI && tripDestination == TripDestination.OULU) || (tripSource==TripSource.OULU && tripDestination == TripDestination.HELSINKI)) {
            double taxes = 30;
            double service_fees = 15;
            departingTicketPrice = (300 + taxes + service_fees) * (childPassengers + adultPassengers);
        }

        
        else{
            double taxes1 = 45;
            double service_fees1= 30;
            departingTicketPrice = (300 + taxes1 + service_fees1) * (childPassengers + adultPassengers);
    }

    }


    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){

        if(tripType==TripType.ONE_WAY){
            returnTicketPrice = 0;
        }
        if(tripType==TripType.RETURN){
            returnTicketPrice = departingTicketPrice;
        }
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    } 
    public void setTotalTicketPrice() {
    if(tripType==TripType.ONE_WAY){
            if(bookingClass==BookingClass.FIRST) {
                totalTicketPrice = departingTicketPrice + 250;
                }else if(bookingClass==BookingClass.BUSINESS) {
                    totalTicketPrice = departingTicketPrice + 150;
                    }else if(bookingClass==BookingClass.ECONOMY) {
                        totalTicketPrice =departingTicketPrice + 50;
                        }
        }

        if(tripType==TripType.RETURN){
            if(bookingClass==BookingClass.FIRST) {
                totalTicketPrice = (departingTicketPrice + 250) *2;
                }else if(bookingClass==BookingClass.BUSINESS) {
                    totalTicketPrice = (departingTicketPrice + 150)*2;
                    }else if(bookingClass==BookingClass.ECONOMY) {
                        totalTicketPrice =(departingTicketPrice + 50) *2;
                        }
        }
        
}

        


    public String getTicketNumber() {
        String a="0";
        String b="0";
        String c="0";


        if(tripType==TripType.ONE_WAY){
            a = "11";

        }
        if(tripType==TripType.RETURN) {
            a = "22";
        }
        if(bookingClass==BookingClass.FIRST) {
            b = "F";
        }
        if(bookingClass==BookingClass.BUSINESS){
            b = "B";
        }
        if(bookingClass==BookingClass.ECONOMY) {
            b = "E";
        }
        if((tripSource==TripSource.NANJING && tripDestination == TripDestination.BEIJING) || (tripSource==TripSource.BEIJING && tripDestination == TripDestination.NANJING) || (tripSource==TripSource.HELSINKI && tripDestination == TripDestination.OULU) || (tripSource==TripSource.OULU && tripDestination == TripDestination.HELSINKI)) {
            c = "DOM";
        }else{
            c = "INT";
        }
        this.ticketNumber = a + b +"####" + c;
        return ticketNumber;
    }
    
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + "." + "\n" +
        "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
        
    }
    public enum BookingClass {
        FIRST,BUSINESS,ECONOMY;
    }
    public void setBookingClass(String input1) {
            switch (input1) {
                case "1":
                bookingClass = BookingClass.FIRST;
                break;
                
                case "2":
                bookingClass = BookingClass.BUSINESS;
                break;

                case "3":
                bookingClass = BookingClass.ECONOMY;
                break;

                default:
                System.out.println("you don't have a choice");
                break;
            }

    }

    public TripType getTripType() {
        return tripType;
    }
    public void setTripType(String input6){
        if(input6.equals("1")){
            tripType = TripType.ONE_WAY;
        }
        if(input6.equals("2")) {
            tripType = TripType.RETURN;
        }
    }

    public enum TripType {
        ONE_WAY,RETURN;
    }

    
}

        

 
