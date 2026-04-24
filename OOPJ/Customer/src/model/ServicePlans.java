package model;

public enum ServicePlans {
    SILVER(1000),
    GOLD(2000),
    DIAMOND (5000),
    PLATINUM (10000);

    private final int code;

    // Enum constructors must be private or package-private
    private ServicePlans(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}
