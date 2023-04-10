package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Ingredientes;
import br.newtonpaiva.dominio.Massa;
import br.newtonpaiva.dominio.Pedido;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.parseFloat;

public class Cantina {
    static public JOptionPane frame;

    public static void main(String[] args){
        Ingredientes bacon = new Ingredientes();
        bacon.setNome("Bacon");
        Ingredientes mussarela = new Ingredientes();
        bacon.setNome("Mussarela");
        Ingredientes tomate = new Ingredientes();
        bacon.setNome("Tomate");
        Ingredientes queijo = new Ingredientes();
        bacon.setNome("Queijo");

        Massa massa = new Massa();

        Cliente cliente = new Cliente();

        List ingredientes = new ArrayList();

        cliente.setNome(JOptionPane.showInputDialog(null, "Informe o nome do Cliente", "Nome do cliente", JOptionPane.QUESTION_MESSAGE));
        massa.setTipo(JOptionPane.showInputDialog(null, "Informe o tipo da Massa", "Tipo da Massa", JOptionPane.QUESTION_MESSAGE));
        massa.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da Massa", "Tipo da Massa", JOptionPane.QUESTION_MESSAGE)));
        int opcao = 0;

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingredientes adicionais: \n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair", "Ingredientes Extras", JOptionPane.QUESTION_MESSAGE));

            switch (opcao){
                case 1:
                    ingredientes.add(bacon);
                    break;
                case 2:
                    ingredientes.add(mussarela);
                    break;
                case 3:
                    ingredientes.add(tomate);
                    break;
                case 4:
                    ingredientes.add(queijo);
                    break;
                default:
                    break;
            }
        }

        Pedido pedido = new Pedido();

        pedido.setMassa(massa);
        pedido.setCliente(cliente);
        pedido.setIngredientes(ingredientes);

        pedido.printPedido();
        
    }
}
