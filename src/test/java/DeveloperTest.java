
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sara", "SQ12-12", 80000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Sara", developer.getName());

    }@Test
    public void developerHasNiNumber(){
        assertEquals("SQ12-12", developer.getNiNumber());

    }@Test
    public void developerHasSalary(){
        assertEquals(80000.00, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseDevelopersSalary(){
        developer.raiseSalary(10000);
        assertEquals(90000, developer.getSalary(), 0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(800.00, developer.payBonus(), 0);
    }

    @Test
    public void changeName(){
        developer.setName("James");
        assertEquals("James", developer.getName());
    }

}
