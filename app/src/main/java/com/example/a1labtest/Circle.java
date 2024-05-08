package com.example.a1labtest;

public class Circle extends Shape{

    public Circle(){
        super("Circle");
    }
    public float area(float r){
        float rs=3*1416*r*r;
        return rs;
    }
    public float preimeter(float r){
        float ps= (float) (2*3.1416*r);
        return  ps;
    }
}
