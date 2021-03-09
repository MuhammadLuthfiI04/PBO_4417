public class BukuDemo{
    public static void main(String[] args){
        // PEMANGGILAN ATTRIBUTE
        
        Buku Demo = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007); // PARAMETER 
        Demo.cetakBuku();
        
        Buku Demo2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004); // PARAMETER 
        Demo2.cetakBuku();
    }
}