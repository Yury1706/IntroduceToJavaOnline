package ProgrammingWithClasses.voucher;

public class Voucher {

    private String typeOfRest;
    private String country;
    private String city;
    private String transfer;
    private String food;
    private int length;
    private double cost;

    public Voucher() {
    }

    public Voucher(String typeOfRest, String country, String city,
                   String transfer, String food, int length, double cost) {
        this.typeOfRest = typeOfRest;
        this.country = country;
        this.city = city;
        this.transfer = transfer;
        this.food = food;
        this.length = length;
        this.cost = cost;
    }

    public String getTypeOfRest() {
        return typeOfRest;
    }

    public void setTypeOfRest(String typeOfRest) {
        this.typeOfRest = typeOfRest;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "typeOfRest='" + typeOfRest + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", transfer='" + transfer + '\'' +
                ", food='" + food + '\'' +
                ", length=" + length +
                ", cost=" + cost +
                '}';
    }
}
