public class Teacher {
    String name;
    String subject;
    int floor;
    int room;

    public Teacher(){

    }
    // Overloading Contructor(when there is two and one has a parameter)
    public Teacher(String n, String s, int f, int r ){
        // Has to be this way name = n;
        name = n;
        subject = s;
        room = r;
        floor = f;
    }

public static void main(String[] args) {

    Teacher Pelzer = new Teacher();
    // Using the overloading contrutor if you put a value in the () then it should automatically print it when targeted
    Teacher Shams = new Teacher("Mr. Shams", "Game Desgin", 3, 300 );
    // Targeted shams.name and it prints "Mr.Shams"
    System.out.println(Shams.name);
    System.out.println(Shams.subject);

     Pelzer.name = "Mr.Pelzer";
     Pelzer.subject = "Computer Science";
     Pelzer.floor = 3;
     Pelzer.room = 300;

    System.out.println("Name: " + Pelzer.name);
    System.out.println("Subject: " + Pelzer.subject);
    System.out.println("Floor: " + Pelzer.floor);
    System.out.println("Room: " + Pelzer.room);

};

}