package neer.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    RadioButton rb;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rgroup);
    }

    public void rbclick(View v)
    {
      int radiobuttonid = rg.getCheckedRadioButtonId();
       rb = (RadioButton) findViewById(radiobuttonid);
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();
    }

}
