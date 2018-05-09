package com.example.nicolasstegmann.projeto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MorseActivity extends AppCompatActivity {
    private String mensagem_morse;
    private String mensagem_traduzida;
    private char letra;
    private Translator translator = new Translator();

    protected void openDicionarioActivity() {
        Intent intent2 = new Intent(this, Dicionario.class);
        startActivity(intent2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse);

        Intent intent = getIntent();
        final String numero_a = intent.getStringExtra(Messages.numero);


        mensagem_morse = "";
        mensagem_traduzida = "";
        Button MorseTranslator = (Button) findViewById(R.id.MorseTranslator);
        Button SendButton = (Button) findViewById(R.id.Send_button);
        Button Dicionario = (Button) findViewById(R.id.Dict);
        Button Erase = (Button) findViewById(R.id.EraseButton);
        Button Next = (Button) findViewById(R.id.NextChar);
        final TextView traducao = (TextView) findViewById(R.id.TextoTraduzido);


        MorseTranslator.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mensagem_morse += '-';
                Utils.showToast(MorseActivity.this, mensagem_morse);
                return true;
            }
        });

        MorseTranslator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem_morse += '.';
                Utils.showToast(MorseActivity.this, mensagem_morse);
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letra = translator.morseToChar(mensagem_morse);
                mensagem_traduzida += letra;
                traducao.setText(mensagem_traduzida);
                mensagem_morse = "";
            }
        });

        Erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensagem_traduzida = mensagem_traduzida.substring(0, mensagem_traduzida.length()-1);
                traducao.setText(mensagem_traduzida);
            }
        });

        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!PhoneNumberUtils.isGlobalPhoneNumber(numero_a)) {
                    Utils.showToast(MorseActivity.this, numero_a);
                    Utils.showToast(MorseActivity.this, "Telefone inválido!");
                    return;
                }

                SmsManager manager = SmsManager.getDefault();
                manager.sendTextMessage(numero_a, null, mensagem_traduzida, null, null);
                Utils.showToast(MorseActivity.this, "Mensagem enviada");
            }
        });

        Dicionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDicionarioActivity();
            }
        });

    }
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, ContactsActivity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }
}
