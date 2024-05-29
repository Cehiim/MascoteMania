package com.mascotemania.control;

import com.mascotemania.entity.Gerente;
import com.mascotemania.entity.Tosador;
import java.util.ArrayList;
import com.mascotemania.boundary.GeraRelatorioBoundary;
 
public class GeraRelatorioControl {
    public GeraRelatorioControl() {}

    public void gerarRelatorio(Gerente gerente) {
        GeraRelatorioBoundary geraRelatorioBoundary = new GeraRelatorioBoundary();
        geraRelatorioBoundary.geraRelatorio(gerente, Main.scanner, Main.tosadores);
    }

    public int geraRelatorio(Gerente gerente, int idTosador, ArrayList<Tosador> tosadores) {
        for (int i = 0; i < tosadores.size(); i ++) {
            if (Integer.valueOf(tosadores.get(i).getId()) == idTosador) {
                System.out.println(tosadores.get(i).toString());
                return 200;
            }
        }
        return 404;
    }
}
