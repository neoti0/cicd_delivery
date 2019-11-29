package something;

import java.util.Optional;

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
            return Optional.of("1");
        }

        return Optional.empty();
    }
}
