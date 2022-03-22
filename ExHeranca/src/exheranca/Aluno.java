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
    
    @Override
    public void print(){
        super.print();
        System.out.println("RA: " + this.getRA());
    }
}
