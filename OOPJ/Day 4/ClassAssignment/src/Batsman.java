public class Batsman extends Cricketer {
    int totalRuns;

    public Batsman(String name, String country, int totalMatches, int totalRuns) {
        super(name, country, totalMatches);
        this.totalRuns = totalRuns;
    }

    public Batsman(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public Batsman() {
    }

    void batsmanPrintDetails() {
        printDetails();
        System.out.println("Total Runs       : " + totalRuns);
    }
}
