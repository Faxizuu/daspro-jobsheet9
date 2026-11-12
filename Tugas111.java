import java.util.Scanner;

public class Tugas111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        if (jumlah < 1) {
            System.out.println("Banyaknya nilai mahasiswa harus lebih dari 0.");
        } else {
            int[] nilai = new int[jumlah];
            int total = 0;

            for (int i = 0; i < nilai.length; i++) {
                do {
                    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                    nilai[i] = input.nextInt();
                    if (nilai[i] < 0 || nilai[i] > 100) {
                        System.out.println("Nilai tidak valid. Masukkan nilai antara 0 sampai 100.");
                    }
                } while (nilai[i] < 0 || nilai[i] > 100);
                total += nilai[i];
            }

            double rata2 = (double) total / nilai.length;

            int tertinggi = nilai[0];
            int terendah = nilai[0];
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > tertinggi) tertinggi = nilai[i];
                if (nilai[i] < terendah) terendah = nilai[i];
            }

            System.out.println("Nilai rata-rata: " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            System.out.println("Daftar nilai mahasiswa:");
            for (int i = 0; i < nilai.length; i++) {
                String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
            }
        }

        input.close();
    }
}
