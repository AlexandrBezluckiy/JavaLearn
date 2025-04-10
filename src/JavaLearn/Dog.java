package JavaLearn;

public class Dog {
    String name;
    String subtype;
    int speed;

    public void set_value(String name, String subtype, int speed) {
        this.name = name;
        this.subtype = subtype;
        this.speed = speed;
    }

    public String info() {
        return name + " " + subtype + " " + speed;
    }

    public String run() {
        String output = "";
        for (int i = 0; i < speed; i++) {
            if (i < speed - 1) {
                output += "run, ";
            } else {
                output += "run!";
            }
        }
        return output;
    }
}
