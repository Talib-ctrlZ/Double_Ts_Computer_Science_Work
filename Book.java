public class Book {
  String title;
  String author;
  int ISBN;
  int price;

  public static void main(String[] args) {
    Book lotf = new Book();
    lotf.title = "lord of the flies";
    lotf.author = "William Golding";
    lotf.ISBN = 1234567;
    lotf.price = 6;
    System.out.println("The ISBN is " + lotf.ISBN);
    System.out.println("The price is " + lotf.price);
    System.out.println("The author of the " + lotf.title + " is " + lotf.author );

    Book forthWing = new Book();
    forthWing.title = "Fourth Wing (The Empyrean, 1)";
    forthWing.author = "Rebecca Yarros";
    forthWing.ISBN = 7654321;
    forthWing.price = 17;
    System.out.println("The ISBN is " + forthWing.ISBN);
    System.out.println("The price is " + forthWing.price);
    System.out.println("The author of the " + forthWing.title + " is " + forthWing.author );

    Book Laws = new Book();
    Laws.title = "The 48 Laws of Power ";
    Laws.author = "Robert Greene";
    Laws.ISBN = 3947394;
    Laws.price = 17;
    System.out.println("The ISBN is " + Laws.ISBN);
    System.out.println("The price is " + Laws.price);
    System.out.println("The author of the " + Laws.title + " is " + Laws.author );





  }
}