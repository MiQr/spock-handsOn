package com.pb;

import org.junit.Test;

public class GreeterTest {

    @Test
    public void testingIfBothFrameworksCanExistInTheSameCodebase(){
        JavaGreeter jg = new JavaGreeter();
        assert jg.greet().equals("Hello from Java");
    }
}
