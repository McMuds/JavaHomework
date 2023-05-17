import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer devDude;

    @Before
    public void before(){
        devDude = new Developer("Kev Ryan", "XD652376C", 60000.99);
    }
    @Test
    public void hasName(){
        assertEquals("Kev Ryan", devDude.getName());
    }
    @Test
    public void hasNINO(){
        assertEquals("XD652376C", devDude.getNINO());
    }
    @Test
    public void hasSalary(){
        assertEquals(60000.99, devDude.getSalary(),0.0);
    }
    @Test
    public void canRaiseSalary(){
        devDude.raiseSalary(1500.00);
        assertEquals(61500.99, devDude.getSalary(), 0.0);
    }    @Test
    public void canNotRaiseSalary_Negative(){
        devDude.raiseSalary(-1500.00);
        assertEquals(60000.99, devDude.getSalary(), 0.0);
    }
    @Test
    public void canRetrieveRaise(){
        assertEquals(600.00, devDude.payBonus(), 0.01);
    }
    @Test
    public void canChangeName(){
        devDude.setName("Claire");
        assertEquals("Claire", devDude.getName());
    }    @Test
    public void canNotChangeName_Null(){
        devDude.setName(null);
        assertEquals("Kev Ryan", devDude.getName());
    }
}


