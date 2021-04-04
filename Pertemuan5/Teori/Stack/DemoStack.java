import java.util.Stack;

public class DemoStack {
    static Stack<Integer> tumpuk =  new Stack<>();

    // TAMBAH ELEMENTS 1-5
    static void StackPush(){
        for (int i = 1; i < 5; i++){
            tumpuk.push(i);
        System.out.println("Push: " + i);
        }
        System.out.println("stack: " + tumpuk);
    }
}

class methodStack extends DemoStack{
    // HAPUS ELEMENTS DARI BELAKANG
    static void StackPop(){
        Integer elements = (Integer) tumpuk.pop();
        System.out.println("Pop: " + elements);
        System.out.println("Stack: " + tumpuk);
    }
    
    static void StackSet(){
        Integer SetElements = (Integer) tumpuk.set(1,5);
        System.out.println("modify index of elements: " + SetElements);
        System.out.println("Stack: " + tumpuk);
    }
    void output(){
        super.StackPush();
        StackPop();
        StackPop();
        StackSet();
    }
}

class Coba{
    public static void main(String[] args){
        methodStack Test = new methodStack();
        Test.output();
    }
}
