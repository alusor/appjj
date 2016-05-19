package com.alusorgame.escolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login;
    TextView register;
    EditText usuario,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =  (Button)findViewById(R.id.btnLogin);
        register = (TextView) findViewById(R.id.Registrarse);
        usuario =  (EditText) findViewById(R.id.editLogin);
        password = (EditText) findViewById(R.id.editPassword);
        login.setOnClickListener(clic);
    }


    View.OnClickListener clic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            register.setText(usuario.getText().toString());
        }
    };
}
