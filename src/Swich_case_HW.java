public class Swich_case_HW {
    public static void main(String[] args) {
        String month = "Окт";
        int season = 0;
        if ( month.equals("Дек") || month.equals("Янв") || month.equals("Фев") ){
            season = 1;
        }
        if ( month.equals("Мар") || month.equals("Апр") || month.equals("Май") ){
            season = 2;
        }
        if ( month.equals("Июн") || month.equals("Июл") || month.equals("Авг") ){
            season = 3;
        }
        if ( month.equals("Сен") || month.equals("Окт") || month.equals("Нояб") ){
            season = 4;
        }
        switch (season) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Что-то пошло не так.");
                break;
        }
    }
}
