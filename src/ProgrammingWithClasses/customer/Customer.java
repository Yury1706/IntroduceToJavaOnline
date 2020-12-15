package ProgrammingWithClasses.customer;

public class Customer {

    // класс CustomerUtil агрегирует массив данного типа

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int numberOfCreditCard;
    private int bankAccountNumber;

    public Customer() {

    }

    public Customer(int id, String surname, String name, String patronymic, String address) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberOfCreditCard = 0;
        this.bankAccountNumber = 0;
    }

    public Customer(int id, String surname, String name, String patronymic, String address, int numberOfCreditCard, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", address = '" + address + '\'' +
                ", numberOfCreditCard = " + numberOfCreditCard +
                ", bankAccountNumber = " + bankAccountNumber +
                '}';
    }
}
