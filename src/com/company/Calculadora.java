package com.company;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int res, a, b, Op;
        do{
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplica");
            System.out.println("4.Divida");
            System.out.println("5.Salir");
            Op=sc.nextInt();
            switch(Op){
                case 1:
                    System.out.println("suma \n ");
                    System.out.println ("Ingrese el primer numero");
                    a=sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b=sc.nextInt();
                    res=a+b;
                    System.out.println("\n El resultado es:" +res);
                    break;
                case 2:
                    System.out.println("resta \n");
                    System.out.println ("Ingrese el primer numero");
                    a=sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b=sc.nextInt();
                    res=a-b;
                    System.out.println("El resultado es:" +res);
                    break;
                case 3:
                    System.out.println(" multiplicacion \n");
                    System.out.println ("Ingrese el primer numero");
                    a=sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b=sc.nextInt();
                    res=a*b;
                    System.out.println("El resultado es:" +res);
                    break;
                case 4:
                    System.out.println(" division \n");
                    System.out.println ("Ingrese el primer numero");
                    a=sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b=sc.nextInt();
                    res=a/b;
                    System.out.println("El resultado es:" +res);
                    ;

            }


        }while(Op!=5);

    }
}
