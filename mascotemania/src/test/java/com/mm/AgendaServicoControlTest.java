package com.mm;

import com.mascotemania.control.AgendaServicoControl;
import com.mascotemania.entity.Agendamento;
import com.mascotemania.entity.Cliente;
import com.mascotemania.entity.Pet;
import com.mascotemania.Main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class AgendaServicoControlTest {
    private Control.AgendaServicoControl control; 
    private Cliente cliente;
    private Pet pet1;
    private Pet pet2; 

    @BeforeEach 
    public void setUp() {
        control = new RealizaCompraControl(); 
        pedidos = new ArrayList();
        Pedido pedido1 = new Pedido(1, "Ração", 2, 50.0, "Pendente");
        Pedido pedido2 = new Pedido(2, "Brinquedo", 1, 30.0, "Entregue");
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        cliente = new Cliente("1", "senha1", "João", "Silva", pedidos);
        pet1 = new Pet("1", "Diana", "Gato");
        pet2 = new Pet("2", "Luna", "Cachorro");
        cliente.adicionarPet(pet1);
        cliente.adicionarPet(pet2);
    }

    @Test 
    public void testAgendamentoRealizado() {
        int  resultado = control.agendaServico(cliente, 1, 1, "12/10 - 12:00");
        assertEquals(200, resultado);
    }

    @Test
    public void testPetNaoEncontrado() {
        int resultado = control.agendaServico(cliente, 10, 1, "12/10 - 12:00");
        assertEquals(409, resultado);
    }

    @Test
    public void testServicoNaoEncontrado()  {
        int resultado = control.agendaServico(cliente, 1, 10, "12/10 - 12:00");
        assertEquals(404, resultado);
    }
}
