package com.mascotemania.boundary;

import java.util.Scanner;

public class AgendaServicoBoundary {
  public AgendaServicoBoundary() {
  }

  public void agendaServico(Cliente cliente, Scanner scanner, Pet pet, Agendamento agendamento, Servicos servico, Unidades unidade) {
    System.out.println("---Agendar Serviço---");
    
    System.out.println("Insira o ID do pet.");
    cliente.getPets().forEach(pet -> {System.out.println(pet.toString());});
    int id_pet = scanner.nextInt();

    System.out.println("Insira o ID da unidade.");
    unidade.listarUnidades();
    int id_unidade = scanner.nextInt();

    System.out.println("Insira o ID do servico.");
    servico.listarServicos();
    int id_servico = scanner.nextInt();

    System.out.println("Insira a data do agendamento.");
    String data = scanner.next();

    System.out.println("Insira o horário do agendamento");
    String horario = scanner.next();

    AgendaServicoControl agendaServicoControl = new AgendaServicoControl();
    int retorno = agendaServicoControl.agendaServico(cliente, id_pet, id_unidade, id_servico, data, horario);

    if (retorno == 200) {
        System.out.println("Agendamento realizado");
        System.out.println("Pedidos e seus status atuais: ");
        cliente.getAgendamentos().forEach(agendamento -> {
            System.out.println(agendamento.getId()
                    + " - " + agendamento.getPet()
                    + " - " + agendamento.getUnidade()
                    + " - " + agendamento.getServicos()
                    + " - " + agendamento.getData()
                    + " - " + agendamento.getHorario()
                    + " - " + agendamento.getPreco());
        });
        System.out.println();
        } else {
            System.out.println("Não foi possível realizar o agendamento");
        }
        }
    }
}
