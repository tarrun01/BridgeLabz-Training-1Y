import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= String Length Checker =========\n");

        Function<String, Integer> getLength = message -> message.length();

        int charLimit = 50;
        Predicate<String> exceedsLimit = message -> getLength.apply(message) > charLimit;

        List<String> messages = Arrays.asList(
            "Hi there!",
            "This is a normal message for testing purposes.",
            "This message is way too long and definitely exceeds the character limit set for this system.",
            "Short msg",
            "Another long message that goes beyond the fifty character limit defined here."
        );

        System.out.println("Character Limit: " + charLimit + "\n");
        for (String msg : messages) {
            int length = getLength.apply(msg);
            System.out.println("Message  : \"" + msg + "\"");
            System.out.println("Length   : " + length + " chars");
            System.out.println("Status   : " + (exceedsLimit.test(msg) ? "EXCEEDS LIMIT" : "Within limit"));
            System.out.println();
        }
    }
}
