package com.tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class Tests {
    private static Logger logger = LogManager.getLogger(Tests.class);
    public static void main(String[] Args){

//        reverseString2("Vinod");
//        swap(10,11);
//        compareCharacters('1','1');
//        isPrime(1001);
//        Fibonac(10);
//        palandram("rarq");
//        removeWhitespaces("ads ssas   #dd");
//        sortingArray();
//        Anagrams("Hello","lleoh");
//        factorialofGivenNumber(5);
//        secondLagestNumberInTheArray();
//        dateInSpecifiFormat();
        characterCountInString1("aabbadccde");


    }
    public static void characterCountInString1(String str){
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c:charArray){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Set<Character> set = map.keySet();
        for (char c: set){
            System.out.println(c + " " + map.get(c));
        }

    }
    public static void dateInSpecifiFormat(){
        String pattern = "mm-dd-yyyy";
        SimpleDateFormat formater = new SimpleDateFormat(pattern);
        System.out.println(formater.format(new Date()));
    }
    public static void secondLagestNumberInTheArray(){
        int[] arr1 ={1,2,3,45,5,3,6,7,23,45};
        int max1 = arr1[0];
        int max2 = arr1[0];
        for (int i : arr1){
            if(max1<i){
                max2 = max1;
                max1=i;
            }
            if ((max1>i)&&(max2<i)){
                max2=i;

            }
        }
        System.out.println("second heighest: " + max2);


    }
    public static void factorialofGivenNumber(int n){
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return(n * factorial(n-1));
        }
    }
    public static void Anagrams(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println(" Not anagrams");
        }
    }
    public static void sortingArray(){
        int[] array = {1, 2, 3, -1, -2, 4};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
    public static void removeWhitespaces(String s){
        StringBuffer output = new StringBuffer();
        char[] charArray = s.toCharArray();
        for (char c:charArray){
            if (!Character.isWhitespace(c)){
                output.append(c);
            }
        }

        System.out.println(output);

    }
    public static void palandram(String s){
        boolean found = true;
        for (int i=0;i<s.length()/2;i++){
            System.out.print("first char : "+s.charAt(i) );
            System.out.println(" last char : "+s.charAt(s.length()-i-1) );
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                found = false;
                break;
            }
        }

        if (found){
            System.out.println("Give string is palandram");
        }else {
            System.out.println("not a palandram");
        }
    }
    public static void Fibonac(int count){
        int a =0, b=1, c=1;
        for(int i=1;i<=count;i++){
            System.out.print(a + ",");
            a=b;
            b=c;
            c= a+b;
        }

    }
    public static void isPrime(int a){
        if (isPrimeNumber(a)){
            System.out.println("is prime");
        }else{
            System.out.println("is not prime");
        }

    }
    public static boolean isPrimeNumber(int a){
        if (a ==0 || a == 1){
            return false;
        }else if (a ==2){
            return  true;
        }
        for (int i=2;i<=a/2;i++){
            if (a%i == 0){
                return false;
            }
        }
        return  true;
    }
    public static void compareCharacters(char a , char b){
        int val =  Character.compare(a,b);
        if (val == 0){
            System.out.println("Both chars are "+"equal");
        }else if(val == -1){
            System.out.println("Both chars are "+"not equal");
        }

    }
    public static void swap(int a , int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }


    public static void reverseString1(String str){
        StringBuffer str1 = new StringBuffer(str).reverse();
        System.out.println(str1);

    }
    public static void reverseString2(String str){
       char[] arr = str.toCharArray();
       for (int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]);
       }
    }
}
