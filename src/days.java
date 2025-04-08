public class days {
    public static void main(String[] args) {
        int days = 5000;
        int years = 5000 / 365;
        int months = (days % 365) / 31;
        int left_days = days - years * 365 - months * 31;
        System.out.println("Всего дней: " + days + "\nЛет: " + years+ "\nМесяцев: " + months + "\nДней: " + left_days);
    }
}
