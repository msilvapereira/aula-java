package escola;
/**
 *
 * @author Maria Eduarda, João Ulisses
 */
public class Funcionario extends Pessoa {
    private double salario_hora;
    private int quantidade_horas;

    public Funcionario(double salario_hora, int quantidade_horas, String nome, String RG) {
        super(nome, RG);
        this.salario_hora = salario_hora;
        this.quantidade_horas = quantidade_horas;
    }

    public Funcionario() {
        super(null, null);
        this.salario_hora = 0;
        this.quantidade_horas = 0;
    }

    public double getSalario_hora() {
        return salario_hora;
    }

    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    public int getQuantidade_horas() {
        return quantidade_horas;
    }

    public void setQuantidade_horas(int quantidade_horas) {
        this.quantidade_horas = quantidade_horas;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salario Hora: " + this.getSalario_hora() 
                + "\nQuantidade de horas trabalhadas: " +this.getQuantidade_horas());
    }
}
