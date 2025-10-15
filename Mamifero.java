
package sobrecarga;

public class Mamifero extends Animal {
    
    // atributo 
    protected String corPelo;
    
    // getter e setter 

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String co) {
        this.corPelo = co;
    }
    
    

    @Override
    public void emitirSom() {
        System.out.println("Som do mamifero");
    }
    
    
    
}
