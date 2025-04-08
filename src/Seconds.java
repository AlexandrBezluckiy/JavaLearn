public class Seconds {
    public static void main(String[] args) {
        int seconds = 900610;
        int sec_in_min = 60;
        int min_in_hour = 60;
        int hour_in_days = 24;
        int days = seconds / (sec_in_min * min_in_hour * hour_in_days);
        int hours = (seconds % (sec_in_min * min_in_hour * hour_in_days)) / (min_in_hour * sec_in_min);
        int minutes = ((seconds % (sec_in_min * min_in_hour * hour_in_days)) % (min_in_hour * sec_in_min)) / sec_in_min;
        int left_seconds = ((seconds % (sec_in_min * min_in_hour * hour_in_days)) % (min_in_hour * sec_in_min)) % sec_in_min;
        System.out.println("Всего секунд: " + seconds + "\nДней: " + days + "\nЧасов: " + hours + "\nМинут: " + minutes + "\nСекунд: " + left_seconds);
    }
}
