import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bill Douglas", "NZ435623D", 169000.00,
                    "CodeClan", 3000000.00);
    }
    @Test
    public void hasDepartment(){
        assertEquals("CodeClan", director.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(169000.00, director.getSalary(), 0.0);
    }
    @Test
    public void hasName(){
        assertEquals("Bill Douglas", director.getName());
    }    @Test
    public void hasNINO(){
        assertEquals("NZ435623D", director.getNINO());
    }
    @Test
    public void hasBudget(){
        assertEquals(3000000, director.getBudget(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5500.00);
        assertEquals(174500.00, director.getSalary(), 0.0);
    }   @Test
    public void canNotRaiseSalary_Negative(){
        director.raiseSalary(-5500.00);
        assertEquals(169000.00, director.getSalary(), 0.0);
    }
    @Test
    public void canRetrieveRaise(){
        assertEquals(1690.00, director.payBonus(), 0.0);
    }
    @Test
    public void canChangeName(){
        director.setName("Claire");
        assertEquals("Claire", director.getName());
    }    @Test
    public void canNotChangeName_Null(){
        director.setName(null);
        assertEquals("Bill Douglas", director.getName());
    }
}