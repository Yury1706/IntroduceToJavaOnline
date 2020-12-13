package ProgrammingWithClasses;

public class Test1 {

    private int firstVariable;
    private int secondVariable;

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public void showVariables() {
        System.out.printf("First variable is %d, second variable is %d", firstVariable, secondVariable);
        System.out.println();
    }

    public void showSumOfVariables() {
        System.out.println("The sum of variables is: " + (firstVariable + secondVariable));
    }

    public void showMaxOfVariables() {
        if (firstVariable > secondVariable) {
            System.out.println("Max value of variables is " + firstVariable);
        } else if (secondVariable > firstVariable) {
            System.out.println("Max value of variables is " + secondVariable);
        } else System.out.println("Variables are equals");
    }
}
