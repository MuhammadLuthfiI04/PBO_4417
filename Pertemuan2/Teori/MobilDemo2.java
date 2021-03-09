class Mobil2 {
    // ATTRIBUTE
	String warna;
    int tahunProduksi;
    boolean on;
    int Gear = 0;

    // METHOD
    void hidupkanMobil(boolean on){ // Kondisi Mobil Hidup
        on = true;
        System.out.println("Kondisi: Hidup");
    }

    void matikanMobil(boolean on){ // Kondisi Mobil Mati
        on = false;
        System.out.println("Kondisi: Mati");
    }

    void UbahGigi(int newValue){ // Gear pada mobil
        Gear = Gear + newValue;
    }
}

public class MobilDemo2 {
    public static void main(String[] args){

	Mobil2 mobilku1 = new Mobil2();
        mobilku1.Gear = 1;
        mobilku1.warna = "Hitam";
        mobilku1.tahunProduksi = 2006;
        mobilku1.hidupkanMobil(true);
        System.out.println("Ubah Gigi: " + mobilku1.Gear);
        System.out.println("Warna: " + mobilku1.warna);
        System.out.println("Tahun: " + mobilku1.tahunProduksi);
        System.out.println("\n");

        Mobil2 mobilku2 = new Mobil2();

        mobilku2.Gear = 0;
        mobilku2.warna = "Merah";
        mobilku2.tahunProduksi = 2007;
        mobilku2.matikanMobil(false);
        System.out.println("Ubah Gigi: " + mobilku2.Gear);
        System.out.println("Warna: " + mobilku2.warna);
        System.out.println("Tahun: " + mobilku2.tahunProduksi);
  }
}
