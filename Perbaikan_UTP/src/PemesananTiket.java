import java.util.Scanner;

class PemesananTiket {
    // Method utama untuk pemesanan tiket
    public static void pesanTiket() {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan selamat datang dan nama pemesan
        System.out.println("Selamat datang di Pemesanan Tiket!");
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        // Menampilkan menu pilihan tiket
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        // Memilih jenis tiket sesuai keinginan user
        TiketKonser tiket = null;
        switch (pilihan) {
            case 1:
                tiket = new CAT8();
                break;
            case 2:
                tiket = new CAT1();
                break;
            case 3:
                tiket = new FESTIVAL();
                break;
            case 4:
                tiket = new VIP();
                break;
            case 5:
                tiket = new VVIP();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        // Menghitung total harga tiket
        double totalHarga = tiket.hitungTotalHarga(1); // Jumlah tiket selalu satu
        // Generate kode booking random
        String kodeBooking = Main.generateKodeBooking();
        // Mendapatkan tanggal pesanan menggunakan method yang sudah ada di kelas Main
        String tanggalPesanan = Main.getCurrentDate();
        
        // Output detail pesanan
        System.out.println("----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: 08-05-2024");
        System.out.println("Tiket yang dipesan: " + tiket.jenisTiket);
        System.out.println("Total harga: " + totalHarga + " USD");

        scanner.close();
    }
}
