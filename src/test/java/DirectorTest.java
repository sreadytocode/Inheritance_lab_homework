import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Takako", "TO12-12", 100000.00, 80000.00);
    }

    @Test
    public void directorHasName() {
        assertEquals("Takako", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("TO12-12", director.getNiNumber());

    }
    @Test
    public void directorHasSalary(){
        assertEquals(100000.00, director.getSalary(), 0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(80000.00, director.getBudget(), 0);
    }

    @Test
    public void canRaiseAdminsSalary(){
        director.raiseSalary(10000);
        assertEquals(110000.00, director.getSalary(), 0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(2000.00, director.payBonus(), 0);
    }


}
