package Dav9;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {

    @Test
    public void returnAbc() {
        TestClass x = new TestClass();
        assertEquals("Abc",x.ReturnAbc());
    }

    @Test
    public void return4() {
        TestClass y = new TestClass();
        assertEquals(4,y.Return4());
    }
}