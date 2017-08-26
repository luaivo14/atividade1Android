package com.example.lua.atividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome, sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.editTextNome) ;
        sobrenome = (EditText) findViewById(R.id.editTextSobrenome);

    }

    public void Exibir(View view){
        Toast.makeText(MainActivity.this, nome.getText()+ " " +sobrenome.getText(), Toast.LENGTH_SHORT).show();
    }

    public void Limpar(View view){
        nome.setText("");
        sobrenome.setText("");
    }

}

