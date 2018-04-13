/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geussinggame;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class GeussingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hello world");

//      Scan in string after hello world 
//      NOTE: it will be on the next line wating for input
        Scanner s = new Scanner(System.in);
//      Print text scanned 's' and print it on next line
        
        String letter = "g";
        
        if (s.nextLine().equals(letter)){
            
            System.out.println("Got correct letter " + letter);
            
        }else{
            System.out.println("You got it wrong " + letter);
            
        }
        

    }

}
