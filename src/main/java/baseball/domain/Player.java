package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static final int NUMBERS_LENGTH = 3;
    private final List<Integer> numbers = new ArrayList<>();

    public void setInputNumbers(String inputString) {
        numbers.clear();
        inputStringValidation(inputString);

        for (String input : inputString.split("")) {
            int result = Integer.parseInt(input);
            numbers.add(result);
        }
    }

    public List<Integer> getInputNumbers() {
        return numbers;
    }

    private void inputStringValidation(String inputString) {
        try{
            Integer.parseInt(inputString);
        }catch (NumberFormatException ne){
            throw new IllegalArgumentException("숫자를 입력해주시기 바랍니다.");
        }

        if (inputString.length() > NUMBERS_LENGTH) {
            throw new IllegalArgumentException(NUMBERS_LENGTH+"자리 까지 입력가능합니다.");
        }
    }


}
