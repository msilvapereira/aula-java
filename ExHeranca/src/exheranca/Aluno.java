package exheranca;

/**
 *
 * @author Maria
 */
public class Aluno extends Pessoa{
    private String RA;

    public Aluno(String RA, String nome, String RG) {
        super(nome, RG);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    
    public void print(){
        System.out.println("Nome: " + this.getNome()
        + "\nRG: " + this.getRG()
        + "\nRA: " + this.getRA());
    }
}
