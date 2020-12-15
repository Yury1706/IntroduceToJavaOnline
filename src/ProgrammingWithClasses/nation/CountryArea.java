package ProgrammingWithClasses.nation;

public class CountryArea {

    private String name;
    private double area;

    public CountryArea(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
