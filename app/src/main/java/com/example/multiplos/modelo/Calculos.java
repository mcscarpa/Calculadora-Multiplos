package com.example.multiplos.modelo;

public class Calculos
{
    public String calcular(Integer num, String op)
    {
        String mensagem = "É primo";
        if (op.equals("primo"))
        {
            for(int i = 2; i < num / 2 + 1; i++)
            {
                if (num % i == 0)
                {
                    mensagem = "Não é primo";
                    break;
                }
            }
        }
        if (op.equals("fatorial"))
        {
            Integer controle = num;
            for (int i = 2; i < num; i++)
            {
                controle *= i;
            }
            mensagem = controle.toString();
        }
        return mensagem;
    }
}
