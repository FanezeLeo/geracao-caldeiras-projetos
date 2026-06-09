package br.com.caldeiras.desafio.java_collections.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {

    private double saldo;
    private List<Produto> produtos = new ArrayList<>();

    public Usuario(int saldo) {
        this.saldo = saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void compraComSaldo(double valor){
        this.saldo -= valor;
    }

    public void comprasOrdenadas(){
        Collections.sort(this.produtos);
        System.out.println(produtos);
    }
}
