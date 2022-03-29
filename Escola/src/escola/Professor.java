package escola;
/**
 *
 * @author Maria Eduarda, João Ulisses
 */
public class Professor extends Funcionario {
    private String area;

    public Professor(String area, int salario_hora, int quantidade_horas, String nome, String RG) {
        super(salario_hora, quantidade_horas, nome, RG);
        this.area = area;
    }

    public Professor() {
        super(0, 0, null, null);
        this.area = null;
    } 

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Area: " + this.getArea());
    }
}
