import org.junit.Assert;
import org.junit.Test;

/**
 * Created by igor on 21.07.17.
 */
public class TestPI {
    @Test
    public void shouldReturn5digits() {
        GetPIExample example = new GetPIExample();
        String result = example.getPI(5);
        Assert.assertEquals("3,14159", result);
    }
    @Test
    public void shouldReturn6digits() {
        GetPIExample example = new GetPIExample();
        String result = example.getPI(6);
        Assert.assertEquals("3,141593", result);
    }
}
