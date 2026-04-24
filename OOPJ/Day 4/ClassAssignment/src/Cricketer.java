public class Cricketer {
    String name;
    String country;
    int totalMatches;

    public Cricketer(String name, String country, int totalMatches) {
        this.name = name;
        this.country = country;
        this.totalMatches = totalMatches;
    }

    public Cricketer() {
    }

    void printDetails() {
        System.out.println("    **Cricketer Details**");
        System.out.println("Name             : " + name);
        System.out.println("Country          : " + country);
        System.out.println("Total Matches    : " + totalMatches);
    }
}
