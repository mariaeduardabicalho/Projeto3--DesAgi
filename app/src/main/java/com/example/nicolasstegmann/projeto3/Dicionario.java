package com.example.nicolasstegmann.projeto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dicionario extends AppCompatActivity {
    public LinkedList <String> lista_morse = new LinkedList<String>();
    public LinkedList <String> lista_traduzida= new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);
        Translator translator = new Translator();
        lista_morse.add("a");
        lista_morse.add("b");
        lista_morse.add("c");
        lista_morse.add("d");
        lista_morse.add("e");
        lista_morse.add("f");
        lista_morse.add("g");
        lista_morse.add("h");
        lista_morse.add("i");
        lista_morse.add("j");
        lista_morse.add("k");
        lista_morse.add("l");
        lista_morse.add("m");
        lista_morse.add("n");
        lista_morse.add("o");
        lista_morse.add("p");
        lista_morse.add("q");
        lista_morse.add("r");
        lista_morse.add("s");
        lista_morse.add("t");
        lista_morse.add("u");
        lista_morse.add("v");
        lista_morse.add("w");
        lista_morse.add("x");
        lista_morse.add("y");
        lista_morse.add("z");
        lista_morse.add("1");
        lista_morse.add("2");
        lista_morse.add("3");
        lista_morse.add("4");
        lista_morse.add("5");
        lista_morse.add("6");
        lista_morse.add("7");
        lista_morse.add("8");
        lista_morse.add("9");

        String traduzido;
        for ( String element : lista_morse) {
            char conversor = element.charAt(0);
            traduzido = translator.charToMorse(conversor);
            lista_traduzida.add(traduzido);
        }


        ListView dicionarioListview = (ListView) findViewById(R.id.dicionario_listview);
        HashMap<String, String> letraTraducao = new HashMap<>();

        for (int i = 0; i <= 33; ++i) {
            letraTraducao.put(lista_morse.get(i),lista_traduzida.get(i));
        }


        List<HashMap<String, String>> itensLista = new ArrayList<>();
        SimpleAdapter adaptador = new SimpleAdapter(this, itensLista, R.layout.itemlista,
                new String[]{"Letra", "Tradução"},
                new int[]{R.id.texto1, R.id.texto2});
        Iterator iterator = letraTraducao.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap<String,String> mapa_resultados = new HashMap<>();
            Map.Entry juntos = (Map.Entry)iterator.next();
            mapa_resultados.put("Letra", juntos.getKey().toString());
            mapa_resultados.put("Tradução", juntos.getValue().toString());
            itensLista.add(mapa_resultados);
        }

        dicionarioListview.setAdapter(adaptador);
    }
}




