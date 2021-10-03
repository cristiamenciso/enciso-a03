package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

public class StatisticsCalculator {
    // get user input

    public List<String> getInput() {
        List<String> list = new ArrayList<>();
        String end = "done";
        String number;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = in.nextLine();
            if(!isNumeric(number) && !number.equals("done")) {
                System.out.print("This is not a valid number. Try again\n");
            }
            else if (isNumeric(number)) {
                list.add(number);
            }

        } while (!number.equals("done"));
       return list;
    }

    public void displayNumbers(List<String> list) {
        System.out.print("Numbers: ");
        for(int i = 0; i < (list.size()); i++) {
            System.out.printf("%s ", list.get(i));
        }
    }

    public boolean isNumeric(String str) {
        if(str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public BigDecimal average(List<String> list) {
        BigDecimal total = new BigDecimal("0");
        BigDecimal count = new BigDecimal(list.size());
        for(String str : list) {
            BigDecimal num = new BigDecimal(str);
            total = total.add(num);
        }
        return total.divide(count,1, RoundingMode.HALF_UP);
    }


    public BigDecimal minimum(List<String> list) {
        List<BigDecimal> big = new ArrayList<>();
        for(String str : list) {
            BigDecimal number = new BigDecimal(str);
            big.add(number);
        }

        return Collections.min(big);
    }


    public BigDecimal maximum(List<String> list) {
        List<BigDecimal> big = new ArrayList<>();
        for(String str : list) {
            BigDecimal number = new BigDecimal(str);
            big.add(number);
        }

        return Collections.max(big);

    }



    public BigDecimal standardDeviation(List<String> list) {
        BigDecimal length = new BigDecimal(list.size());
        BigDecimal mean = average(list);
        List<BigDecimal> big = new ArrayList<>();
        for(String str : list) {
            BigDecimal number = new BigDecimal(str);
            big.add(number);
        }
        BigDecimal part = new BigDecimal("0");
        for(int i = 0; i < big.size(); i++) {
            part = part.add(big.get(i).subtract(mean).pow(2));
        }
        BigDecimal result = part.divide(length, 2, RoundingMode.HALF_UP);
        MathContext mc = new MathContext(5);

        return result.sqrt(mc);


    }
    public void printResults(BigDecimal avg, BigDecimal min, BigDecimal max, BigDecimal std) {
        System.out.println("the average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.println("The standard deviation is " + std);
    }



}
