package com.mm;

// import Control.CancelarPedidoControl;
// import Entities.Cliente;
// import Entities.Estoque;
// import Entities.Pedido;

import com.mascotemania.control.CancelarPedidoControl;
import com.mascotemania.entity.Cliente;
import com.mascotemania.entity.Estoque;
import com.mascotemania.entity.Pedido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CancelarPedidoControlTest {
    private CancelarPedidoControl control;
    private Cliente cliente;
    private Estoque estoque;
    private ArrayList<Pedido> pedidos;

    @BeforeEach
    public void setUp() {
        control = new CancelarPedidoControl();
        estoque = new Estoque();
        estoque.adicionarProduto("Ração", 10);
        estoque.adicionarProduto("Brinquedo", 10);

        pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1, "Ração", 2, 50.0, "Pendente");
        Pedido pedido2 = new Pedido(2, "Brinquedo", 1, 30.0, "Entregue");
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        cliente = new Cliente("1", "senha1", "João", "Silva", pedidos);
    }

    @Test
    public void testCancelaPedidoPendente() {
        int resultado = control.cancelaPedido(cliente, 1, estoque);
        assertEquals(200, resultado);
        assertEquals("Cancelado", pedidos.get(0).getStatus());
    }

    @Test
    public void testCancelaPedidoEntregue() {
        int resultado = control.cancelaPedido(cliente, 2, estoque);
        assertEquals(400, resultado);
    }

    @Test
    public void testCancelaPedidoNaoEncontrado() {
        int resultado = control.cancelaPedido(cliente, 999, estoque); // ID inexistente
        assertEquals(404, resultado);
    }
}
