public class matematika {
    int hasil = 0;
    int bilangan1 = 0;
    
    // Rumus Pertambahan 
    void pertambahan(int newBilangan){
        hasil =  bilangan1 + newBilangan;
        System.out.println("\nPertambahan: "+ bilangan1 + " + " + newBilangan + " = " + hasil);
    }
    
    // Rumus Pengurangan 
    void pengurangan(int newBilangan){
        hasil =  bilangan1 - newBilangan;
        System.out.println("\nPengurangan: "+ bilangan1 + " - " + newBilangan + " = " + hasil);
    }
    
    // Rumus Perkalian 
    void perkalian(int newBilangan){
        hasil =  bilangan1 * newBilangan;
        System.out.println("\nPerkalian: "+ bilangan1 + " x " + newBilangan + " = " + hasil);
    }
    // Rumus Pembagian 
    void pembagian(int newBilangan){
        hasil =  bilangan1 / newBilangan;
        System.out.println("\nPembagian: "+ bilangan1 + " / " + newBilangan + " = " + hasil);
    }  
}
