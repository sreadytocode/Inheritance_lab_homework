import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Georgi", "AB12-34", 50000.00, "Quantum Biology");
    }

    @Test
    public void doesManagerHaveAName(){
        assertEquals("Georgi", manager.getName());
    }

    @Test
    public void doesManagerHaveNiNumber(){
        assertEquals("AB12-34", manager.getNiNumber());
    }

    @Test
    public void doesManagerHaveASalary(){
        assertEquals(50000, manager.getSalary(), 0);
    }

    @Test
    public void doesManagerDeptName(){
        assertEquals("Quantum Biology", manager.getDeptName());
    }

    @Test
    public void canRaiseManagersSalary(){
        manager.raiseSalary(-10000);
        assertEquals(60000, manager.getSalary(), 0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(500.00,manager.payBonus(), 0);
    }

    @Test
    public void changeName(){
        manager.setName("James");
        assertEquals("James", manager.getName());
    }

}
