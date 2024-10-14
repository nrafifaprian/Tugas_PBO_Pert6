package PBO;
public class LaguAnakAyam {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            System.out.println("Tek kotek, kotek kotek~ \nAnak ayam turun berkotek");
            System.out.println("Anak ayam turunlah " + i);
            System.out.println("Mati satu, tinggal-lah " + ((i-1) == 0 ? "induknya" : i - 1 + "\n"));
        }
    }
}