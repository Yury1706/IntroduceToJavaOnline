package ProgrammingWithClasses.nation;

public class CountryArea {

    private String name;
    private double area;
    private City countryAreaCenter;
    private Region[] regions;

    public CountryArea(String name, double area, City countryAreaCenter, Region[] regions) {
        this.name = name;
        this.area = area;
        this.countryAreaCenter = countryAreaCenter;
        this.regions = regions;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City getCountryAreaCenter() {
        return countryAreaCenter;
    }

    public void setCountryAreaCenter(City countryAreaCenter) {
        this.countryAreaCenter = countryAreaCenter;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
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
