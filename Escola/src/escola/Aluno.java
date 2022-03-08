/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author 0040962113014
 */
public class Aluno {
    private String nome;
    private double nota1, nota2;
    private int faltas;

    
    /// Construtores
    // Construtor que cria a classe com todos os parametros para todos os atributos da classe
    public Aluno(String nome, double nota1, double nota2, int faltas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    // Construtor que cria a classe com parametro do Nome e o resto definido para valores padrão (0)
    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.faltas = 0;
    }

    // Construtor que cria a classe sem parametro e um objeto vazio
    public Aluno() {
        this.nome = null;
        this.nota1 = 0;
        this.nota2 = 0;
        this.faltas = 0;
    }
    
    /// Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    /// Metódos
    // Metódo que ira adicionar uma falta a mais do valor já definido
    public void faltou() {
        this.faltas++;
    }   
    
    //      Metódo que ira definir a primeira nota do aluno a partir do parametro de mesmo nome do atributo,
    // porém com verificação para a faixa de valores entre 1 e 10
    public void prova1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inserida fora dos valores entre 0 e 10");
        }
    }
    
    //      Metódo que ira definir a segunda nota do aluno a partir do parametro de mesmo nome do atributo,
    // porém com verificação para a faixa de valores entre 1 e 10
    public void prova2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inserida fora dos valores entre 0 e 10");
        }
    }
    
    // Metódo que ira calcular a media a partir das duas notas previamente inseridas
    public double media() {
        return ((this.nota1 + this.nota2)/2) ;
    }
    
    // Metódo que ira informar se o aluno foi aprovado ou nao baseado em suas faltas e media
    public boolean aprovado() {
        if ( media() >= 6 && this.faltas <= 20) {
            return true;
        } else {
            return false;
        }     
    }
    
    // Metódo que ira imprimir o objeto inteiro e algumas condições como aprovação e média.
    public void resultado() {
        System.out.println(this.getNome());
        System.out.println(this.getFaltas());
        System.out.println(this.getNota1());
        System.out.println(this.getNota2());
        System.out.println("Média: " + media());
        System.out.println("Aprovado: " + aprovado());
    }
    
    
}
