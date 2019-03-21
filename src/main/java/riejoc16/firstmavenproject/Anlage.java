package riejoc16.firstmavenproject;

public class Anlage {
    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;
    
    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
        this.buchwert = anschaffungswert;
    }
    
    public double jahresAfa(){
        return anschaffungswert/nutzungsdauer;
    }
    
    public void updateBuchwert(int jahreGenutzt){
       double buchwertBuffer = anschaffungswert-(jahresAfa()*jahreGenutzt); 
       if(buchwertBuffer <= 0){
           buchwert = 1.0;
       }
       else{
           buchwert = buchwertBuffer;
       }
    }

    public double getBuchwert() {
        return buchwert;
    }
    
}
