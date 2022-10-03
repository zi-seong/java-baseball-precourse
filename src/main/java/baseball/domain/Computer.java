package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final int MAX_NUMBER = 9;
    private final int MIN_NUMBER = 1;
    private final int NUMBERS_LENGTH = 3;

    private final List<Integer> numbers = new ArrayList<>();

    public void pickNumbers() {
        numbers.clear();
        for (int i = 0; i < NUMBERS_LENGTH; i++) {
            numbers.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }
    }

}
