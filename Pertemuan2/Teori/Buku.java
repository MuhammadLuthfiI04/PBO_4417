public class Buku {
    // METHOD SETTER AND GETTER

    // ATTRIBUTE PADA BUKU
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private int Tahun;

    public Buku(String Judul, String Pengarang, String Penerbit, int Tahun){
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }

    public void cetakBuku(){
        System.out.println("Judul: " + Judul);
        System.out.println("Pengarang: " + Pengarang);
        System.out.println("Penerbit: " + Penerbit);
        System.out.println("Tahun: " + Tahun);
    }
}