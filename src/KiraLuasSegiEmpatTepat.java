import java.util.Scanner;
// Kelas untuk menghitung luas segi empat tepat

public class KiraLuasSegiEmpatTepat {
    public static void main(String[] args) {
        double sisi;
        
        // Input panjang dan lebar
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kepanjangan sisi segi empat tepat: ");
            sisi = input.nextDouble();
            
            // Hitung luas segi empat tepat
            double luas = sisi * sisi;

            // Tampilkan hasil
            System.out.println("Luas segi empat tepat adalah: " + luas);
        }
    }
}