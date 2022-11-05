package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private int LENGTH = 3;
    private List<Integer> computerNumber = new ArrayList<>();

    private void initComputerNumber() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        while(computerNumber.size() < LENGTH) {
            if(!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
    }
}
