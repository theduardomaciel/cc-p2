package activity3_2025_02_17.persons;

import activity3_2025_02_17.Person;

// Esta classe representa uma entidade legal (empresa) que herda da classe Person.
public final class LegalEntity extends Person {
    int workersAmount;

    public LegalEntity(String name, double annualIncome, int workersAmount) {
        super(name, annualIncome);
        this.workersAmount = workersAmount;
    }

    @Override
    public double calculateTax() {
        double annualIncome = getAnnualIncome();

        if (workersAmount > 10) {
            // Empresas com mais de 10 funcionários pagam 14% de imposto.
            return annualIncome * 0.14;
        } else {
            // Empresas com 10 funcionários ou menos pagam 16% de imposto.
            return annualIncome * 0.16;
        }
    }
}
