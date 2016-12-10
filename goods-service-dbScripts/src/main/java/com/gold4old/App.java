package com.gold4old;


import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Random randomGenerator = new Random();
        int randomInt = 0;

            randomInt = randomGenerator.nextInt(100000);
            System.out.println(randomInt);


    }
}
