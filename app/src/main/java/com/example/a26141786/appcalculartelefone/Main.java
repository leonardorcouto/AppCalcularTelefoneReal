package com.example.a26141786.appcalculartelefone;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends AppCompatActivity {


    public EditText inputText;
    public RadioGroup radioGrupo;
    public TextView view;
    public float cost;
    public float desconto;
    public float inputNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.number);
        radioGrupo = findViewById(R.id.grupo);
        view = findViewById(R.id.texto);
    }

    public void CalcularCusto(View r)
    {
        if(radioGrupo.getCheckedRadioButtonId() == R.id.tim)
        {
            inputNumber = Float.parseFloat(inputText.getText().toString());
            cost = 60f * 0.020f * inputNumber;
            desconto = (cost / 60) * 5f;
            cost = cost -desconto;
            view.setText("O custo da ligação será de: " + cost);

        }

        else if(radioGrupo.getCheckedRadioButtonId() == R.id.vivo)
            {
                inputNumber = Float.parseFloat(inputText.getText().toString());
                cost = 60f * 0.025f * inputNumber;
                desconto = (cost / 60) * 5f;
                cost -= desconto;
                view.setText("O custo da ligação será de: " + cost);
            }

        else
            {
                inputNumber = Float.parseFloat(inputText.getText().toString());
                cost = 60f * 0.019f * inputNumber;
                desconto = (cost / 60) * 5f;
                cost -= desconto;
                view.setText("O custo da ligação será de: " + cost);
            }
    }
}
