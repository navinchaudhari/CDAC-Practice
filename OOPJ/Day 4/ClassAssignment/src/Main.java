public class Main {
    public static void main(String[] args) {
        Batsman batsman = new Batsman("Rohit Sharma", "India", 450, 40000);
        batsman.batsmanPrintDetails();

        Bowler bowler = new Bowler("Jasprit Bumrah", "India", 300, 435);
        bowler.bowlerPrintDetails();

        AllRounder allRounder = new AllRounder("Ravindra Jadeja", "India", 430, 25000, 320);
        allRounder.allRounderPrintDetails();

    }
}