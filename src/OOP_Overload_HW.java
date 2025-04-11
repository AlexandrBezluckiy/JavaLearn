import JavaLearn.Monster;

public class OOP_Overload_HW {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster2 = new Monster(2, 4);
        Monster monster3 = new Monster(6);
        Monster monster4 = new Monster(1, 2, 8);

        System.out.println(monster.show_info());
        System.out.println(monster2.show_info());
        System.out.println(monster3.show_info());
        System.out.println(monster4.show_info());

        monster.voice();
        monster.voice(7);
        monster.voice(8, "Есть");
    }
}
