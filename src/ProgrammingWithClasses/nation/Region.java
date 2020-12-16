package ProgrammingWithClasses.nation;

public class Region {

    private String name;
    private City regionalCenter;
    private City[] cities;

    public Region(String name, City regionalCenter, City[] cities) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.cities = cities;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
