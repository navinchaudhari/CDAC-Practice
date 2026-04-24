public class Bowler extends Cricketer {
    int totalWickets;

    public Bowler(String name, String country, int totalMatches, int totalWickets) {

        super(name, country, totalMatches);
        this.totalWickets = totalWickets;
    }

    public Bowler(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public Bowler() {
    }

    void bowlerPrintDetails() {
        printDetails();
        System.out.println("Total Wickets    : " + totalWickets);
    }
}
