package Boundary;

import java.util.Scanner;
import Entities.Cliente;
import Control.RealizaCompraControl;
import Entities.Estoque;

public class RealizaCompraBoundary {
    public RealizaCompraBoundary() {}

    public void realizaCompra(Cliente cliente, Scanner scanner, Estoque estoque) {
        System.out.println("Qual produto deseja comprar? Insira o ID.");
        estoque.listarEstoqueValores();

        int id = scanner.nextInt();

        System.out.println("Quantas unidades desse produto deseja comprar?");

        int qntd = scanner.nextInt();

        RealizaCompraControl realizaCompraControl = new RealizaCompraControl();
        int retorno = realizaCompraControl.realizaCompra(cliente, id, qntd, estoque);

        if (retorno == 200) {
            System.out.println("Pedido realizado");
            System.out.println("Pedidos e seus status atuais: ");
            cliente.getPedidos().forEach(pedido -> {
                System.out.println(pedido.getId()
                        + " - " + pedido.getProduto()
                        + " - " + pedido.getQuantidade()
                        + " - " + pedido.getPreco()
                        + " - " + pedido.getStatus());
            });
            System.out.println();
            } else if (retorno == 404) {
                System.out.println("Produto não encontrado");
            } else if (retorno == 409) {
                System.out.println("Quantidade maior que o estoque");
            }
        }
    }