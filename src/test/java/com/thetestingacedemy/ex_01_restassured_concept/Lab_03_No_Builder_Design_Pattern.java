package com.thetestingacedemy.ex_01_restassured_concept;
//NO design pattern
public class Lab_03_No_Builder_Design_Pattern {
    public void step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("step2");
    }
    public void step3(String name){
        System.out.println("step3");
    }

    public static void main(String[] args) {
        Lab_03_No_Builder_Design_Pattern NDP = new Lab_03_No_Builder_Design_Pattern();
        NDP.step1();
        NDP.step2();
        NDP.step3("raziq");

    }
}
