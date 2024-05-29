package Control;

import Entities.Cliente;
import Boundary.RealizaCompraBoundary;
import Entities.Estoque;
import Entities.Pedido;

public class RealizaCompraControl {
    public RealizaCompraControl() {}

    public void realizaCompra(Cliente cliente) {
        RealizaCompraBoundary realizaCompraBoundary = new RealizaCompraBoundary(); 
        realizaCompraBoundary.realizaCompra(cliente, Main.scanner, Main.estoque);
    }

    public int realizaCompra(Cliente cliente, int idEstoque, int qntd, Estoque estoque) {
        String produto;
        double valor;
        if (idEstoque == 1) {
            valor = 25;
            produto = "Ração";
        } else if (idEstoque == 2) {
            valor = 15;
            produto = "Remédio";
        } else if (idEstoque == 3) {
            produto = "Brinquedo";
            valor = 50;
        } else if (idEstoque == 4) {
            produto = "Cama";
            valor = 100;
        } else if (idEstoque == 5) {
            produto = "Coleira";
            valor = 30;
        } else {
            return 404; //Pedido não encontrado
        }
        if (estoque.getEstoque().get(produto) < qntd) {
            return 409; //Quantidade maior que o estoque
        }
        Pedido pedido = new Pedido(cliente.getTamanhoPedidos()+1, produto, qntd, valor, "Em andamento");
        cliente.adicionarPedido(pedido);
        estoque.removerProduto(produto, qntd);
        return 200; //Pedido criado
    }
}
