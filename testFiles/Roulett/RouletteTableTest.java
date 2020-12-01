package Roulett;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RouletteTableTest {

    RouletteTable table;

    @Before
    public void setUp () throws Exception {
        table = new RouletteTable();
    }

    @Test
    public void defineSplitting() {
        int[] arrray = {0};
        Assert.assertEquals(arrray, table.defineSplitting(Splitting.GREEN));

    }
}