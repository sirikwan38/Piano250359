package ice_pbru.khamhor.sirikwan.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    //2.Explicit
    //access type name
    private Button doButton;
    private Button reButton;
    private Button miButton;
    private Button faButton;
    private Button soButton;
    private Button laButton;
    private Button tiButton;
    private Button DoButton;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3.Bine widget
        bindWidget();

        //Button Controller
        buttonController();


    }//Main Method

    private void buttonController() {
        doButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer doMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dosong);
                doMediaPlayer.start();
            }
        });


    }//buttonController

    private void bindWidget() {
        doButton = (Button) findViewById(R.id.button1);
        reButton = (Button) findViewById(R.id.button2);
        miButton = (Button) findViewById(R.id.button3);
        faButton = (Button) findViewById(R.id.button4);
        soButton = (Button) findViewById(R.id.button5);
        laButton = (Button) findViewById(R.id.button6);
        tiButton = (Button) findViewById(R.id.button7);
        DoButton = (Button) findViewById(R.id.button8);


    }// bind Widget
}//Main Class

//1.หาขอบเขต
//2.Explicit
//3.Bind widget