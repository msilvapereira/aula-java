/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro;

/**
 *
 * @autora 0040962113014
 */
public class Pessoa 
{
    private String nome, sobrenome;
     
    
    public Pessoa(String nome, String sobrenome)
    {
       this.nome = nome;
       this.sobrenome = sobrenome;
    }
    
    //Construtor de cópia 
    
   public Pessoa(Pessoa outro)
   {
        this(outro.nome, outro.sobrenome);
   }
   
    
    public void setNome(String nome)
    {
        this.nome = nome; 
    }

    /* public Pessoa(String valNome, String valSobrenome)
    {
    nome= valNome;
    sobrenome= valSobrenome;
    }
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
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
