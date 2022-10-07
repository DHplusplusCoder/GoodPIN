/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drew
 */
public class GoodPin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //(i)Create a function that will test if a string is a valid PIN or not via a regular expression.

//A valid PIN has:


	
//Exactly 4 or 6 characters.
	
//Only numeric characters (0-9).
	
//No whitespace.

    String PIN = "12502";
    if(PIN.length < 4 || PIN.length > 6)
    {
        System.out.println("Not a good pin");
    }
    for(int j = 0;  j < PIN.length(); j++)
    {
        if(PIN.charAt[j] = " ")
        {
            System.out.println("Not a good pin");
        }
        if(PIN.charAt[j] = "a")
        {
            System.out.println("Not a good pin");
        }
        
    }
    
    }
    
}
