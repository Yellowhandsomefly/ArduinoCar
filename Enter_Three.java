package com.example.wayne.arduinocarpage;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import com.example.wayne.arduinocarpage.R;

public class Enter_Three extends AppCompatActivity {

    private Button Check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_three);

        Check = (Button) findViewById(R.id.check);

        //更換頁面到Activity_Three
        Check.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                jumpActivity_Three();
            }
        });
    }
    public void jumpActivity_Three() {

        Intent Jump = new Intent(Enter_Three.this, Activity_Three.class);
        startActivity(Jump);
    }
}
