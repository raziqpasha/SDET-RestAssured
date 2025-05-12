package com.thetestingacedemy.ex_04_TestNGExamples.ex_01_restassured;

public class Lab_04_Builder_Pattern {
        public Lab_04_Builder_Pattern step1(){
            System.out.println("step1");
            return this;
        }
        public Lab_04_Builder_Pattern step2(){
            System.out.println("step2");
            return this;
        }
        public Lab_04_Builder_Pattern step3(String name){
            System.out.println("step3");
            return this;
        }

        public static void main(String[] args) {
            Lab_04_Builder_Pattern NDP = new Lab_04_Builder_Pattern();
            NDP.step1().step2().step3("raziq");

        }
    }

