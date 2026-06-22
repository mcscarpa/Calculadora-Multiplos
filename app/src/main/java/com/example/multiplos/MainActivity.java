package com.example.multiplos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
{

    Button btnPrimo;
    Button btnFatorial;

    Intent intPrimo;
    Intent intFatorial;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        configuracao();
        eventos();
    }

    private void configuracao()
    {
        btnPrimo = findViewById(R.id.btnPrimo);
        btnFatorial = findViewById(R.id.btnFatorial);
        intPrimo = new Intent(this, actPrimo.class);
        intFatorial = new Intent(this, actFatorial.class);
    }

    private void eventos()
    {
        btnPrimo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(intPrimo);
            }
        });

        btnFatorial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(intFatorial);
            }
        });
    }
}