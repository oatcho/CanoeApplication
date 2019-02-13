import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class ReservationManager {

    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Hotel> hotels = new ArrayList<>();


    private ArrayList<Hotel> tempHotels; //= new ArrayList<>();
    private ArrayList<Flight> tempFlights; //= new ArrayList<>();


    public void addFlights () {
        flights.add(new Flight("Delta", "Economy", "de123", 500,
                "Scranton, PA"));
        flights.add(new Flight("Detla", "Business", "de133", 800,
                "Scranton, PA"));
        flights.add(new Flight("United", "Economy", "ua580", 300,
                "Tulsa, OK"));
        flights.add(new Flight("Spirit", "First", "sp321", 200,
                "Boring, OR"));
        flights.add(new Flight("Alaskan Airlines", "Husky", "aa456", 1400,
                "Plano, TX"));
    }

    public void addHotels () {
        hotels.add(new Hotel("Red Roof Inn", "Vibrating King Suite", 51,
                "Scranton, PA"));
        hotels.add(new Hotel("Motel 6", "Bunk Bed", 20,
                "Scranton, PA"));
        hotels.add(new Hotel("Big Bert's Motel", "Queen Water Bed Mermaid Theme Suite", 35,
                "Tulsa, OK"));
        hotels.add(new Hotel("Hostile Hostel", "Half of the Couch in the Lobby", 14,
                "Boring, OR"));
        hotels.add(new Hotel("Big Tex's Texas Motel", "Everything's Bigger In Texas Suite", 95,
                "Plano, TX"));
    }

    public void printFlights () {
        for (Flight flight : flights) {
            flight.printDetails();
        }
    }

    public void printHotels () {
        for (Hotel hotel : hotels) {
            hotel.printDetails();
        }
    }

    public void getReservationInfo(){

        Scanner scan = new Scanner(System.in);

        tempHotels = new ArrayList<>();
        tempFlights = new ArrayList<>();

        System.out.println("When are you going on your trip? mm/dd/yyyy");
        String firstDate = scan.nextLine();
        System.out.println("When are do you want to come back? mm/dd/yyyy");
        String secondDate = scan.nextLine();
        System.out.println("What is your budget?");
        double budget = scan.nextDouble();



            for (int i = 0; i < flights.size(); i++) {

                if (flights.get(i).getPrice() < budget &&
                        flights.get(i).getStatus().equalsIgnoreCase("available")) {

                    tempFlights.add(flights.get(i));


                }

            }
        for(int i = 0; i <tempFlights.size(); i++){

            System.out.println("[" + i + "]");

            tempFlights.get(i).printDetails();

        }


        System.out.println("What is the flight you want to select?");

            int userChoice = scan.nextInt();

            budget -= tempFlights.get(userChoice).getPrice();


        for(int i = 0; i < flights.size(); i++){

            if(tempFlights.get(userChoice).getFlightNumber().equalsIgnoreCase(flights.get(i).getFlightNumber())){

               flights.get(i).setStatus("Booked");
            }

        }


        System.out.println("Here is your new budget" + budget + "\n");

        int daysOnTrip = calculateDaysOnTrip(firstDate, secondDate);


        for(int i = 0; i < hotels.size(); i++){

            if((daysOnTrip * hotels.get(i).getPrice()) < budget &&

                    tempFlights.get(userChoice).getLocation() == hotels.get(i).getLocation()

                    && hotels.get(i).getStatus().equalsIgnoreCase("available")){

                tempHotels.add(hotels.get(i));

            }

        }

        for(int i = 0; i <tempHotels.size(); i++){

            System.out.println("[" + i + "]");

            tempHotels.get(i).printDetails();

        }



        if(tempHotels.size() == 0){
            System.out.println( "Not enough money left. ");

        }
        else {
            System.out.println("What hotel would you like? ");
            int userHotelChoice = scan.nextInt();

            budget -= tempHotels.get(userHotelChoice).getPrice();

           for(int i = 0; i < hotels.size(); i++){

               if(tempHotels.get(userHotelChoice).getNameOfHotel().equalsIgnoreCase(hotels.get(i).getNameOfHotel())){

                   hotels.get(i).setStatus("Booked");
               }

           }


            System.out.println("Here is your trip info.");

            System.out.println("-------FLIGHT INFO-------");

            tempFlights.get(userChoice).printDetails();

            System.out.println("-------HOTEL INFO-------");

            tempHotels.get(userHotelChoice).printDetails();

            System.out.println("Your remaining budget is $" + budget);

        }


    }


    public int calculateDaysOnTrip(String day1, String day2){


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate arrivalDate = LocalDate.parse(day1, dateTimeFormatter);

        LocalDate leaveDate = LocalDate.parse(day2, dateTimeFormatter);

        Period intervalBetweenDays = Period.between(arrivalDate, leaveDate);

        int days =intervalBetweenDays.getDays();

        return days;



    }

}


