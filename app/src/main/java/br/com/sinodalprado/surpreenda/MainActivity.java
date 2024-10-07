package br.com.sinodalprado.surpreenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText nomeEditText;
    private TextView saudacaoTextView;
    private String saudacao;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }

    /*public void surpreenderUsuario(View v){
        Editable texto = this.nomeEditText.getText();
        String msg = saudacao + " " + texto.toString();
        this.saudacaoTextView.setText(msg);
    }*/

    // Novo método surpreender usuário chamdndo a intent para a outra tela
    public void surpreenderUsuario(View v){
        Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
        intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);
        System.out.println("Estou aqui");
        String texto = nomeEditText.getText().toString();
        intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
        startActivity(intent);
    }
}
