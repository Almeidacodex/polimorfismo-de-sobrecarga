
package sobrecarga;

public class Sobrecarga {

    public static void main(String[] args) {
        Cachorro c1;
        c1 = new Cachorro();
        
        c1.reagir(true);
        c1.reagir("Olá");
        c1.reagir("Sai cachorro daqui!");
        
        c1.reagir(11,22);
        c1.reagir(18,10);
        c1.reagir(14,12);
        
        c1.reagir(4,9.50f);
        c1.reagir(4,18.50f);
        
        c1.reagir(10,15.0f);
        
    }
    
    
}
