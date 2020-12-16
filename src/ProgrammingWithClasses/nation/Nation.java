package ProgrammingWithClasses.nation;

public class Nation {

    private String name;
    private City capital;
    private CountryArea[] countryAreas;

    public Nation(String name, City capital, CountryArea[] countryAreas) {
        this.name = name;
        this.capital = capital;
        this.countryAreas = countryAreas;
    }

    public void showCapitalInfo() {
        System.out.println("Столицей государства " + name  + " является " + capital.getName());
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

    public void showAreasCenters() {
        for (int i = 0; i < countryAreas.length; i++) {
            System.out.println(countryAreas[i].getName() + " область: областной центр - " + countryAreas[i].getCountryAreaCenter().getName());
        }
    }
}
