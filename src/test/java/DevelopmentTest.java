import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DevelopmentTest {

    @Test
    public void decrement() {
        int result = 8;
        Assert.assertEquals(result, Development.decrement(9));
    }
}