import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class cofee_machineTest {
    @Test
    public void test1() {
        coffee_machine c = new coffee_machine();
        assertEquals("turn the machine on", c.addMoney(30));
    }
    @Test
    public void test2() {
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on", c.machineOn());
    }
    @Test
    public void test3() {
        coffee_machine c = new coffee_machine();
        c.power = true;
        assertEquals("Error!", c.machineOn());
    }
    @Test
    public void test4() {
        coffee_machine c = new coffee_machine();
        c.machineOn();
        c.machineOff();
        assertEquals("turn the machine on", c.addMoney(30));
    }
    @Test
    public void test5() {
        coffee_machine c = new coffee_machine();
        c.machineOn();
        assertEquals("money is added ", c.addMoney(30));
    }

    @Test
    public void test6(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.machineOn());
        assertEquals("money is added ",c.addMoney(30));
        assertEquals("Lights off" + "Power off",c.machineOff());
    }
    @Test
    public void test7(){
        coffee_machine c = new coffee_machine();
        assertEquals("turn the machine on",c.makingCoffee(2));
    }
    @Test
    public void test8(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.machineOn());
        assertEquals("money is added ",c.addMoney(30));
        assertEquals(2+ " Coffee is made",c.makingCoffee(3));
    }
    @Test
    public void test9(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.machineOn());
        assertEquals("money is added ",c.addMoney(30));
        assertEquals(2+ " Coffee is made",c.makingCoffee(4));
    }

}
