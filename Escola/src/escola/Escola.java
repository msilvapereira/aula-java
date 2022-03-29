package escola;
/**
 *
 * @author 0040962113014
 */
public class Escola {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João Ulisses", "57.421.368-9");
        p1.imprimir();
        Aluno a1 = new Aluno("105.504.580-6", "Noturno", "Maria Eduarda", "78.698.658-8" );
        a1.trancar();
        a1.imprimir();
        a1.destrancar();
        a1.imprimir();
        a1.desistir();
        a1.imprimir();
        Professor prof1 = new Professor("Exatas", 35, 8, "Fabricio", "21.635.953-7");
        prof1.imprimir();
        
    }
}