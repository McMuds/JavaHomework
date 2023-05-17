import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DBA;

import static org.junit.Assert.assertEquals;

public class DBATest {
    DBA dbaDude;

    @Before
    public void before(){
        dbaDude = new DBA("Andy Green", "XD352376C", 50000.99);
    }
    @Test
    public void hasName(){
        assertEquals("Andy Green", dbaDude.getName());
    }
    @Test
    public void hasNINO(){
        assertEquals("XD352376C", dbaDude.getNINO());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.99, dbaDude.getSalary(),0.0);
    }
    @Test
    public void canRaiseSalary(){
        dbaDude.raiseSalary(1500.00);
        assertEquals(51500.99, dbaDude.getSalary(), 0.0);
    }
    @Test
    public void canRetrieveRaise(){
        assertEquals(500.00, dbaDude.payBonus(), 0.01);
    }
}
