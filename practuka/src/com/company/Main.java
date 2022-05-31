package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 0;
        double eqq[] = new double[3];
        System.out.println("Ведіть число");
        for (int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()){
                eqq[i]= sc.nextDouble();
                if(eqq[i]>a){
                    a = eqq[i];
                }

            }else {
                System.out.println("число не дробове");
                break;
            }

        }
        System.out.println("найбільше "+a);
    }
}
