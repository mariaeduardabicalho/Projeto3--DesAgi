package com.example.nicolasstegmann.projeto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MorseActivity extends AppCompatActivity {
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse);



        Button MorseTranslator = (Button) findViewById(R.id.MorseTranslator);
        Button SendButton = (Button) findViewById(R.id.Send_button);
        Button Dicionario = (Button) findViewById(R.id.Dict);
        Button Erase = (Button) findViewById(R.id.EraseButton);
        Button Next = (Button) findViewById(R.id.NextCharButton);

        MorseTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem += '.';
            }

            public void onLongClick(View view) {
                mensagem += '-';
            }

        });

    }
}
