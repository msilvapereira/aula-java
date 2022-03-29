/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author 0040962113014
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria");
        aluno.faltou();
        aluno.faltou();
        aluno.prova1(10);
        aluno.prova2(5);
        aluno.resultado();
    }
    
}
