package baseball.domain;

import baseball.enums.Status;

public class Result {

    private int strikeCount = 0;
    private int ballCount = 0;

    public void addResult(Status Status) {
        if (Status.STRIKE == Status) strikeCount++;
        if (Status.BALL == Status) ballCount++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return strikeCount;
    }
}
