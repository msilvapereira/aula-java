/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962113014
 */
public class Carro {
    private String placa;
    private int ano_Fabricacao;
    private String modelo;
    private double valor_Compra;
    private boolean disponivel;
    private String vendedor;
    private double valor_Venda;
    // Construtor
    public Carro(String placa, int ano_Fabricacao, String modelo, double valor_Compra) {
        this.placa = placa;
        this.ano_Fabricacao = ano_Fabricacao;
        this.modelo = modelo;
        this.valor_Compra = valor_Compra;
        this.disponivel = true;
    }
    
    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno_Fabricacao() {
        return ano_Fabricacao;
    }

    public void setAno_Fabricacao(int ano_Fabricacao) {
        this.ano_Fabricacao = ano_Fabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor_Compra() {
        return valor_Compra;
    }

    public void setValor_Compra(double valor_Compra) {
        this.valor_Compra = valor_Compra;
    }

    public String getVendedor() {
        return vendedor;
    }

    public double getValor_Venda() {
        return valor_Venda;
    }
    
    // Metódos
    public boolean disponivel() {
        return this.disponivel;
    }
    
    public boolean oferta(double valor) {
        return valor >= (((this.valor_Compra * 10)/100) + this.valor_Compra);
    }
    
    public boolean venderCarro(String vendedor, double valorVenda) {
        if (oferta(valorVenda) && disponivel) {
            this.valor_Venda = valorVenda;
            this.disponivel = false;
            this.vendedor = vendedor;
            return true;
        } else {
            return false;
        }
    }
    
    public double comissao() {
        if (!this.disponivel) {
            return (((this.valor_Venda - this.valor_Compra) * 10)/100);
        } else {
            return 0;
        }
    }
    
    public void imprimeDados() {
        System.out.println("Carro: " + this.modelo
        + "\nPlaca: " + this.placa
        + "\nAno de Fabricação: " + this.ano_Fabricacao
        + "\nValor de compra: " + this.valor_Compra
        + "\nDisponível: " + this.disponivel);
        
        if (!this.disponivel) {
            System.out.println("Vendedor: " + this.vendedor
            + "\nValor de venda: " + this.valor_Venda
            + "\nComissao: " + this.comissao());
        }
    }
}
