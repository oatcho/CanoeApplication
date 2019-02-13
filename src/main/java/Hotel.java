public class Hotel {
    private String nameOfHotel;
    private String bedOptions;
    private double price;
    private String status;
    private String location;

    public Hotel (String nameOfHotel, String bedOptions, double price, String status, String location) {
        this.nameOfHotel = nameOfHotel;
        this.bedOptions = bedOptions;
        this.price = price;
        this.status = status;
        this.location = location;
    }

    public Hotel (String nameOfHotel, String bedOptions, double price, String location) {
        this.nameOfHotel = nameOfHotel;
        this.bedOptions = bedOptions;
        this.price = price;
        this.status = "Available";
        this.location = location;
    }

    public void printDetails() {
        System.out.printf("Hotel name: " + nameOfHotel + "\nRoom type: " + bedOptions + "\nPrice: $"
                + price + "\nStatus: " + status + "\nLocation: " + location + "\n\n");
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "nameOfHotel='" + nameOfHotel + '\'' +
                ", bedOptions='" + bedOptions + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getNameOfHotel() {
        return nameOfHotel;
    }

    public void setNameOfHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public String getBedOptions() {
        return bedOptions;
    }

    public void setBedOptions(String bedOptions) {
        this.bedOptions = bedOptions;
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
