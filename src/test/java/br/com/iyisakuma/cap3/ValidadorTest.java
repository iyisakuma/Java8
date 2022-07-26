package br.com.iyisakuma.cap3;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorTest {

    private Validador<String> validador;
    @Before
    public void inicializaValidador(){
        validador  = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
    }
    @Test
    public void testaCpfValido() {
        Assert.assertTrue(validador.valida("04101-300"));
    }

    @Test
    public void testaCPFInvalido(){
        Assert.assertFalse(validador.valida("0494232-948"));
    }
}