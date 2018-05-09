package com.example.nicolasstegmann.projeto3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {
    private String numero_ajudante = "19994413115";
    private String numero_rafael = "19994413115";
    private String numero_pai = "19994413115";
    public final static String numero = "id_numero_do_contato";

    private void openMessagesActivity(String numero_contato) {
        Intent intent = new Intent(this, Messages.class);
        intent.putExtra(numero, numero_contato);
        startActivity(intent);
        finish();
    }

    private void openMorseActivity(String numero_contato) {
        Intent intent = new Intent(this, MorseActivity.class);
        intent.putExtra(numero, numero_contato);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Button buttonajudante = (Button) findViewById(R.id.button_ajudante);
        Button buttonrafael = (Button) findViewById(R.id.button_rafael);
        //Button buttonpai = (Button) findViewById(R.id.button_pai);

        Intent intent = getIntent();
        final String typeofmessage = intent.getStringExtra(MainActivity.ToNext);
        Utils.showToast(ContactsActivity.this, typeofmessage);

        buttonajudante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (typeofmessage == "ready") {
                    openMessagesActivity(numero_ajudante);
                } else if (typeofmessage == "trans") {
                    openMorseActivity(numero_ajudante);
                }
            }
        });

        buttonrafael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (typeofmessage == "ready") {
                    openMessagesActivity(numero_rafael);
                } else if (typeofmessage == "trans") {
                    openMorseActivity(numero_rafael);

                }
            }
        });

       // buttonpai.setOnClickListener(new View.OnClickListener() {
           // @Override
         //   public void onClick(View v) {
        //        openMessagesActivity(numero_pai);
        //    }
      //  });
    }

}
