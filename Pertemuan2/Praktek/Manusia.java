public class Manusia { //ATTRIBUTE ATAU PROPERTI
    String nama;
    boolean punyaTV;
    
    Manusia(){ //KONSTRUKSI KOSONG

    }

    Manusia(String nama){ // GETTER AND SETTER
        this.nama = nama;
    }

    String namaSaya(){ // MENGEMBALIKAN STRING NAMA
        return nama;
    }

    void beliTV(){ // METHOD MENGESET punyaTV MENJADI "true"
        punyaTV = true;
        System.out.println(punyaTV);
    }

    void jualSemuaTV(){ // METHOD MENGESET punyaTV MENJADI "false"
        punyaTV = false;
        System.out.println(punyaTV);
    }

    boolean cekTV(){ // METHOD MENGEMBALIKAN NILAI punyaTV
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
