import java.util.Scanner;

public class Switch_operator {
    public static void main(String[] args) {
        String[] mes = {"Янв","Фев","Мар","Апр","Май","Июн","Июл","Авг","Сен","Окт","Ноя","Дек"};
        String again;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nВвести месяц? y/n");
            again = sc.next();
            if (again.equals("n")) {
                break;
            }
            else if  (!again.equals("y")) {
                continue;
            }
            System.out.println("Введите номер месяца: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.printf(mes[num - 1]);
                    break;
                case 2:
                    System.out.printf(mes[num - 1]);
                    break;
                case 3:
                    System.out.printf(mes[num - 1]);
                    break;
                case 4:
                    System.out.printf(mes[num - 1]);
                    break;
                case 5:
                    System.out.printf(mes[num - 1]);
                    break;
                case 6:
                    System.out.printf(mes[num - 1]);
                    break;
                case 7:
                    System.out.printf(mes[num - 1]);
                    break;
                case 8:
                    System.out.printf(mes[num - 1]);
                    break;
                case 9:
                    System.out.printf(mes[num - 1]);
                    break;
                case 10:
                    System.out.printf(mes[num - 1]);
                    break;
                case 11:
                    System.out.printf(mes[num - 1]);
                    break;
                case 12:
                    System.out.printf(mes[num - 1]);
                    break;
                default:
                    System.out.println("Месяц не найден.");
                    break;
                }
            } while (true);
    }
}
