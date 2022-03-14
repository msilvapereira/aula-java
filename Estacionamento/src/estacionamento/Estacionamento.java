/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962113014
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro fusca = new Carro("joao321", 2020, "Fusca", 1000);
        System.out.println(fusca.disponivel());
        fusca.venderCarro("Maria", 5000);
        fusca.imprimeDados();
        
    }
    
}
