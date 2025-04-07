package activity3_2025_02_17.persons;

import activity3_2025_02_17.Person;

public class NaturalPerson extends Person {
    double healthExpenses;

    public NaturalPerson(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses > 0 ? healthExpenses : 0;
    }

    public double calculateTax() {
        double annualIncome = getAnnualIncome();

        if (annualIncome < 20000) {
            // Pessoas cuja renda foi abaixo de 20000,00 pagam 15% de imposto.
            // Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
            return annualIncome * 0.15 - healthExpenses * 0.5;
        } else {
            // Pessoas com renda de 20000,00 em diante pagam 25% de imposto.
            return annualIncome * 0.25 - healthExpenses * 0.5;
        }
    }
}
