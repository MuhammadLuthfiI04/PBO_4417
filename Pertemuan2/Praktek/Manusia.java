public class Manusia {
    String nama;
    boolean punyaTV;
    
    Manusia(){

    }

    Manusia(String nama){
        this.nama = nama;
    }

    String namaSaya(){
        return nama;
    }

    void beliTV(){
        punyaTV = true;
        System.out.println(punyaTV);
    }

    void jualSemuaTV(){
        punyaTV = false;
        System.out.println(punyaTV);
    }

    boolean cekTV(){
        return punyaTV;
    }
}

class TestTV{
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        man1.beliTV();
        man1.jualSemuaTV();
    }
}
