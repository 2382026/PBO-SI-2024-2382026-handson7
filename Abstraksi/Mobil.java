package Abstraksi;

public class Mobil extends Kendaraan {

    public Mobil(String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("Mobil Bergerak");
    }
}