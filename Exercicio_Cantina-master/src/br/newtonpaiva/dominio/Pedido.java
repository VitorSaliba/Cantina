package br.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private List ingredientes = new ArrayList();

    public Float calcValor(){
        float valor;
        valor = ingredientes.size() * 2;

        return valor;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void printPedido(){
        System.out.println("Pedido feito por " + this.cliente.getNome() + "\n" + this.massa.getTipo() + " com ");
        for (int i=0; i<ingredientes.size(); i++){
            Ingredientes nomes = (Ingredientes) ingredientes.get(i);
            System.out.println(nomes.getNome() + "\n");
        }
        float valorFinal;
        valorFinal = calcValor() + this.massa.getValor();
        System.out.println("Valor: " + valorFinal);
    }
}
