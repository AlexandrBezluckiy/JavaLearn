import java.util.Random;

public class If_operator_temperature {
    public static void main(String[] args) {
        Random rand = new Random();
        int temperature = rand.nextInt(35);
        String message;
        if (temperature >= 25) {
            message = "Кондиционер включен.";
        }
        else if (temperature <= 22) {
            message = "Кондиционер выключен.";
        }
        else {
            message = "Кондиционер ничего не делает.";
        }
        System.out.println("Температура сейчас: " + temperature + "\n" + message);
    }
}
