package exheranca;

/**
 *
 * @author Maria
 */
public class Assistente extends Aluno {
    private int faltas;

    public Assistente(int faltas, String RA, String nome, String RG) {
        super(RA, nome, RG);
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public double frequencia() {
        return (80-(double)faltas)*(double)100/80; // typecast
    }
    
    @Override
    public void print(){
        System.out.println("Nome: " + this.getNome()
        + "\nRG: " + this.getRG()
        + "\nRA: " + this.getRA()
      + "\nFaltas: " + this.getFaltas()
        + "\nFrequencia: " + frequencia() + "%");
    }
}
