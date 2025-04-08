public class Boolean_type {
    public static void main(String[] args) {
        int temp = 20;
        int time = 24;
        boolean hot = temp > 25;
        boolean late = time >= 23;
        if (!hot && !late) {
            System.out.println("Кондиционер выключен.");
        }
        else if (!hot && late){
            System.out.println("Кондиционер выключен");
        }
        else if (hot && late){
            System.out.println("Кондиционер выключен");
        }
        else if (hot && !late){
            System.out.println("Кондиционер включен");
        }
    }
}
