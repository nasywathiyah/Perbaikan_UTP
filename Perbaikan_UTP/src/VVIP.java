class VVIP extends TiketKonser {
    // Konstruktor kelas untuk tiket VVIP
    public VVIP() {
        super("UNLIMITED EXPERIENCE"); // Memanggil konstruktor parent class dan menetapkan jenis tiket 
    }

    // Implementasi method untuk menghitung total harga tiket VVIP
    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.VVIP * jumlah; // Mengalikan harga tiket dengan jumlah tiket
    }
}
