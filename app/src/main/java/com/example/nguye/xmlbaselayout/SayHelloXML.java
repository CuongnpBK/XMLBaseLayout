package com.example.nguye.xmlbaselayout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SayHelloXML extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello_xml);
    }
    public void showToast(View clickedButton){
        String greetingtext = getString(R.string.greeting_text);
        Toast tempMassage =
        Toast.makeText(this,greetingtext,Toast.LENGTH_SHORT);
        tempMassage.show();
    }
}
