/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.matheusaantunesf.gerenciadorpapelaria;
import java.math.BigDecimal;

/**
 *
 * @author mathe
 */
public class GerenciadorPapelaria {

    public static void main(String[] args) {
        Produto caderno = new Produto();
        caderno.setNome("Caderno 10x Materias");
        caderno.setPreco(new BigDecimal("15.90"));
        caderno.setQuantidadeDisponivel(20);
        caderno.setDesconto(new BigDecimal("0.1"));
        
        System.out.println(">> Nome: " + caderno.getNome());
        System.out.println(">> Estoque: " + caderno.getQuantidadeDisponivel());
        
        Integer novoEstoque = caderno.removerEstoque(5);
        novoEstoque = caderno.acrescentarEstoque(3);
        System.out.println(">> Estoque: " + novoEstoque);
    }
}
