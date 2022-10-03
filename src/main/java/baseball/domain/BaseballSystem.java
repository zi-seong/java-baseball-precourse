package baseball.domain;

import baseball.enums.Status;

public class BaseballSystem {
    private final Player player;
    private final Computer computer;

    public BaseballSystem(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public BaseballResult play() {
        BaseballResult gameResult = new BaseballResult();
        for (int i = 0; i < player.getInputNumbers().size(); i++) {
            int playerNumber = player.getInputNumbers().get(i);
            int computerNumber = computer.getNumbers().get(i);

            Status baseballStatus = checkStatus(playerNumber, computerNumber);
            gameResult.addResult(baseballStatus);
        }
        return gameResult;
    }

    private Status checkStatus(int playerNumber, int computerNumber) {
        if (computerNumber == playerNumber) return Status.STRIKE;
        if (computer.getNumbers().contains(playerNumber)) return Status.BALL;
        return Status.NOTHING;
    }

}
