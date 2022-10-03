package baseball.domain;

import baseball.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class BaseballResult {

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

    public String convert(BaseballResult gameResult) {
        List<String> resultMessagesList = new ArrayList<>();

        if (gameResult.getBallCount() > 0) {
            resultMessagesList.add(String.format("%d%s", gameResult.getBallCount(), Status.BALL.getName()));
        }

        if (gameResult.getStrikeCount() > 0) {
            resultMessagesList.add(String.format("%d%s", gameResult.getStrikeCount(), Status.STRIKE.getName()));
        }

        if (gameResult.getStrikeCount() == 0 && gameResult.getBallCount() == 0) {
            resultMessagesList.add(Status.NOTHING.getName());
        }
        return String.join(" ", resultMessagesList).trim();
    }
}
