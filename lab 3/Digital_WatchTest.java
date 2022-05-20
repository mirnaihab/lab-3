import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Digital_WatchTest {

    @Test
    public void test1(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Turned On!",d.On());
        assertEquals("Already turned on",d.On());
    }
    @Test
    void test2() {
        Digital_Watch d = new Digital_Watch();
        assertEquals("Turned On!",d.On());
    }
    @Test
    public void test3(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test4(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Turned On!",d.On());
        assertEquals("Already turned on",d.On());
        assertEquals("it's off",d.Off());
    }
    @Test
    public void test5(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
        d.timer_state = false;
        assertEquals("Accepted",d.Do());
    }

}

