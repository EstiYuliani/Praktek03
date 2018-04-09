
package praktek03;
  
public class BubukMinumanAksi {
        public static void main(String[] args){
            BubukMinuman Hatta = new BubukMinuman ();
            
           Hatta.setMerk("Klasik");
           Hatta.setRasa("Green thaitea");
           Hatta.setJenis("Minuman Hot");
           Hatta.setHarga(8400)
                   ;
            Hatta.cetakInfo ();
            
             System.out.print("Merknya \t: ");
             System.out.println(Hatta.getMerk());
              System.out.print("Rasanya \t: ");
              System.out.println(Hatta.getRasa());
               System.out.print("Jenisnya \t: ");
               System.out.println(Hatta.getJenis());
                System.out.print("Harganya \t: ");
                System.out.println(Hatta.getHarga());
              
                    
        }
    
}
