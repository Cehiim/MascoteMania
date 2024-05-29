package com.mascotemania.control;

// import Entities.Cliente;
// import Boundary.CancelarPedidoBoundary;
// import Entities.Estoque;
import com.mascotemania.Main;
import com.mascotemania.entity.Cliente;
import com.mascotemania.boundary.CancelarPedidoBoundary;
import com.mascotemania.entity.Estoque;

public class CancelarPedidoControl {
    public CancelarPedidoControl() {}

    public void cancelarPedido(Cliente cliente) {
        CancelarPedidoBoundary cancelarPedidoBoundary = new CancelarPedidoBoundary();
        cancelarPedidoBoundary.cancelarPedido(cliente, Main.scanner, Main.estoque);
    }

    public int cancelaPedido(Cliente cliente, int idPedido, Estoque estoque) {
        for (int i = 0; i < cliente.getPedidos().size(); i++) {
            if (cliente.getPedidos().get(i).getId() == idPedido) {
                if (cliente.getPedidos().get(i).getStatus().equals("Entregue")) {
                    return 400;
                } else if (cliente.getPedidos().get(i).getStatus().equals("Em Transporte")) {
                    return 400;
                } else if (cliente.getPedidos().get(i).getStatus().equals("Cancelado")) {
                    return 409;
                }
                
                // Altera status do pedido para cancelado.
                cliente.getPedidos().get(i).setStatus("Cancelado");

                // Adiciona produtos do pedido cancelado ao estoque.
                estoque.adicionarProduto(cliente.getPedidos().get(i).getProduto(), cliente.getPedidos().get(i).getQuantidade());

                System.out.println("Produto retornado ao estoque.");
                System.out.println("Veja o estoque:\n");
                estoque.listarEstoque();

                return 200; // Pedido deletado
            }
        }
        return 404; // Pedido não encontrado
    }
}
