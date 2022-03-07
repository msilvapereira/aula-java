/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro;

/**
 *
 * @author 0040962113014
 */
public class Pessoa 
{
    private String nome, sobrenome;
    
    public Pessoa(String nome, String sobrenome)
    {
       this.nome = nome;
       this.sobrenome = sobrenome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getSobrenome()
    {
        return sobrenome;
    }
    
    public void print()
    {
        System.out.println(nome + " " + sobrenome);
    }
}
