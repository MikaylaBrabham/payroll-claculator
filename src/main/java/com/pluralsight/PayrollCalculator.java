package com.pluralsight;
import java.io.*;

public class PayrollCalculator
{

    public static void main(String[] args)
    {
        System.out.println(System.getProperty("user.dir"));
        // insert a try catch for the file reader and BufferedReader
        try {
            // add a file reader to read employees.csv
            FileReader fileReader = new FileReader("employees.csv");
            //Create a bufferedReader to read file line by line
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }
            //close the bufferedReader
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

   // private class Employee {
    //    private double employeeId;
    //    private String name;
     //   private double hoursWorked;
      //  private double payRate;
    }
//}
