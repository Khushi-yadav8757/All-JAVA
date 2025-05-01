class animal {
    String name;
    String color;

    public void voice() {
        System.out.println("brake");
    }
}

class Lec4 {
    public static void main(String[] args) {
        animal dog = new animal();
        dog.name = "sweety";
        dog.color = "black";

        System.out.println(dog.name);
        System.out.println(dog.color);
    }
}
