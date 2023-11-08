/**
 * PublicAccount
 */
public class PublicAccount {
    public int cardNumber;
    public int year;
    public String month; 
    public String lastName;
    public String firstName;
    public int cvv;

    // This right here is a method in real java code put it out side the public static void main
    public void displayCardInfo() {
        System.out.println(cardNumber);
        System.out.println(month + "/" + year);
        System.out.println(firstName);
        System.out.println(lastName);
      }

    public void displayCvv() {
        System.out.println("CVV: " + cvv);
      }  
    public static void main(String[] args) {
        // Initialize the PublicAccount
        PublicAccount object = new PublicAccount();

        System.out.println(" ");

        // Call the method displayCardInfo this will be empty
        object.displayCardInfo();

        System.out.println(" ");

        // Create a 9 digit account number for cardNumber
        object.cardNumber = 349394057;

        //Use the current month for the month
        object.month = "Nov";

        object.year = 2025;

        object.firstName = "Talib";

        object.lastName = "Folborg";

        object.cvv = 999;

        // Call the method displayCardInfo this will be full due to the info we just added.
        object.displayCardInfo();

        
        
    }
}