package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.prefs.InvalidPreferencesFormatException;

public class KarvonenRate {
    private int age;
    private int restRate;

    // make get and set methods for variables

    public void setAge(int age) {
        this.age = age;
    }

    public void setRestRate(int restRate) {
        this.restRate = restRate;
    }

    public int getAge() {
        return age;
    }

    public int getRestRate() {
        return restRate;
    }
    // Method to validate user input.
    public void readUserInput() {
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("What is your age? ");
                setAge(in.nextInt());
                System.out.print("What is your resting heart rate? ");
                setRestRate(in.nextInt());
                if((Integer.toString(getAge()).matches("[A-Z]+")) || (Integer.toString(getRestRate()).matches("[A-Z]+")))
                    throw new InputMismatchException();
                break;
            }
                catch(InputMismatchException e) {
                    in.next();
                    System.out.println("Sorry, that's not a valid input.");
                }
        }

    }

    // method to print table
    public void printTable(int age, int restRate) {
        double intensity = 55;
        double target;
        System.out.println("Resting pulse: " + restRate + "    Age: " + age);
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");
        while (intensity < 96) {
            target = calculations(age, restRate, intensity);
            System.out.println((int)(intensity) + "% | " + (int)(target) + " bpm");
            intensity += 5;
        }
    }

    // method to calculate heart rate for table
    public double calculations(int age, int restRate, double intensity) {
        return Math.round((((220 - age) - restRate) * (intensity)/ 100) + restRate);
    }
}
