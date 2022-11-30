package staff;

public abstract class Employee {

    protected String name;
    private String niNumber;
    protected Double salary;

    protected Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Double raiseSalary(double increment){

        return this.salary += Math.abs(increment);
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        this.name = name;
    }
}
