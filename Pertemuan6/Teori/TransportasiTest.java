import Transportasi.Sepeda;
import Transportasi.Mobil;

public class TransportasiTest{
    public static void main(String[] args){
        Sepeda Test = new Sepeda();
        Test.JalanLurus();
        Test.JalanKiri();
        Test.JalanKanan();
        Mobil Latihan = new Mobil();
        Latihan.hidupkan();
        Latihan.matikan();
        Latihan.naikGigi();
        Latihan.turunGigi();
    }
}