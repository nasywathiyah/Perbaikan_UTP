class VIP extends TiketKonser {
    public VIP() {
        super("VIP");
    }

    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.VIP * jumlah;
    }
}
