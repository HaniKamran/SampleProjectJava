package com.mycompany.stringpermutation;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

   // We have a method that returns a boolean if the input of the two strings are permutations of each other
    public static boolean strPerm(String str1, String str2)
    {
        boolean isTrue = false;
        
        // This makes it so we can compare the characters without the worry of uppercase or lowercase
        char[] strOne = str1.toCharArray();
        
        // This sorts the array
        Arrays.sort(strOne);
        
        // This makes it so we can compare the characters without the worry of uppercase or lowercase
        char[] strTwo = str2.toCharArray();
        
        // This sorts the array
        Arrays.sort(strTwo);
        
        //This makes sure the lengths of the two strings are equal to each other
        if(strOne.length != strTwo.length)
        {
            isTrue = false;
        }
        else
        {
            // This goes and sees if each index of the two strings are equal to each other.
            // If not then it returns false
            for(int index = 0; index < strOne.length; index++)
            {
                isTrue = strOne[index] == strTwo[index];
            }
        }
        
        //returns whether the strings are permutations of each other
        return isTrue;
    }

    public static void main(String[] args) 
    {
        // Need this to get user input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in first string");
        String str1 = sc.nextLine();
        
        System.out.println("Type in second string");
        String str2 = sc.nextLine();

        // We assign a boolean to the result of the strPerm method
        boolean strPer = strPerm(str1, str2);
        
        if(strPer == true)
        {
            System.out.println("The two strings are permutations of each other.");
        }
        else
        {
            System.out.println("The two strings are not permutations.");
        }
        
    }
}
