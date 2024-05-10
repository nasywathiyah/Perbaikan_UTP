class CAT8 extends TiketKonser {
    // Konstruktor kelas untuk tiket CAT8
    public CAT8() {
        super("CAT 8"); // Memanggil konstruktor parent class dan menetapkan jenis tiket
    }

    // Implementasi method untuk menghitung total harga tiket CAT 8
    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.CAT8 * jumlah; // Mengalikan harga tiket dengan jumlah tiket
    }
}
