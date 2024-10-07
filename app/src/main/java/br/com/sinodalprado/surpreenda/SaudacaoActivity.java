package br.com.sinodalprado.surpreenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SaudacaoActivity extends Activity {

    public static final String EXTRA_NOME_USUARIO = "surpreenda.EXTRA_NOME_USUARIO";
    public static final	String ACAO_EXIBIR_SAUDACAO = "surpreenda.ACAO_EXIBIR_SAUDACAO";
    public static final	String CATEGORIA_SAUDACAO = "surpreenda.CATEGORIA_SAUDACAO";

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.saudacao_activity);
        TextView saudacaoTextView = findViewById(R.id.saudacaoTextView);

        Intent intent = getIntent();
        if(intent.hasExtra(EXTRA_NOME_USUARIO)){
            String saudacao = getResources().getString(R.string.saudacao);
            saudacaoTextView.setText(saudacao + " " + intent.getStringExtra(EXTRA_NOME_USUARIO));
        }else{
            saudacaoTextView.setText("O nome do usuário não foi informado");
        }
    }
}
