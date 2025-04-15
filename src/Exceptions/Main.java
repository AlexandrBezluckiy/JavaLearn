package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            String s = "513abc";
            int c = Integer.parseInt(s);
        }

        catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя.");
        }
        catch (NumberFormatException e1) {
            System.out.println("Ошибка преобразования.");
        }
        catch (Exception e) {
        }  // искл обрабатываются последовательно. искл без описания отлавливают все ошибки, поэтому дальнейшие ошибки в блоке catch не обрабатываются.

        finally {  // выполняется всегда, независимо от того была поймана ошибка или нет.
        System.out.println("Мы в блоке finally");
        }
        System.out.println("Привет");
    }
}
