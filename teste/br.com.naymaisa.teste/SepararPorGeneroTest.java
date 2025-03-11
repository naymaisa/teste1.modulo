package br.com.naymaisa.teste;

import br.com.naymaisa.SepararPorGenero;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SepararPorGeneroTest {

    @Test
    public void testSepararPorGenero() {

        String input = "Maria-F\nJoao-M\nAna-F\nCarlos-M\nsair\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream); // Redireciona o Scanner para a entrada simulada


        List<String> resultado = SepararPorGenero.separarPorGenero();


        assertTrue(resultado.contains("Maria"));
        assertTrue(resultado.contains("Ana"));
        assertFalse(resultado.contains("Joao"));
        assertFalse(resultado.contains("Carlos"));
    }
}
