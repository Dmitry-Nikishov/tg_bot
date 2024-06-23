import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class App {
    public static void main(String[] args) {
        ApiContextInitializer.init();

        var botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new CustomBot());
        }catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
