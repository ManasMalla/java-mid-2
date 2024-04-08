package com.mycompany.app;

public class Shape {
    int x;
    int y;
    int z;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        this.z = 1;
    }
    public Shape(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int calculate(){
        return x * y * z;
    }
}

class Test1 extends Shape{
    public Test1(int x, int y){
        super(x, y, 1);
    }
    public Test1(int x, int y, int z){
        super(x, y, z);
    }

    @Override
    public int calculate(){
        return ((4*x*y*z)/3);
    }
}
