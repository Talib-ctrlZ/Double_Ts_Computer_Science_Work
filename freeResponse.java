import java.util.Scanner;

// import javax.swing.text.Style;

import java.time.LocalDate;

public class freeResponse{
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        // Part 1
        System.out.println("What is your First Name? ");
        String Name = myObj.nextLine();

        // Space
        System.out.println("");

        System.out.println("Hello " + Name + " nice to meet you!");

        // Part 2
        // Setting up variables and text storing
        System.out.println("Type your quote.");
        String Quote = myObj.nextLine();
        System.out.println("Who said it?");
        String Who = myObj.nextLine();

        // Space
        System.out.println("");

        // Print out
        System.out.println(Who + " says, " +"\""+ Quote + "\"");

        // Space
        System.out.println(""); 

        // Part 3
        System.out.println("Enter a noun:");
        String Noun = myObj.nextLine();
        System.out.println("Enter a verb:");
        String Verb = myObj.nextLine();
        System.out.println("Enter an adjective:");
        String Adjective = myObj.nextLine();
        System.out.println("Enter an adverb:");
        String Adverb = myObj.nextLine();
        
        // Space
        System.out.println("");

        System.out.println("Why did the " + Adjective + " " + Noun + " " + Verb + " across the road " + Adverb + "? " + " To get to the other side!");

        // Space
        System.out.println(""); 

        // Part 4 make sure to use int and nextInt
        System.out.println("What is the first number?");
        int firstNumber = myObj.nextInt();
        System.out.println("What is the second number?");
        int secondNumber = myObj.nextInt();

        // Space
        System.out.println("");

        System.out.println( firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) );

        System.out.println( firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber) );

        System.out.println( firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber) );

        System.out.println( firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber) );

        System.out.println( firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber) );

        // Space
        System.out.println("");

        // Part 5
        System.out.println("What is your current age?");
        int age = myObj.nextInt();
        System.out.println("At what age would you like to retire?");
        int retire = myObj.nextInt();
        // Getting the year
        LocalDate currentdate = LocalDate.now();
        int currentYear = currentdate.getYear();

        // Space
        System.out.println("");

        // Doing the math
        System.out.println("You have " + (retire -  age) + " years left until you can retire.");

        System.out.println("It's " + currentYear + ", so you can retire in " + (retire - age + currentYear));

        // Space
        // System.out.println("");
    
        // Part 6 WHY DOES ENTER PLACE GET SKIPPED

        System.out.println("Enter Place:");
        myObj.nextLine();
        String place = myObj.nextLine();
        System.out.println("Enter Name:");
        String name = myObj.nextLine();
        System.out.println("Enter Your Address:");
        String address = myObj.nextLine();
        System.out.println("Enter your Floor:");
        String floor = myObj.nextLine();
        System.out.println("Enter your City:");
        String city = myObj.nextLine();
        System.out.println("Enter your State:");
        String state = myObj.nextLine();
        System.out.println("Enter your Zip code:");
        String zip = myObj.nextLine();

        System.out.println("Shipping Address:");
        System.out.println("");
        System.out.println(place + "-");
        System.out.println("");
        System.out.println("ATTN: " + name );
        System.out.println("");
        System.out.println(address);
        System.out.println("");
        System.out.println(floor);
        System.out.println("");
        System.out.println(city + ", " + state + " " + zip );

        myObj.close();

        

        


    }
    
}