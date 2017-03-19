package com.ston1x.answr2;

//import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
        import android.widget.TextView;
import java.util.Random;
//import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public int x;
    final Random random = new Random();
    EditText editText;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void Randomize(View view)
    {
        x=random.nextInt(2);
        if (x == 0) {textView2.setText("NO");}
        else {textView2.setText("YES");}
    }

}

