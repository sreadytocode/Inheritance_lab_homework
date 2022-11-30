import management.Director;
import management.Manager;
import staff.Employee;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Employee manager = new Manager("Georgi", "AB12-34", 50000.00, "Quantum Biology");
        Employee developer = new Developer("Sara", "SQ12-12", 80000.00);
        Employee admin = new DatabaseAdmin("Maya", "MQ12-12", 70000.00);
        Employee director = new Director("Takako", "TO12-12", 100000.00, 80000.00);

        ArrayList<Employee> allStaff = new ArrayList<>();
        allStaff.add(manager);
        allStaff.add(developer);
        allStaff.add(admin);
        allStaff.add(director);

    }
}
