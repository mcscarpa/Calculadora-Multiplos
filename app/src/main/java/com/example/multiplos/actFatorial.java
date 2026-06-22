package com.example.multiplos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multiplos.modelo.Controle;

public class actFatorial extends AppCompatActivity
{
    EditText edtNumeroFatorial;
    Button btnCalcularFatorial;
    TextView txvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_act_fatorial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        configuracoes();
        eventos();
    }
    private void configuracoes()
    {
        edtNumeroFatorial = findViewById(R.id.edtNumeroFatorial);
        btnCalcularFatorial = findViewById(R.id.btnCalcularFatorial);
        txvResultado = findViewById(R.id.txvResultado);
    }
    private void eventos()
    {
        btnCalcularFatorial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Controle controle = new Controle();
                controle.executar(edtNumeroFatorial.getText().toString(), "fatorial");
                txvResultado.setText(controle.mensagem);
            }
        });
    }
}