package PBO;
public class BilanganGanjilGenap {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bilangan Ganjil dari 0 sampai " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-\nBilangan Genap dari 0 sampai " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}