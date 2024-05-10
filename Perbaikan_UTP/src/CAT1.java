class CAT1 extends TiketKonser {
    // Konstruktor kelas untuk tiket CAT1
    public CAT1() {
        super("CAT 1"); // Memanggil konstruktor parent class dan menetapkan jenis tiket
    }

    // Implementasi method untuk menghitung total harga tiket CAT 1
    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.CAT1 * jumlah; // Mengalikan harga tiket dengan jumlah tiket
    }
}