package com.pb;

import org.junit.Test;

public class JunitTest {

    @Test
    public void testingIfBothFrameworksCanExistInTheSameCodebase(){
        JavaGreeter jg = new JavaGreeter();
        assert jg.greet().equals("Hello from Java");
    }
}
