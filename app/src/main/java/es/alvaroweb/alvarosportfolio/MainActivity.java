package es.alvaroweb.alvarosportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        CharSequence buttonText = ((Button) view).getText();
        Toast.makeText(this, "This button will launch my " + buttonText + " app!", Toast.LENGTH_SHORT).show();
    }
}
