package management;

import staff.Employee;

public class Director extends Employee {
    private Double budget;


    public Director(String name, String niNumber, Double salary, Double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public Double payBonus(){
        return this.salary * 0.02;
    }

}

