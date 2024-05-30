package com.mascotemania.boundary;

import com.mascotemania.control.AgendaServicoControl;
import com.mascotemania.entity.Cliente; 
import com.mascotemania.entity.Pet;
import com.mascotemania.entity.Servicos;
import java.util.Scanner;

public class AgendaServicoBoundary {
    public AgendaServicoBoundary() {}

    public void agendaServico(Cliente cliente, Scanner scanner) {
        System.out.println("Para qual Pet deseja agendar serviço? Insira o ID.");
        cliente.getPets().forEach(pet -> {
            System.out.println(pet.getId()
            + " - " + pet.getNome() 
            + " - " + pet.getTipo());
        });
        
        int id = scanner.nextInt(); 

        System.out.println("Qual tipo de serviço? Insira o ID."); 
        System.out.println("1 - Remoção de subpelos - 30\n2 - Tosa tesoura - 30\n3 - Tosa higiênica - 40\n4 - Tosa máquina - 50\n5 - Tosa stripping -60");
        int servico = scanner.nextInt();

        System.out.println("Qual dia deseja realizar o seu serviço? Insira no formato: dia/mês - hora");
        Scanner scanner2 = new Scanner(System.in);
        String data = scanner2.nextLine();

        AgendaServicoControl agendaServicoControl = new AgendaServicoControl();
        int retorno = agendaServicoControl.agendaServico(cliente, id, servico, data);

        if (retorno == 200) {
            System.out.println("Agendamento realizado com sucesso"); 
            System.out.println("Seus agendamentos: ");
            cliente.getAgendamentos().forEach(agendamento -> {
                System.out.println(agendamento.getId()
                + " - " + agendamento.getPet().getNome() 
                + " - " + agendamento.getServicos()
                + " - " + agendamento.getData() 
                + " - " + agendamento.getPreco());
            });
        } else if (retorno == 404) {
            System.out.println("O ID do servico desejado não existe.");
        } else if (retorno == 409) {
            System.out.println("O ID do pet desejado não existe");
        }
    }
}
