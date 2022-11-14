import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        double boy ;
        int kilo;
        System.out.print("Lutfen boyunuzu (Metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        double indeks = kilo / (boy * boy);

        System.out.print("Vucut Kitle indeksiniz : " + indeks);

    }
}