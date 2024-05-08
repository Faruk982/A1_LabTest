package com.example.a1labtest;

public class Triangle extends Shape{
    public Triangle(){
        super("Triangle");
    }
    public float area(float a,float b){
        float d= (float) (0.5*a*b);
        return  d;
    }
    public float perimeter(float b){
        float d=3*b;
        return d;
    }
}
