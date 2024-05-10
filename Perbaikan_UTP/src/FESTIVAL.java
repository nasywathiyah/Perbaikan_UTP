class FESTIVAL extends TiketKonser{
    // Konstruktor untuk tiket Festival
    public FESTIVAL() {
        super("FESTIVAL"); // Memanggil konstruktor parent class dan menetapkan jenis tiket
    }

    // Implementasi method untuk menghitung total harga tiket FESTIVAL
    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.FESTIVAL * jumlah; // Mengalikan harga tiket dengan jumlah tiket
    }
}
