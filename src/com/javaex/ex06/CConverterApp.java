package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        dollar = 1000000;
        System.out.println("백만원은 " + CConverter.toDoller(dollar) + "달러입니다.");
        
        //100달려를 원으로 출력하기
        won = 100;
        System.out.println("백달러는 " + CConverter.toKWR(won) + "입니다.");
        
    }

}
