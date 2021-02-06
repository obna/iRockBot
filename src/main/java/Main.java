import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    private static final String IROCKBOT_KEY = "irockbot-token.txt";

    public static void main(String[] args) throws Exception {
        JDA jda =  JDABuilder.createDefault(IROCKBOT_KEY).build();
    }
}