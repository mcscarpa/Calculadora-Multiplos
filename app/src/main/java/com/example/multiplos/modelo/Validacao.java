package com.example.multiplos.modelo;

public class Validacao
{
    public Integer num;
    public String mensagem;
    public void validarNumero(String numero)
    {
        mensagem = "";
        try
        {
            num = Integer.parseInt(numero);
        }
        catch (Exception e)
        {
            mensagem = "Digite valores válidos";
        }
    }
}
