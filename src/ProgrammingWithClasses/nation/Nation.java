package ProgrammingWithClasses.nation;

public class Nation {

    private String name;
    City[] cities;
    Region[] regions;
    CountryArea[] countryAreas;
    private String capital;

    public Nation(String name,City[] cities, Region[] regions, CountryArea[] countryAreas, String capital) {
        this.name = name;
        this.cities = cities;
        this.regions = regions;
        this.countryAreas = countryAreas;
        this.capital = capital;
    }

    public void showCapitalInfo() {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(capital)) {
                System.out.println("Столица государства " + name + " является город " +
                        cities[i].getName() + " с населением в " + cities[i].getPopulation() + " человек.");
            }
        }
    }

    public void showNumberOfCountryAreas() {
        System.out.println("Количество областей равно - " + countryAreas.length);
    }

    public void showTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < countryAreas.length; i++) {
            totalArea += countryAreas[i].getArea();
        }
        System.out.println("Общая площадь государства равна - " + totalArea);
    }

    public void areaOfEachCountryArea() {
        for (int i = 0; i < countryAreas.length; i++) {
            System.out.println(countryAreas[i].getName() + " область насчитывает площадь в "
                    + countryAreas[i].getArea() + " кв.км.");
        }
    }

    public void showAreasCities() {

    }
}
