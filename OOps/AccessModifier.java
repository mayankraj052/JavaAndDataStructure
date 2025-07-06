package OOps;

public class AccessModifier {

    public static void main(String[] args) {
        // BankManager b1 = new BankManager();
        // b1.userName = "mayank";
        // b1.setPassword("nbgbigbg");

        // // Verify password (Just an example usage)
        // System.out.println("Password Set Successfully? " +
        // b1.verifyPassword("nbgbigbg"));

        Pen p1 = new Pen(); // created a pen object call p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(9);
        System.out.println(p1.getTip());
    }
}

class BankManager {
    public String userName;
    private String passWord;

    public void setPassword(String pwd) {
        passWord = pwd; // Now, we are using passWord properly
    }

    // A method to check password (for demonstration)
    public boolean verifyPassword(String pwd) {
        return this.passWord.equals(pwd);
    }
}

class Pen {
    private String color = "blue";
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
