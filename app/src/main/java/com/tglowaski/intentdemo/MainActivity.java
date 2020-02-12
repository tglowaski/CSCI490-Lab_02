package com.tglowaski.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private static final int BACKGROUND_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "I called Intent", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivityForResult(intent, BACKGROUND_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == BACKGROUND_CODE && resultCode == Activity.RESULT_OK){
            Bundle extras = data.getExtras();
            if(extras != null) {
                int imageID = extras.getInt("imageID");
                ConstraintLayout currentLayout = findViewById(R.id.mainLayout);
                currentLayout.setBackground(getDrawable(imageID));
            }
        }
    }
}
