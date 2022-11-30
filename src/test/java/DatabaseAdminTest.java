import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Maya", "MQ12-12", 70000.00);
    }

    @Test
    public void adminHasName() {
        assertEquals("Maya", admin.getName());
    }

    @Test
    public void adminHasNiNumber(){
        assertEquals("MQ12-12", admin.getNiNumber());

    }@Test
    public void adminHasSalary(){
        assertEquals(70000.00, admin.getSalary(), 0);
    }

    @Test
    public void canRaiseAdminsSalary(){
        admin.raiseSalary(10000);
        assertEquals(80000, admin.getSalary(), 0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(700.00, admin.payBonus(), 0);
    }

    @Test
    public void changeName(){
        admin.setName("James");
        assertEquals("James", admin.getName());
    }

}
