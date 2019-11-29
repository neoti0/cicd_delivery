/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package something;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BotSpec {
    @Test
    void BotReplyCICD() {
        var bot = new Bot();
        var response = bot.onMessagePosted("CICD", "", "");
        Assertions.assertEquals(Optional.of("実践入門"), response);
    }


    @Test
    void BotReplyFizzBuzz_1() {
        var bot = new Bot();
        var response = bot.onMessagePosted("FizzBuzz 1", "", "");
        Assertions.assertEquals(Optional.of("1"), response);
    }

    @Test
    void BotReplyじゃんけん_ぐー() {
        var bot = new Bot();
        var response = bot.onMentionedMessagePosted("ぐー", "", "");
        Assertions.assertEquals(response.isEmpty(), false);
    }
}
