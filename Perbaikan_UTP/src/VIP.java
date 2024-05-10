class VIP extends TiketKonser {
    // Konstruktor kelas untuk tiket VIP
    public VIP() {
        super("VIP"); // Memanggil konstruktor parent class dan menetapkan jenis tiket
    }

    // Implementasi method untuk menghitung total harga tiket VIP
    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.VIP * jumlah; // Mengalikan harga tiket dengan jumlah tiket
    }
}
