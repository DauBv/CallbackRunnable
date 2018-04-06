package com.example.daubv.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * ボタンクリック時のコマンドリスト
     */
    private final CommandArray commands = new CommandArray() {
        {
            put(R.id.button1, new Runnable() {
                @Override
                public void run() {
                    showToast("Button1");
                }
            });

            put(R.id.button2, new Runnable() {
                @Override
                public void run() {
                    showToast("Button2");
                }
            });

            put(R.id.button3, new Runnable() {
                @Override
                public void run() {
                    showToast("Button3");
                }
            });
            put(R.id.button4, new Runnable() {
                @Override
                public void run() {
                    showToast("Button4");
                }
            });
            put(R.id.button5, new Runnable() {
                @Override
                public void run() {
                    showToast("Button5");
                }
            });
            put(R.id.button6, new Runnable() {
                @Override
                public void run() {
                    showToast("Button6");
                }
            });
            put(R.id.button7, new Runnable() {
                @Override
                public void run() {
                    showToast("Button7");
                }
            });
            put(R.id.button8, new Runnable() {
                @Override
                public void run() {
                    showToast("Button8");
                }
            });
            put(R.id.button9, new Runnable() {
                @Override
                public void run() {
                    showToast("Button9");
                }
            });

            put(R.id.button9, new Runnable() {
                @Override
                public void run() {

                }
            });
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Runnable runnable = commands.get(v.getId());
        if (runnable != null) runnable.run();
    }

    /**
     * Method show Toast
     * @param message
     */
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
