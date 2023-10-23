package baseball.service.handler;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Player {

    private String player_number = "";

    //입력 관련 validator
    private final InputValidator validator = new InputValidator();

    /**
     * 플레이어 숫자 입력 받기
     *
     * @param number_of_digits : 지정 입력값 자리수
     */
    public void setPlayer_number(int number_of_digits) {
        String input_number = readLine();

        if (!validator.regexCheck(input_number, number_of_digits) ||
                !validator.IsDifferentEachDigit(input_number)) {
            throw new IllegalArgumentException();
        }

        this.player_number = input_number;
    }

    public String getPlayer_number() {
        return player_number;
    }
}
