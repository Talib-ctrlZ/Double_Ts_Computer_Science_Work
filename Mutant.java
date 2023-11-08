public class Mutant {
    String name;
    int age;

    public static void main(String[] args) {
        Mutant mutantA = new Mutant();
            mutantA.name = "Logan";
            mutantA.age = 99;
        
        Mutant mutantB = new Mutant();
            mutantB.name = "Jean";
            mutantB.age = 27;

        System.out.println(mutantA.name + " and " + mutantB.name + " walks into a room.");
        System.out.println(mutantA.name + " is " + mutantA.age);
        System.out.println("and " + mutantB.name + " is " + mutantB.age);
        System.out.println(mutantA.name + " is " + (mutantA.age - mutantB.age) + " years older than " + mutantB.name);
    }
    
}