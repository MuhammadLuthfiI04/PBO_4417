public class mobil {
    
    private String identitasMobil;
    private String merkMobil;
    public int harga;

    // konstruktor
    mobil(){
        identitasMobil="H1";
        merkMobil="Undefined";
        harga=5;
    }

    mobil(String idMobil, String merkMobil, int Harga){
        this.identitasMobil=idMobil;
        this.merkMobil=merkMobil;
        this.harga=harga;
    }

    // method
    public void setID(String idMobil){
        this.identitasMobil=idMobil;
    }

    public String getID(){
        return identitasMobil;
    }

    public void setHarga(int harga){
        this.harga=harga;
    }

    public int getHarga(){
        return harga;
    }
    
    public void setMerkMobil(String merkMobil){
        this.merkMobil=merkMobil;
    }

    public String getMerkMobil(){
        return merkMobil;
    }
}

