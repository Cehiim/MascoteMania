package com.mm;

import com.mascotemania.control.GeraRelatorioControl;
import com.mascotemania.entity.Gerente;
import com.mascotemania.entity.Tosador;
import com.mascotemania.Main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GeraRelatorioControlTest {
    private GeraRelatorioControl control;
    private Gerente gerente;
    private ArrayList<Tosador> tosadores;

    @BeforeEach
    public void setUp() {
        control = new GeraRelatorioControl();
        tosadores = Main.tosadores;
        gerente = new Gerente("1", "senhagerente", "Paulo", "Cesar");
        tosadores.add(new Tosador("1", "senhatosador", "João", "Silva"));
    }

    @Test
    public void testGeraRelatorioValido() {
        int resultado = control.geraRelatorio(gerente, 1, tosadores); // ID de Tosador existente
        assertEquals(200, resultado);
    }

    @Test
    public void testGeraRelatorioInvalido() {
        int resultado = control.geraRelatorio(gerente, 999, tosadores); // ID de Tosador inexistente
        assertEquals(404, resultado);
    }
}
