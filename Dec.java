

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
