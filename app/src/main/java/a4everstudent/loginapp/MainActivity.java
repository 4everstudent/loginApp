package a4everstudent.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void login(View view){
        EditText user = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);
        Log.i("User", user.getText().toString());
        Log.i("Pass", pass.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
