package com.github.ef741741;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class triangle2Test {
    @Test
    public void getType() throws Exception {
        triangle triang = new triangle(5, 10, 5);

        // Act
        String result = triang.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
