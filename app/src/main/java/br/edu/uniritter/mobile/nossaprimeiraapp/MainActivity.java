package br.edu.uniritter.mobile.nossaprimeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.uniritter.mobile.nossaprimeiraapp.model.Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                                           SegundaActivity.class);
                intent.putExtra("mensagem", "opa, olá ai a mensagem");
                intent.putExtra("qtd", 189);
                Usuario usu = new Usuario(123, "jean", "1234", "Jean Paul");
                intent.putExtra("usuario", usu);
                startActivity(intent);
            }
        });
    }
}