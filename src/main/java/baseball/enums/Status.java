package baseball.enums;

public enum Status {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}