import JavaLearn.Man2;

public class OOP_Parse_HW {
    public static void main(String[] args) {
        String str = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String name;
        String position;
        int age;
        double height;

        name = str.substring(4, 8);
        position = str.substring(54, 65);
        age = Integer.parseInt(str.substring(14, 16));
        height = Double.parseDouble(str.substring(32, 37));

        Man2 man = Man2.create_man(name, position, age, height);

        System.out.println("Это: " + man.getName() + "\nОн: " + man.getPosition() + "\nЕму: " + man.getAge() + "\nЕго рост: " + man.getHeight());
    }
}
