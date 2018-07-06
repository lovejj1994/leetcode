import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PowFunctionTest {

    @Test
    @DisplayName("V1.0")
    void test() {

//
        PowFunction powFunction = new PowFunction();
        assertEquals(1024.00000, powFunction.myPow(2.00000, 10));
//        powFunction = new PowFunction();
        assertEquals(9.26100, powFunction.myPow(2.10000, 3));
//        powFunction = new PowFunction();
        assertEquals(0.25000, powFunction.myPow(2.00000, -2));
        assertEquals(0.5, powFunction.myPow(2.00000, -1));
        assertEquals(64, powFunction.myPow(2.00000, 6));
        assertEquals(32, powFunction.myPow(2.00000, 5));
//        powFunction = new PowFunction();
//        assertEquals(0.25000, powFunction.myPow(34.00515
//                , -3));
    }

}
