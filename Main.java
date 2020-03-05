package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        int mask = '\u0020';
//        int uc = 'F' ;
//        int lc = uc | mask ;
//
//        System.out.printf("%c",lc);
//
//        System.out.println();
//
//
//
////        Reverse an array
//        int[] x = {4,99,3,6,5};
//
//        int[] y = new int [x.length];
//
//
//
//        for (int i = 0 ; i<x.length;i++) {
//
//            y[i] = x[x.length-i-1] ;
//
//        }
//
//        System.arraycopy(y, 0, x, 0, x.length);
//
//
//
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));
//
//// Ascii to Int
//        int mask3 = '\u00CF';
//        char ascii = '5';
//        int integer = ascii & mask3;
//
//        System.out.println(integer);
//
//
////        Int to ASCII
//        int mask4 = '\u0030';
//        int integers = 0;
//        int asciis = integers | mask4;
//
//        System.out.println(asciis);

//      NUMBER 1 :  store an input from user to an array
        int[] myNum = new int[8];
        Scanner myobj = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter number " + (i + 1) + " : ");
            myNum[i] = myobj.nextInt();
        }

        for (int i = 0 ; i < 4 ; i++)
        {
            System.out.print(myNum[i]+", ");
        }
        System.out.println('\n');

        System.out.println("Enter number " +  " : ");

//
////    NUMBER 2 :    Check if user input is in the array
//
//        int num = myobj.nextInt();
//
//        for (int i = 0; i < 5; i++) {
//;
//            if (num != myNum[i])
//            {
//                ;
//            }
//            else
//            {
//                System.out.println("It is present in the system");
//                break;
//            }
//        }
//
//
////   NUMBER 3 :   checking positive , negative , odd , and even number
//
//        for (int i = 0 ; i < 5 ; i++)
//        {
//            if (myNum[i] > 0 )
//            {
//                System.out.println(myNum[i] +" is a positive number");
//                if (myNum[i]%2 != 0)
//                {
//                    System.out.println(myNum[i] + " is an odd number ");
//                }
//                else
//                {
//                    System.out.println(myNum[i]+" is an even number");
//                }
//            }
//
//            else if (myNum[i] < 0)
//            {
//                System.out.println(myNum[i]+ " is a negative number");
//
//                if (myNum[i]%2 != 0)
//                {
//                    System.out.println(myNum[i] + " is an odd number ");
//                }
//                else
//                {
//                    System.out.println(myNum[i]+" is an even number");
//                }
//            }
//
//        }

// //  NUMBER 4 : finding the sum

//        int sum = 0 ;
//
//        for (int i = 0 ; i < 5 ; i++)
//        {
//            sum += myNum[i];
//        }
//        System.out.println("The sum is "+ sum);

////      NUMBER 5 :  finding the largest and the smallest number
//
//        int highest = 0 ;
//
//        for (int i = 0 ; i < 5 ; i++)
//        {
//            if (myNum[i] > highest)
//            {
//                highest = myNum[i];
//            }
//        }
//        System.out.println("The Highest number is "+highest);
//
//        int smallest = 0 ;
//
//        for (int i = 0 ; i < 5 ; i++)
//        {
//            if (myNum[i] < smallest)
//            {
//                smallest = myNum[i];
//            }
//        }
//        System.out.println("The smallest number is "+smallest);

//// NUMBER 6:  checking the same number front and backwards
//
//        for(int i = 0 ; i<5; i++)
//        {
//            for(int j =i+1 ; j<5; j++)
//            {
//                if (myNum[i]== myNum[j])
//                {
//                    System.out.println(myNum[i]+ " there's a same number inside the data");
//
//                }
//                break;
//            }
//        }

//        for(int i = 5 ; i>0; i--)
//        {
//            for(int j =i-1 ; j>0; j--)
//            {
//                if (myNum[i]== myNum[j])
//                {
//                    System.out.println(myNum[i]+ " there's a same number inside the data");
//
//                }
//                break;
//            }
//        }

////     NUMBER 7:   take the middle and split it into 2 array
//
//        int [] array1 = new int[2];
//        int [] array2 = new int[2];
//
//        int middle = 0 ;
//        middle = myNum.length/2;
//
//        for(int i = 0 ; i<myNum.length-middle;i++)
//        {
//            array1[i] = myNum[i];
//            array2[i] = myNum[i+middle];
//        }
//
//        for (int i = 0 ; i < array1.length ; i++)
//        {
//            System.out.print(array1[i]+", ");
//        }
//
//        System.out.println("");
//
//
//        for (int i = 0 ; i < array2.length ; i++)
//        {
//            System.out.print(array2[i]+", ");
//        }


////   NUMBER 8:   second highest + aditive
//        int highest = 0 ;
//        int secondHighest = 0;
//        int additive = 0 ;
//
//        for (int i = 0 ; i < 4 ; i++)
//        {
//            if (myNum[i] > highest)
//            {
//                highest = myNum[i];
//            }
//
//
//        }
//
//        for (int i = 0 ; i < 4 ; i++)
//        {
//            if (myNum[i] != highest)
//            {
//                if (myNum[i] > secondHighest)
//                {
//                    secondHighest = myNum[i];
//                }
//            }
//        }
//
//        for (int i = 0 ; i < 4 ;i++)
//        {
//            if (secondHighest+myNum[i] == highest)
//            {
//                additive = myNum[i];
//            }
//        }
//
//
//
//
//     for (int i=0 ; i<myNum.length;i++)
//     {
//         if (myNum[i] == highest)
//         {
//             for (int j = myNum.length-1; j >i+1;j--)
//             {
//                 myNum[j] = myNum[j-1];
//             }
//
//            myNum[i] = secondHighest;
//            myNum[i+1] =additive;
//             }
//     }
//
//     for (int i = 0 ;i < myNum.length;i++)
//        {
//            System.out.print(myNum[i]+" , ");
//        }

////   NUMBER 9:     shifting number
//
//        int lastNumber = 0 ;
//        int counter = 0 ;
//
//        for(int i = myNum.length-1 ; i >0;i--) {
//            myNum[i] = myNum[i-1];
//        }
//
//        for(int i = myNum.length-1 ; i >0;i--) {
//            if (myNum[i] > 0 ) {
//                lastNumber = myNum[i];
//                myNum[i] = 0;
//                break;
//            }
//        }
//
//        myNum[0] = lastNumber;
//
//             for (int i = 0 ;i < myNum.length;i++)
//        {
//            System.out.print(myNum[i]+" , ");
//        }






//     NUMBER 10:   sorting ascending


        int temp = 0 ;

        for (int i = 0 ; i < myNum.length;i++) {

                for (int j = 0; j < (myNum.length - i - 1); j++) {

                    if (myNum[j] > 0){

                        if (myNum[j] > myNum[j + 1]) {
                            temp = myNum[j];
                            myNum[j] = myNum[j + 1];
                            myNum[j + 1] = temp;

                        }

                }
                }

        }
                     for (int i = 0 ;i < myNum.length;i++) {
                         if (myNum[i] > 0) {
                             System.out.print(myNum[i] + " , ");
                         }
                     }



     }

    }

