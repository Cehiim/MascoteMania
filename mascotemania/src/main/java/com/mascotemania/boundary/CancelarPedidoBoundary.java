package com.mascotemania.boundary;

import java.util.Scanner;

// import Entities.Cliente;
// import Control.CancelarPedidoControl;
// import Entities.Estoque;
import com.mascotemania.entity.Cliente;
import com.mascotemania.control.CancelarPedidoControl;
import com.mascotemania.entity.Estoque;

public class CancelarPedidoBoundary {
    public CancelarPedidoBoundary() {
    }

    public void cancelarPedido(Cliente cliente,  Scanner scanner, Estoque estoque) {
        System.out.println("Qual pedido deseja cancelar? Insira o ID.");
        cliente.getPedidos().forEach(pedido -> {
            System.out.println(pedido.getId()
                    + " - " + pedido.getProduto()
                    + " - " + pedido.getQuantidade()
                    + " - " + pedido.getPreco()
                    + " - " + pedido.getStatus());
        });

        int id = scanner.nextInt();

        CancelarPedidoControl cancelarPedidoControl = new CancelarPedidoControl();
        int retorno = cancelarPedidoControl.cancelaPedido(cliente, id, estoque);

        if (retorno == 200) {
            System.out.println("Pedido cancelado.");
            System.out.println("Pedidos e seus status atuais: ");
            cliente.getPedidos().forEach(pedido -> {
                System.out.println(pedido.getId()
                        + " - " + pedido.getProduto()
                        + " - " + pedido.getQuantidade()
                        + " - " + pedido.getPreco()
                        + " - " + pedido.getStatus());
            });
            System.out.println();
        } else if (retorno == 400) {
            System.out.println("Pedido já entregue ou em transporte, não pode ser cancelado.\n");
        } else if (retorno == 404) {
            System.out.println("Pedido não encontrado.\n");
        } else if (retorno == 409) {
            System.out.println("Pedido já cancelado.\n");
        }
    }
}
