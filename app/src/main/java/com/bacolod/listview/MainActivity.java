package com.bacolod.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

/*    private View.OnClickListener ClickListener = new OnClickListener(){

        /*@Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this, "Icon",Toast.LENGTH_LONG).show();
        }

    };
    private View.OnClickListener memes = new OnClickListener(){

        @Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this, "IconAlarm",Toast.LENGTH_LONG).show();
        }

    };
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnAlarm = findViewById(R.id.BtnAlarm);
        ImageButton BtnIcon = findViewById(R.id.BtnIcon);
        Button BtnIconAlarm = findViewById(R.id.BtnIconAlarm);
        Button BtnAlarmIcon = findViewById(R.id.BtnAlarmIcon);

 //       BtnAlarm.setOnClickListener(new OnClickListener() {
 //           @Override
 //           public void onClick(View view) {
 //               Toast.makeText( MainActivity.this, "Alarm", Toast.LENGTH_LONG).show();
 //           }
 //       });
        BtnAlarm.setOnClickListener(this);
        BtnIcon.setOnClickListener(this);
        BtnIconAlarm.setOnClickListener(this);
        BtnAlarmIcon.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
 //       Toast.makeText(this, "Activity Listener", Toast.LENGTH_SHORT).show();
        int id = view.getId();

        switch (id) {
            case R.id.BtnAlarm:
                Toast.makeText(this, "Alarm", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BtnIcon:
                Toast.makeText(this, "Icon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BtnIconAlarm:
                Toast.makeText(this, "Icon Alarm", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BtnAlarmIcon:
                Toast.makeText(this, "Alarm Icon", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
