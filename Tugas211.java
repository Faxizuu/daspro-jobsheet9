import java.util.Scanner;

public class Tugas211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        String lagi;
        do {
            System.out.print("Masukkan nama menu yang ingin dicari: ");
            String cari = input.nextLine();
            int indeks = -1;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cari)) {
                    indeks = i;
                    break;
                }
            }

            if (indeks != -1) {
                System.out.println("Menu tersedia: " + menu[indeks] + " - Rp " + harga[indeks]);
            } else {
                System.out.println("Maaf, menu " + cari + " tidak tersedia.");
            }

            System.out.print("Cari menu lain? (y/n): ");
            lagi = input.nextLine();
        } while (lagi.equalsIgnoreCase("y"));

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        if (jumlah < 1) {
            System.out.println("Jumlah item harus lebih dari 0.");
        } else {
            String[] pesanan = new String[jumlah];
            int[] hargaPesanan = new int[jumlah];
            int totalBiaya = 0;

            for (int i = 0; i < jumlah; i++) {
                int indeks;
                do {
                    System.out.print("Pesanan ke-" + (i + 1) + ", masukkan nama menu: ");
                    String namaMenu = input.nextLine();
                    indeks = -1;

                    for (int j = 0; j < menu.length; j++) {
                        if (menu[j].equalsIgnoreCase(namaMenu)) {
                            indeks = j;
                            break;
                        }
                    }

                    if (indeks == -1) {
                        System.out.println("Menu tidak tersedia. Silakan masukkan nama menu yang ada pada daftar.");
                    }
                } while (indeks == -1);

                pesanan[i] = menu[indeks];
                hargaPesanan[i] = harga[indeks];
                totalBiaya += harga[indeks];
            }

            System.out.println("===== DAFTAR PESANAN =====");
            for (int i = 0; i < pesanan.length; i++) {
                System.out.printf("%d. %-16s Rp %d%n", (i + 1), pesanan[i], hargaPesanan[i]);
            }
            System.out.println("==========================");
            System.out.println("Total biaya: Rp " + totalBiaya);
        }

        input.close();
    }
}
