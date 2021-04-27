public class App {
    public static void main(String[] args) throws Exception {
        
        char[] a = "A B C D E F G".toCharArray();
        System.out.println(a.length);
        System.out.println(a);
   
        String[] b ="aula de java".split(" ");
        System.out.println(b[0] + b[1] + b[2]);

        var c = "aula".concat(" concatenei com java.");
        System.out.println(c);

        var d = "1234 asdaz qw".replaceAll("[a-s]{1,4}", "look at me");
        System.out.println(d);
    }
}
