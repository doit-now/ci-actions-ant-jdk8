package com.giaolang.ci.ant.tdd.util;

import static com.giaolang.ci.ant.util.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1115
 */
public class MathUtilTest {
    
    //Nâng cao: dùng tham số hóa tập data cần test. TBA ...
    @Test
    public void getFactorial_ReturnsWell_IfValidArgument() {
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(120, getFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        getFactorial(-5);        
    }
}
