package something;

import java.util.Optional;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Bot {

    public Optional<String> onMentionedMessagePosted(String message, String channelName, String userDispName) {
        var m = message.trim();
        var ms = m.split("\\s");
        //ボット名に反応して動くようにする。
        if (ms[0].equals("a-team-bot")) {

            String battleCard = new String();
            Random random = new Random();
            int randomNum  =random.nextInt(3);
            switch(randomNum){
                case 0:
                    battleCard = "ぐー";
                    break;
                case 1:
                    battleCard = "ちょき";
                    break;
                case 2:
                    battleCard = "ぱー";
                    break;
                default:
                    break;
            }

            if (ms[1].equals(battleCard)) {
                return Optional.of(battleCard + " あいこだよ");
            }
            if (battleCard.equals("ぐー") && ms[1].equals("ちょき")) {
                return Optional.of(battleCard + " 僕の勝ちだよ");
            }
            if (battleCard.equals("ぐー") && ms[1].equals("ぱー")) {
                return Optional.of(battleCard + " 僕の負けだよ");
            }

            if (battleCard.equals("ちょき") && ms[1].equals("ぐー")) {
                return Optional.of(battleCard + " 僕の負けだよ");
            }

            if (battleCard.equals("ちょき") && ms[1].equals("ぱー")) {
                return Optional.of(battleCard + " 僕の勝ちだよ");
            }

            if (battleCard.equals("ぱー") && ms[1].equals("ぐー")) {
                return Optional.of(battleCard + " 僕の勝ちだよ");
            }

            if (battleCard.equals("ぱー") && ms[1].equals("ちょき")) {
                return Optional.of(battleCard + " 僕の負けだよ");
            }

            return Optional.empty();
        }
        return Optional.empty();
    }

    public Optional<String> onMessagePosted(String message, String channelName, String userDispName) {
        var m = message.trim();
        if (m.equals("CICD")) {
            return Optional.of("実践入門");
        }

        var ms = m.split("\\s");
        if (ms[0].equals("FizzBuzz")) {

            int inputNumber = parseInt(ms[1]);
            String ans = "";

            if (inputNumber % 3 == 0) {
                ans += "Fizz";
            }
            if (inputNumber % 5 == 0) {
                ans += "Buzz";
            }
            if (inputNumber % 3 != 0 && inputNumber % 5 != 0) {
                ans = ms[1];
            }
            return Optional.of(ans);
        }

        return Optional.empty();
    }
}