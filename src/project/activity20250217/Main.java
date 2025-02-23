package project.activity20250217;

import project.activity20250217.persons.LegalEntity;
import project.activity20250217.persons.NaturalPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = scanner.nextInt();

        ArrayList<Person> taxPayers = new ArrayList<>();

        // ATENÇÃO! Lembre-se de sempre usar vírgulas ao interagir com o programa no terminal
        //          caso se depare com erros! O "Scanner" do Java é sensível ao idioma do sistema

        for (int i = 0; i < numberOfTaxPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");

            char type = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Anual income: ");
            double annualIncome = scanner.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenses = scanner.nextDouble();

                NaturalPerson naturalPerson = new NaturalPerson(name, annualIncome, healthExpenses);
                taxPayers.add(naturalPerson);
            } else {
                System.out.print("Number of employees: ");
                int workersAmount = scanner.nextInt();

                LegalEntity legalEntity = new LegalEntity(name, annualIncome, workersAmount);
                taxPayers.add(legalEntity);
            }
        }

        System.out.println("\nTAXES PAID:");

        double totalTaxes = 0;
        for (Person taxPayer : taxPayers) {
            double tax = taxPayer.calculateTax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
            totalTaxes += tax;
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
    }
}
