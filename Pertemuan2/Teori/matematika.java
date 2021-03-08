public class matematika {
    int hasil = 0;
    int bilangan1 = 0;

    void pertambahan(int newBilangan){
        hasil =  bilangan1 + newBilangan;
        System.out.println("\nPertambahan: "+ bilangan1 + " + " + newBilangan + " = " + hasil);
    }
    
    void pengurangan(int newBilangan){
        hasil =  bilangan1 - newBilangan;
        System.out.println("\nPengurangan: "+ bilangan1 + " - " + newBilangan + " = " + hasil);
    }
    
    void perkalian(int newBilangan){
        hasil =  bilangan1 * newBilangan;
        System.out.println("\nPerkalian: "+ bilangan1 + " x " + newBilangan + " = " + hasil);
    }
    
    void pembagian(int newBilangan){
        hasil =  bilangan1 / newBilangan;
        System.out.println("\nPembagian: "+ bilangan1 + " / " + newBilangan + " = " + hasil);
    }  
}
