package escola;
/**
 *
 * @author Maria Eduarda, João Ulisses
 */
public class Pessoa {
    private String nome, RG;

    public Pessoa(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
    }
    
    public Pessoa() {
        this.nome = null;
        this.RG = null;
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
    
    public void imprimir() {
        System.out.println("\nNome: " + this.getNome() 
                + "\nRG: " + this.getRG());
    }
}
