import java.util.ArrayList;

public class ReservationManager {
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Hotel> hotels = new ArrayList<>();

    public void addFlights () {
        flights.add(new Flight("Delta", "Economy", "de123", 500,
                "Scranton, PA"));
        flights.add(new Flight("Detla", "Business", "de123", 800,
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

}
