package project.activity20250217;

public abstract class Person {
    String name;
    double annualIncome;

    public Person(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String toString() {
        return "Name: " + name + "\nAnnual Income: " + annualIncome;
    }

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public abstract double calculateTax();
}
