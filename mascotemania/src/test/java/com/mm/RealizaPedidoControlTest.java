package com.mm;

import com.mascotemania.control.RealizaCompraControl;
import com.mascotemania.entity.Cliente;
import com.mascotemania.entity.Estoque;
import com.mascotemania.entity.Pedido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RealizaCompraControlTest {
    private RealizaCompraControl control;
    private Cliente cliente;
    private Estoque estoque;
    private ArrayList<Pedido> pedidos;

    @BeforeEach
    public void setUp() {
        control = new RealizaCompraControl();
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
    public void testCompraRealizada() {
        int resultado = control.realizaCompra(cliente, 2, 4, estoque);
        assertEquals(200, resultado);
    }

    @Test 
    public void testPedidoNaoEncontrado() {
        int resultado = control.realizaCompra(cliente, 20, 4, estoque);
        assertEquals(404, resultado);
    }

    @Test
    public void testQuantidadeExcedida() {
        int resultado = control.realizaCompra(cliente, 2, 20, estoque);
        assertEquals(409, resultado);
    }
}