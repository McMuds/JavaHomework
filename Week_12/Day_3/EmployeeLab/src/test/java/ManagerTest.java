import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager ("Eric", "NZ435623D", 69000.00, "CorpDev");
    }

    @Test
    public void hasDepartment(){
        assertEquals("CorpDev", manager.getDeptName());
    }
}
