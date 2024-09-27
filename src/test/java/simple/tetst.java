package simple;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tetst {
    @Test
    public void additionTest() {
        int result = 1 + 1;
        System.out.println("Calculating: 1 + 1");
        Assert.assertEquals(result, 2, "1 + 1 should be equal to 2");
    }


}
