class VVIP extends TiketKonser {
    public VVIP() {
        super("UNLIMITED EXPERIENCE");
    }

    @Override
    public double hitungTotalHarga(int jumlah) {
        return HargaTiket.VVIP * jumlah;
    }
}
