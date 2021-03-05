package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView trocarfoto;
    private EditText editPeso,editAltura;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trocarfoto = findViewById(R.id.trocadeimagem);
        editPeso = findViewById(R.id.textoPeso);
        editAltura = findViewById(R.id.textoAltura);
        textoResultado = findViewById(R.id.textResultado);
    }

    public void calcularImc(View view)
    {
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double imc = peso/(altura*altura);

        if(imc<18.5)
        {
            textoResultado.setText("Você está abaixo do peso ideal, IMC =" + imc);
            trocarfoto.setImageResource(R.drawable.magro);

        }else if (imc>=18.5 && imc<24.99)
        {
            textoResultado.setText("Você está no peso ideal, IMC=" + imc);
            trocarfoto.setImageResource(R.drawable.normal);

        }else if (imc>25.0 && imc<29.9)
        {
            textoResultado.setText("Você está na pré obesidade, IMC=" + imc);
            trocarfoto.setImageResource(R.drawable.normal);

        }else if (imc>30 && imc<34.9)
        {
            textoResultado.setText("Você está no grau de obesidade I, IMC=" + imc);
            trocarfoto.setImageResource(R.drawable.gordo);

        }else if (imc>35 && imc<39.9)
        {
            textoResultado.setText("Você está no graus de obesidade II, IMC=" + imc);
            trocarfoto.setImageResource(R.drawable.gordo);

        }else if (imc>40)
        {
            textoResultado.setText("Você está no graus de obesidade Mórbida, IMC=" + imc);
            trocarfoto.setImageResource(R.drawable.gordo);

        }
    }
}
