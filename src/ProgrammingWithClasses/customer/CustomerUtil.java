package ProgrammingWithClasses.customer;

public class CustomerUtil {

    Customer[] customers;

    public CustomerUtil() {
    }

    public CustomerUtil(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void sortCustomersBySurname() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    Customer currentCustomer = customers[i];
                    customers[i] = customers[j];
                    customers[j] = currentCustomer;
                }
            }
        }
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
        System.out.println();
    }

    public void sortCustomerByNumberOfCreditCard() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getNumberOfCreditCard() > 150000 && customers[i].getNumberOfCreditCard() < 150100) {
                System.out.println(customers[i]);
            }
        }
        System.out.println();
    }
}
