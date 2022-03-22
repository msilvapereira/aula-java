package exheranca;

/**
 *
 * @author Maria
 */
public class Pessoa {
    private String nome, RG;

    public Pessoa(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void print(){
        System.out.println("\n"
        +   "Nome: " + this.nome
        +   "\nRG: " + this.RG
        );
    }
}
