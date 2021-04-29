package Strings;

public class Strings {
    public static void main(){
        char[] a = "A B C D E F G".toCharArray();
        System.out.println(a.length);
        System.out.println(a);

        String[] b = "aula de java".split(" ");
        System.out.println(b);

        var c = "aula".concat(" concatenei com java.");
        System.out.println(c);

        var d = "1234 asdaz qw".replaceAll("[a-s]{1,4}", "look at me");
    }
}
