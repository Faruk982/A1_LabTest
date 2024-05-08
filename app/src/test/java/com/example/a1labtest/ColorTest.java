package com.example.a1labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class ColorTest extends TestCase {
@Test
    public void testRed(){
    Red red=new Red();
    assertEquals("Red",red.Showcolor());
}
public void testGreen(){
    Green green=new Green();
    assertEquals("Green",green.Showcolor());
}
}