public class ItClass{
    
    public static class Teacher{
        String first;
        String last;
        int roomNo;
    }
    public static void main(String[] args){
        Teacher shams = new Teacher();
                shams.roomNo = 300;
        System.out.println("The room is " + shams.roomNo);

        Teacher alps = new Teacher();
                alps.roomNo = 365;
        System.out.println("The room is " + alps.roomNo);

        Teacher king = new Teacher();
                king.first = "Adam";
                king.last = "Keolsch";
        System.out.println("First " + king.first);
        System.out.println("Second " + king.last);

        Teacher pier = new Teacher();
            pier.first = "Kyle";
            pier.last = "Pierre";
        System.out.println("First " + pier.first);
        System.out.println("Second " + pier.last);




        
    }
    
}