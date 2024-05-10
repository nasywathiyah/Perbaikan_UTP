abstract class TiketKonser implements HargaTiket {
    // Atribut untuk menyimpan jenis tiket 
    protected String jenisTiket;
    
    // Konstruktor untuk inisialisasi jenis tiket
    public TiketKonser(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }
    // Deklarasi method abstrak untuk menghitung total harga tiket
    public abstract double hitungTotalHarga(int jumlah);
}
