import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Eric", "NZ435623D", 69000.00, "CorpDev");
    }
    @Test
    public void hasDepartment(){
        assertEquals("CorpDev", manager.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(69000.00, manager.getSalary(), 0.0);
    }
    @Test
    public void hasName(){
        assertEquals("Eric", manager.getName());
    }    @Test
    public void hasNINO(){
        assertEquals("NZ435623D", manager.getNINO());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1500.00);
        assertEquals(70500.00, manager.getSalary(), 0.0);
    }
    @Test
    public void canNotRaiseSalary_Negative(){
        manager.raiseSalary(-1500.00);
        assertEquals(69000.00, manager.getSalary(), 0.0);
    }
    @Test
    public void canRetrieveRaise(){
        assertEquals(690.00, manager.payBonus(), 0.0);
    }
    @Test
    public void canChangeName(){
        manager.setName("Claire");
        assertEquals("Claire", manager.getName());
    }    @Test
    public void canNotChangeName_Null(){
        manager.setName(null);
        assertEquals("Eric", manager.getName());
    }
}