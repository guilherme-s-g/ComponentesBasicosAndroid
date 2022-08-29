package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity
{
    private EditText campoNome;
    private TextInputEditText emailDigitado;
    private TextView textoResultado;
    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        emailDigitado = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        sexoFeminino = findViewById(R.id.radioButtonFeminino);

        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radiobutton();
    }

    public void radiobutton()
    {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId)
            {
                if(checkId == R.id.radioButtonMasculino)
                {
                    textoResultado.setText("Masculino");

                }
                else if(checkId == R.id.radioButtonFeminino)
                {
                    textoResultado.setText("Feminino");
                }
            }
        });


//        String texto = "";
//        if(sexoMasculino.isChecked())
//        {
//            textoResultado.setText("Masculino");
//        }
//        else if(sexoFeminino.isChecked())
//        {
//            textoResultado.setText("Feminino");
//        }




    }

    public void enviar(View view)
    {
//        radiobutton();

//        String nome = campoNome.getText().toString();
//        String email = emailDigitado.getText().toString();
//        textoResultado.setText("Nome: "+ nome + " Email: "  +  email);
    }

    public void limpar(View view)
    {
        campoNome.setText("");
        emailDigitado.setText("");

    }

}