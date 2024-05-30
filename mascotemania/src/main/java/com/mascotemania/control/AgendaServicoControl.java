package com.mascotemania.control;

import com.mascotemania.boundary.AgendaServicoBoundary;
import com.mascotemania.entity.Agendamento;
import com.mascotemania.entity.Cliente; 
import com.mascotemania.entity.Pet;
import com.mascotemania.entity.Servicos;
import com.mascotemania.Main;

public class AgendaServicoControl {
    public AgendaServicoControl() {}

    public void agendaServico(Cliente cliente) {
        AgendaServicoBoundary agendaServicoBoundary = new AgendaServicoBoundary();
        agendaServicoBoundary.agendaServico(cliente, Main.scanner);
    }

    public int agendaServico(Cliente cliente, int IDpet, int IDservico, String data) {
        String servico;
        float valor;
        if (IDservico == 1) {
            servico = "Remoção de subpelos";
            valor = 20;
        } else if (IDservico == 2) {
            servico = "Tosa tesoura";
            valor = 30;
        } else if (IDservico == 3) {
            servico = "Tosa higiênica";
            valor = 40;
        } else if (IDservico == 4) {
            servico = "Tosa máquina";
            valor = 50;
        } else if (IDservico == 5) {
            servico = "Tosa stripping";
            valor = 60;
        } else {
            return 404;
        }
        if (cliente.getPets().size() < IDpet) {
            return 409;
        }
        String IDagenda = String.valueOf(cliente.getAgendamentos().size() + 1);
        Agendamento agendamento = new Agendamento(IDagenda, cliente.getPets().get(IDpet), servico, data, valor);
        cliente.adicionarAgendamento(agendamento);
        return 200;
    }
}
