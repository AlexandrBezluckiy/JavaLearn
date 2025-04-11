package JavaLearn;

public class Monster {
    int eye;
    int legth;
    int arms;

    public Monster() {
        this.eye = 2;
        this.legth = 2;
        this.arms = 2;
    }

    public Monster(int legth, int arms) {
        this.eye = 2;
        this.legth = legth;
        this.arms = arms;
    }

    public Monster(int arms) {
        this.eye = 2;
        this.legth = 2;
        this.arms = arms;
    }

    public Monster(int eye, int legth, int arms) {
        this.eye = eye;
        this.legth = legth;
        this.arms = arms;
    }

    public void voice() {
        System.out.println("Голос!");
    }
    public void voice(int i) {
        String out = "";
        for (int j = 0; j < i; j++) {
            if (j < i-1) {
                out += "Голос, ";
            }
            else {
                out += "Голос!";
            }
        }
        System.out.println(out);
    }
    public void voice(int i, String word) {
        String out = "";
        for (int j = 0; j < i; j++) {
            if (j < i-1) {
                out += word + ", ";
            }
            else {
                out += word + "!";
            }
        }
        System.out.println(out);
    }

    public String show_info() {
        return "У монстра: " + "Глаз: " + eye + " Ног: " + legth + " Рук: " + arms;
    }
}
