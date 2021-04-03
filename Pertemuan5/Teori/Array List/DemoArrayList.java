import java.util.ArrayList;

public class DemoArrayList {

    ArrayList<String> arrListBuah = new ArrayList<>();
    ArrayList<String> arrListSayur = new ArrayList<>();
   
    public void printBuah(){
        arrListBuah.add("apel");
        System.out.println("List Buah: " + arrListBuah);
    }

    public void printSayur(){
        System.out.println("List Sayur: " + arrListSayur);
    }
}

class BuahSayur extends DemoArrayList{
    void Buah(){
        arrListBuah.add("Jeruk");
        arrListBuah.add("Durian");
        arrListBuah.add("Mangga");
    }

    void Sayur(){
        arrListSayur.add("Bayam");
        arrListSayur.add("Wortel");
    }

    void output(){
        Buah();
        Sayur();
        super.printBuah();
        super.printSayur();
    }
}

class Test {
    public static void main(String[] args){
        BuahSayur Demo = new BuahSayur();
        Demo.output();
    }
}
