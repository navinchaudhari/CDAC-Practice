import javax.security.auth.login.CredentialException;

public class AllRounder extends Cricketer {
    int totalRuns;
    int totalWickets;

    public AllRounder(String name, String country, int totalMatches, int totalRuns, int totalWickets) {
        super(name, country, totalMatches);
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public AllRounder(int totalRuns, int totalWickets) {
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public AllRounder() {
    }

    void allRounderPrintDetails() {
        printDetails();
        System.out.println("Total Runs       : " + totalRuns);
        System.out.println("Total Wickets    : " + totalWickets);
    }
}
