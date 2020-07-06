/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   double n1, n2, n3, p, i;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        n1 = ler.nextDouble();
        System.out.println("informe o segundo valor");
        n2 = ler.nextDouble();
        System.out.println("informe o terceiro valor");
        n3 = ler.nextDouble();

        if(n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0){
             p = n1 * n2 * n3;
             System.out.println("São pares:"+p);
        }else {
             i = n1 + n2 + n3;
        System.out.println("São impares:" +i);
     }
    } 
}