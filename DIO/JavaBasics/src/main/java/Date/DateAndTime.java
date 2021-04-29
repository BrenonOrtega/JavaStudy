package Date;

import java.util.Date;

public class DateAndTime {
    public static void main() {
        Date agora = new Date();
        agora.setYear(98);
        agora.setMonth(02);
        agora.setDate(02);

        agora.setHours(9);
        agora.setMinutes(31);

        long timeInMillis = agora.getTime();
        System.out.println("Eu nasci em:" + timeInMillis);
        System.out.println("Eu nasci em:" + agora);

        Date meuNascimento = new Date(888841905723L);
        Date dataZero = new Date(0L);
        System.out.println(dataZero);
        System.out.println(meuNascimento);

        System.out.println("Date.equals:" + dataZero.equals(meuNascimento));
        System.out.println("Date.CompareTo passado: " + dataZero.compareTo(meuNascimento));
        System.out.println("Date.CompareTo futuro: "+ meuNascimento.compareTo(dataZero));
        System.out.println("Date.CompareTo presente: "+ new Date().compareTo(new Date()));


    }
}
