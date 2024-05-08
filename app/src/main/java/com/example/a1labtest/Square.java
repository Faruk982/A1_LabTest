package com.example.a1labtest;

public class Square extends Shape{
    public Square(){
        super("Square");
    }
    public float area(float a){
        return (a*a);
    }
    public float perimeter(float a){
        return (4*a);
    }
}
