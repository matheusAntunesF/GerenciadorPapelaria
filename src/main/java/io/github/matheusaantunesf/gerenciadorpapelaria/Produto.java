/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.gerenciadorpapelaria;
import java.math.BigDecimal;
/**
 *
 * @author mathe
 */
public class Produto {
    private String nome;
    private BigDecimal preco;
    private BigDecimal desconto;
    private Integer quantidadeDisponivel;

    public Produto(){
        quantidadeDisponivel = 0;
    }
    //<editor-fold defaultstate="collapsed" desc="gettersSetters">
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
//</editor-fold>

    public Integer acrescentarEstoque(Integer quantidade){
        setQuantidadeDisponivel(quantidadeDisponivel + quantidade);
        return quantidadeDisponivel;
    }
    public Integer removerEstoque(Integer quantidade){
        if(quantidade>quantidadeDisponivel){
            return -1;
        } else{
            setQuantidadeDisponivel(quantidadeDisponivel - quantidade);
            return quantidadeDisponivel;
        }
    }
    
}
