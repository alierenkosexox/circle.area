import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını girin:");

        System.out.print("1. Kenar: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. Kenar: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. Kenar: ");
        double kenar3 = scanner.nextDouble();

        // Üçgenin alanını hesaplamak için yarı çevreyi hesapla
        double yariCevre = (kenar1 + kenar2 + kenar3) / 2;

        // Alanı Heron formülü kullanarak hesapla
        double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));

        System.out.println("Üçgenin alanı: " + alan);

        scanner.close();
    }
}            //Ali Eren KÖSE 21/02/2024 05:33  Balkonuma konan kuşlarla veda vaktidir . Bu veda , vedaların ne sonuncusu ,ne de ilkidir.
