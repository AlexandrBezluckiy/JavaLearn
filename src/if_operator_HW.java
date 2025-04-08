import java.util.Random;

public class if_operator_HW {
    public static void main(String[] args) {
        Random rand = new Random();
        int money = rand.nextInt(600);
        String message;
        if (money >= 500) {
            message = "Your money = : " + money + "\nTake a pizza.";
        }
        else if ((money <  500) && (money >= 300)) {
            message = "Your money = : " + money + "\nTake a shawarma.";
        }
        else if ((money < 300) && (money >= 100)) {
            message = "Your money = : " + money + "\nTake a doshirak.";
        }
        else {
            message = "Your money = : " + money + "\nYou need a job man.";
        }
        System.out.println(message);
    }
}
