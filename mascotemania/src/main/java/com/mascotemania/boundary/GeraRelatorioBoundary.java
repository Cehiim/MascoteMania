package com.mascotemania.boundary; 

import java.util.Scanner;
import com.mascotemania.entity.Gerente;
import com.mascotemania.control.GeraRelatorioControl;
import com.mascotemania.entity.Tosador;
import java.util.ArrayList;

public class GeraRelatorioBoundary {
    public GeraRelatorioBoundary() {}

    public void geraRelatorio(Gerente gerente, Scanner scanner, ArrayList<Tosador> tosadores) {
        System.out.println("Qual tosador deseja verificar? Insira o ID.");
        tosadores.forEach(tosador -> {
            System.out.println(tosador.getId()
                    + " - " + tosador.getPrimeiroNome());
        });

        int id = scanner.nextInt(); 

        GeraRelatorioControl geraRelatorio = new GeraRelatorioControl();
        int retorno = geraRelatorio.geraRelatorio(gerente, id, tosadores);
        
        if (retorno == 200) {
            System.out.println("Relatório gerado com sucesso");
            System.out.println("Deseja enviar um relatório ao tosador? 1 para sim e 2 para sair");

            int relatorio = scanner.nextInt();

            if (relatorio == 1) {
                System.out.println("Insira a mensagem para enviar ao tosador");
                Scanner scanner2 = new Scanner(System.in);
                String mensagem = scanner2.nextLine();
                for (int i = 0; i < tosadores.size(); i ++) {
                    if (Integer.valueOf(tosadores.get(i).getId()) == id) {
                        tosadores.get(i).setRelatorio(mensagem);
                        System.out.println("Mensagem enviada: " + tosadores.get(i).getRelatorio()); 
                    }
                }
            }
        } else if (retorno == 404) {
            System.out.println("Id não encontrado\n");
        }
    }
}