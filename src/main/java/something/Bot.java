package something;

import java.util.Optional;
import static java.lang.Integer.parseInt;

public class Bot {
    public Optional<String> onMentionedMessagePosted(String message, String channelName, String userDispName){
        var m = message.trim();
        var ms = m.split("\\s");
        if(ms[0].equals("ぐー") || ms[0].equals("ちょき") || ms[0].equals("ぱー")){
            return Optional.of("ぐー 僕の勝ち");
        }
        return Optional.empty();
    }
    public Optional<String> onMessagePosted(String message, String channelName, String userDispName){
        var m = message.trim();
        if(m.equals("CICD")){
            return Optional.of("実践入門");
        }

        var ms = m.split("\\s");
        if(ms[0].equals("FizzBuzz")){

            int inputNumber = parseInt(ms[1]);
            String ans = "";

            if(inputNumber % 3 == 0){
                ans += "Fizz";
            }
            if (inputNumber % 5==0){
                ans += "Bazz";
            }
            if (inputNumber % 3 !=0 && inputNumber % 5 !=0){
                ans = ms[1];
            }
            return Optional.of(ans);
        }

        return Optional.empty();
    }
}
