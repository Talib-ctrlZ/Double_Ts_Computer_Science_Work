import java.util.Scanner; // import the Scanner class

public class userInput{
    public static void main(String[] args ) {
        // Enter username and press Enter
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = myObj.nextLine();
        String userLast = myObj.nextLine();

        System.out.println(userName + " " + userLast);
        

        
    
        
        System.out.println("Your Username: " + userName);

        // Enter number and press enter
        System.out.println("Enter your age");
        int userNumber = myObj.nextInt();
        int userNumber2 = myObj.nextInt();

        System.out.println("Math: " + (userNumber + userNumber2));

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
        System.out.println(place + "-");
        System.out.println("ATTN: " + name );
        System.out.println(address);
        System.out.println(floor);
        System.out.println(city + ", " + state + " " + zip );

        myObj.close();
    }

}