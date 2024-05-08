package com.example.a1labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class ShapeTest extends TestCase {
  @Test
    public void testSquare(){
      Square square=new Square();
      float d=4;
      assertEquals("Square",square.name);
      assertEquals(square.area(4),d*d);
  }
}