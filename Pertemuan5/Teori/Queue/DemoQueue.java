import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    Queue<Integer> kue =  new LinkedList<Integer>();
    // TAMBAH ELEMENTS 0-10
    public void ElementsQueue(){
        for (int i = 0; i < 10; i++)
            kue.add(i);
        System.out.println("Elements of queue "+ kue);   
    }
}

class methodQueue extends DemoQueue{
    // HAPUS ELEMENTS DARI DEPAN
    void rmv(){
        int hapus = kue.remove();
        System.out.println("Element yang dihapus= " + hapus);
        System.out.println(kue);
    }
    // REMOVE HEAD ELEMENTS
    void change(){
        int ganti = kue.poll();
        kue.offer(10);
        System.out.println("head Elements of queue now: " + ganti);
    }
    // ANGKA QUEUE DEPAN
    void AngkaDepan(){
        int depan = kue.peek();
        System.out.println("Elements of queue now "+ kue);   
        System.out.println("head Elements of queue now = " + depan);
    }
    // PANJANG SEBUAH QUEUE
    void panjangList(){
        int size = kue.size();
        System.out.println("Panjang element queue= " + size);
    }

    void output(){
        super.ElementsQueue();
        rmv();
        change();
        AngkaDepan();
        panjangList();
    }
}

class Demo{
    public static void main(String[] args){
        methodQueue Test = new methodQueue();
        Test.output();
    }
}

