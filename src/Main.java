import java.util.Scanner;

public class Main {
    //Metot kısmı
    static boolean isPrime(int number, int divisor) {
    //if döngüsü ile boolean kuruluşu
        if (number < 2)
            return false;

        if (divisor == 1)
            return true;

        if (number % divisor == 0)
            return false;
    //return kontrolü
        return isPrime(number, divisor - 1);
    }


    static boolean isPrime(int number) {
        return isPrime(number, (int) Math.sqrt(number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir sayı giriniz: ");
        int number = scanner.nextInt();

        //Sayının konrolü
        boolean result = isPrime(number);

        //Çıktı
        if (result) {
            System.out.println(number + " Bir Asal Sayıdır.");
        } else {
            System.out.println(number + " Bir Asal Sayı Değildir.");
        }


    }
}
