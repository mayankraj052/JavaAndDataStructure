class SuperKeyword {
    public static void main(String[] args) {
        Horses h = new Horses();
        System.out.println(h.color);
    }
}

class Animel {
    String color = "red";
    Animel() {
        System.out.println("Animal constructor is called");
    }
}

class Horses extends Animel {
    Horses() {
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
