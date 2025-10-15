
package sobrecarga;

public abstract class Animal {
    // atributos 
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom();
    
    // getter e setter 

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int me) {
        this.membros = me;
    }
    
    
}
