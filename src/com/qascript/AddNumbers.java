package com.qascript;

//public class AddNumbers {
//
//    public static void main(String args[]){
//
//        addNumbers(4,5);
//        addNumbers(3,5);
//        addNumbers(9,1);
//
//
//    }
//
//    public static void addNumbers(int num1,int num2){
//        // int num1 = 4;
//        // int num2 = 6;
//        int res = num1 + num2;
//        System.out.println("Addition of 2 numbers: "+ res);
//    }
//}

public class AddNumbers {

    public static void main(String args[]){

        addNumbers(4,5);
        addNumbers(3,5);
        addNumbers(9,1);

        int result = addNumbers(6,5);
        int output = result + 5;
        System.out.println(output+1);



    }

    public static int addNumbers(int num1,int num2){
        // int num1 = 4;
        // int num2 = 6;
        int res = num1 + num2;
        System.out.println("Addition of 2 numbers: "+ res);
        return res;
    }
}
