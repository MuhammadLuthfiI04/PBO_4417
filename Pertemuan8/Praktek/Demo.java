import java.util.Scanner;

public class Demo implements data_mobil {
    public static void main(String[] agr){
        String DataNamaPembeli;
        String DataNoKTPPembeli;
        String DataNoHPPembeli;
        String DataNamaKaryawan;
        String DataNoKTPKaryawan;
        String DataNoHPKaryawan;
        String Jenis;
        String TipeMobil;
        String SettingHarga;
        int newHarga;
        boolean option;
        
        Scanner DataNamaPembeli_scan = new Scanner(System.in);
	Scanner DataNoKTPPembeli_scan = new Scanner(System.in);
        Scanner DataNoHPPembeli_scan = new Scanner(System.in);
	Scanner Jenis_scan = new Scanner(System.in);
        Scanner DataNamaKaryawan_scan = new Scanner(System.in);
	Scanner DataNoKTPKaryawan_scan = new Scanner(System.in);
        Scanner DataNoHPKaryawan_scan = new Scanner(System.in);
        Scanner TipeMobil_scan = new Scanner(System.in);
	Scanner SettingHarga_scan = new Scanner(System.in);
	Scanner newHarga_scan = new Scanner(System.in);
        
        
        System.out.print("Nama Karyawan: ");
	DataNamaKaryawan = DataNamaKaryawan_scan.nextLine();
        System.out.print("No KTP Karyawan: ");
	DataNoKTPKaryawan = DataNoKTPKaryawan_scan.nextLine();
        System.out.print("No HP Karyawan: ");
	DataNoHPKaryawan = DataNoHPKaryawan_scan.nextLine();
        pembelian karyawan1 = new pembelian(DataNamaKaryawan,DataNoKTPKaryawan,DataNoHPKaryawan);
        
        option=true;
        
        if(DataNamaKaryawan != null ) {
            option =true;
        }
        
        else{
            option =false;
        }
        
        if(option == true){
            System.out.println("1. Individu");
            System.out.println("2. Borongan");
            System.out.println("Pelanggan Individu atau Borongan ?");
            System.out.print("Jenis: ");
            Jenis = Jenis_scan.nextLine();
            
            option=true;

            if(Jenis != null ) {
                option =true;
            }

            else{
                option =false;
            }
            
            if( option == true ) {
                if(Jenis.equalsIgnoreCase("1")) {
                    System.out.print("Nama Pembeli: ");
                    DataNamaPembeli = DataNamaPembeli_scan.nextLine();
                    System.out.print("No KTP Pembeli: ");
                    DataNoKTPPembeli = DataNoKTPPembeli_scan.nextLine();
                    System.out.print("No HP Pembeli: ");
                    DataNoHPPembeli = DataNoHPPembeli_scan.nextLine();
                    pembelian Pembeli1 = new pembelian(DataNamaPembeli,DataNoKTPPembeli,DataNoHPPembeli);


                    while(option == true){
                        System.out.println("1. Mobil Sedan = Rp100000000");
                        System.out.println("2. MiniBus = Rp200000000");
                        System.out.println("3. Bus = Rp3000000000");
                        System.out.println("4. Checkout");
                        System.out.print("Input: ");
                        TipeMobil = TipeMobil_scan.nextLine();

                        if (TipeMobil != null){
                            option =true;
                        }

                        else{
                            option =false;
                        }    
                    }

                    Pembeli1.fakturPembeli();
                    System.out.println("Ingin merubah Harga");
                    System.out.println("1. ya");
                    System.out.println("2. tidak");
                    System.out.print("Pilih: ");
                    SettingHarga = SettingHarga_scan.nextLine();

                    if( SettingHarga.equals("1")) {
                        System.out.print("Harga Baru: ");
                        newHarga = newHarga_scan.nextInt();
                        karyawan1.setHarga(newHarga);
                    }

                    karyawan1.fakturKaryawan();
                }
            }
        }   
    }	
}
