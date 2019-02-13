public class Flight {

    private String airlineName;
    private String flightClass;
    private String flightNumber;
    private double price;
    private String status;
    private String location;

    public Flight (String airlineName, String flightClass, String flightNumber, double price, String status, String location) {
        this.airlineName = airlineName;
        this.flightClass = flightClass;
        this.flightNumber = flightNumber;
        this.price = price;
        this.status = status;
        this.location = location;
    }

    public Flight (String airlineName, String flightClass, String flightNumber, double price, String location) {
        this.airlineName = airlineName;
        this.flightClass = flightClass;
        this.flightNumber = flightNumber;
        this.price = price;
        this.location = location;
        this.status = "Available";
    }

    public void printDetails () {
        System.out.println(airlineName + " " + flightClass + " " + price + " " + status + " " + location);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
