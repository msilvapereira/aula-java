package exheranca;

/**
 *
 * @author Maria
 */
public class Regular extends Aluno {
    private double prova1;
    private double prova2;

    public Regular(double prova1, double prova2, String RA, String nome, String RG) {
        super(RA, nome, RG);
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }
    
    public double media() {
        return (this.prova1+this.prova2)/2;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Nota 1: " + this.getProva1()
        + "\nNota 2: " + this.getProva2()
        + "\nMedia: " + media());
    }
}
