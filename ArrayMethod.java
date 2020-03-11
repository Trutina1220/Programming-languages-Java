package com.company;

import java.util.Scanner;

public class ArrayMethod {
    public static void inputArray(int lenght) {
        int[] myNum = new int[lenght];
        Scanner myobj = new Scanner(System.in);

        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter number " + (i + 1) + " : ");
            myNum[i] = myobj.nextInt();
        }

        for (int i = 0; i < lenght; i++) {
            System.out.print(myNum[i] + ", ");
        }
        System.out.println('\n');


    }

    public static void checkElement(int[] a, int element) {
        int num = element;
        int[] myNum = a;

        for (int i = 0; i < myNum.length; i++) {
            ;
            if (num != myNum[i]) {
                ;
            } else {
                System.out.println(num + " is present in the system");
                break;
            }
        }
    }

    public static void checkingNumberType(int[] a) {
        int[] myNum = a;

        for (int i = 0; i < 5; i++) {
            if (myNum[i] > 0) {
                System.out.println(myNum[i] + " is a positive number");
                if (myNum[i] % 2 != 0) {
                    System.out.println(myNum[i] + " is an odd number ");
                } else {
                    System.out.println(myNum[i] + " is an even number");
                }
            } else if (myNum[i] < 0) {
                System.out.println(myNum[i] + " is a negative number");

                if (myNum[i] % 2 != 0) {
                    System.out.println(myNum[i] + " is an odd number ");
                } else {
                    System.out.println(myNum[i] + " is an even number");
                }
            }

        }
    }

    public static void sum(int[] a) {
        int[] myNum = a;
        int sum = 0;

        for (int i = 0; i < myNum.length; i++) {
            sum += myNum[i];
        }
        System.out.println("The sum is " + sum);
    }

    public static void smallHigh(int[] a) {

        int[] myNum = a;
        int highest = 0;

        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] > highest) {
                highest = myNum[i];
            }
        }
        System.out.println("The Highest number is " + highest);

        int smallest = 0;

        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] < smallest) {
                smallest = myNum[i];
            }
        }
        System.out.println("The smallest number is " + smallest);
    }


    public static void checkElementFront(int[] a) {
        int[] myNum = a;
        for (int i = 0; i < myNum.length; i++) {
            for (int j = i + 1; j < myNum.length; j++) {
                if (myNum[i] == myNum[j]) {
                    System.out.println(myNum[i] + " there's a same number inside the data");

                } else {
                    continue;
                }

            }
        }
    }

    public static void checkElementBack(int[] a) {
        int[] myNum = a;

        for (int i = myNum.length - 1; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (myNum[i] == myNum[j]) {
                    System.out.println(myNum[i] + " there's a same number inside the data");

                } else {
                    continue;
                }
            }
        }
    }

    public static void split(int[] a) {
        int[] myNum = a;

        int[] array1 = new int[a.length / 2];
        int[] array2 = new int[a.length / 2];

        int middle = 0;
        middle = myNum.length / 2;

        for (int i = 0; i < myNum.length - middle; i++) {
            array1[i] = myNum[i];
            array2[i] = myNum[i + middle];
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }

        System.out.println("");


        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
    }

    public static void aditive(int[] a) {
        int[] myNum = a;
        int highest = 0;
        int secondHighest = 0;
        int additive = 0;

        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] > highest) {
                highest = myNum[i];
            }


        }

        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] != highest) {
                if (myNum[i] > secondHighest) {
                    secondHighest = myNum[i];
                }
            }
        }

        for (int i = 0; i < myNum.length; i++) {
            if (secondHighest + myNum[i] == highest) {
                additive = myNum[i];
            }
        }


        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] == highest) {
                for (int j = myNum.length - 1; j > i + 1; j--) {
                    myNum[j] = myNum[j - 1];
                }

                myNum[i] = secondHighest;
                myNum[i + 1] = additive;
            }
        }

        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i] + " , ");
        }

    }

    public static void shifting(int[] a) {
        int[] myNum = a;

        int lastNumber = myNum[myNum.length-1] ;

        for(int i = myNum.length-1 ; i >0;i--) {
            myNum[i] = myNum[i-1];
        }

        myNum[0] = lastNumber;
//
             for (int i = 0 ;i < myNum.length;i++)
        {
            System.out.print(myNum[i]+" , ");
        }

    }

    public static void sort(int[]a)
    {
        int[] myNum = a;
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


