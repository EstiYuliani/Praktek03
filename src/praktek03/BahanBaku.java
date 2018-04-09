package praktek03;


public class BahanBaku {
    String gula ;
    String bubukpowder ;
    String perasa ;
    
    void cetakInfo (){
        System.out.println("Gula \t: "+gula+"\n"+
                           "Bubukpowder \t: "+bubukpowder+"\n"+
                           "Perasa \t: "+perasa ) ;
}

    public String getGula() {
        return gula;
    }

    public void setGula(String gula) {
        this.gula = gula;
    }

    public String getBubukpowder() {
        return bubukpowder;
    }

    public void setBubukpowder(String bubukpowder) {
        this.bubukpowder = bubukpowder;
    }

    public String getPerasa() {
        return perasa;
    }

    public void setPerasa(String perasa) {
        this.perasa = perasa;
    }
    
}
