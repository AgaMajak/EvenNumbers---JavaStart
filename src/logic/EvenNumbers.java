package logic;

public class EvenNumbers {

    public static void showNumbersAndSum() {
        System.out.println("Ta metoda wyświetli liczby parzyste od 0 do 100 i pokaże ich sumę.");
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Suma wyświetlonych liczb to: " + sum);
    }

}
