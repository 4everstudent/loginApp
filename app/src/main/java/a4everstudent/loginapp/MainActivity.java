package a4everstudent.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void login(View view){
        EditText user = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);

        //shows username and password on log
        Log.i("User", user.getText().toString());
        Log.i("Pass", pass.getText().toString());

        //change image
        ImageView helloImage = (ImageView) findViewById(R.id.image);
        helloImage.setImageResource(R.drawable.lady_bug_hello);

        //Says hello to the user using a toast
        CharSequence text = "Hello "+user.getText()+"!";
        Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
