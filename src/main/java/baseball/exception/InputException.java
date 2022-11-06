package baseball.exception;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputException {
    private static int LENGTH = 3;
    private static String INPUT_EXCEPTION_MESSAGE = "잘못된 값을 입력하여 게임을 종료합니다.";

    public static void inputCheckDuringGame(String input) {
        if(!(isNaturalNumber(input) && isContainOverlapNumber(input) && isRightLength(input)))
            throw new IllegalArgumentException(INPUT_EXCEPTION_MESSAGE);
    }

    private static boolean isNaturalNumber(String input) {
        char[] userNumber = input.toCharArray();
        for (char c : userNumber) {
            int num = Character.getNumericValue(c);
            if(!(0 < num && num < 10)) return false;
        }
        return true;
    }

    private static boolean isContainOverlapNumber(String input) {
        Set<Character> numbers = new HashSet<>();

        for (char c : input.toCharArray()) {
            if(!numbers.add(c)) return false;
        }

        return true;
    }

    private static boolean isRightLength(String input) {
        if(input.length() != LENGTH) return false;
        return true;
    }
}
