// package string;

public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("m");
        sb.append('a');
        System.out.println(sb); // ma
        sb.insert(2, 'a');
        System.out.println(sb);//maa
        sb.insert(2, 'y');
        System.out.println(sb); // maya
    }

}
