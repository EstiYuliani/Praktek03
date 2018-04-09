
package praktek03;

public class BubukMinuman {
    
    private String merk;
    private String rasa ;
    private String jenis ;
    private double harga ;
    
    void cetakInfo (){
        System.out.println("Merk \t: "+merk+"\n"+
                           "Rasa \t: "+rasa+"\n"+
                           "Jenis \t: "+jenis+"\n"+
                            "Harga \t:  "+harga) ;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
