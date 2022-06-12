/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dec;


public class Dec {
    
    public void dec_num(int value)
    {
       for(int i=value ; i>=1 ; i--) 
           System.out.println(i);
    }

    public static void main(String[] args) {
        Dec X = new Dec();
        X.dec_num(5);
    }
}
