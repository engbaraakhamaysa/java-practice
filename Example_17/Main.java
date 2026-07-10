package Example_17;

class Baraa {
    String name;
    int age;

    public Baraa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String display() {
        return name + age;
    }
}

public class Main {

    public static void main(String[] args) {
        Baraa baraa = new Baraa("Baraa", 32);

        System.out.println(baraa.display());
    }
}