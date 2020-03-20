package com.testci.app;

/**
 * Hello world!
 *
 */
public class App 
{

    public int basicSum(int a, int b){
        return (a+b);
    }



    public static void main( String[] args ){
        App ap = new App();
        System.out.println(ap.basicSum(5,3));

    }
}
