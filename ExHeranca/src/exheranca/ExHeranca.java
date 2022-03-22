package exheranca;

/**
 *
 * @author 0040962113042
 */
    public class ExHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Regular maria = new Regular(5, 5, "RA", "Maria", "RG");
        maria.print();
        Assistente joao = new Assistente(8, "RA", "João", "RG");
        joao.print();
    }
    
}
