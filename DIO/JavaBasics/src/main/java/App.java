import Classes.Acesso;
import Strings.Strings;
import Streams.StreamTest;
import Date.DateAndTime;

public class App {
    public static void main(String[] args) {
        System.out.println("Classes");
        Acesso.main();

        System.out.println("Strings");
        Strings.main();

        System.out.println("IntStreams");
        StreamTest.main();

        System.out.println("DateAndTime");
        DateAndTime.main();
    }
}
