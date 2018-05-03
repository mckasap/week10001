package org.kasapbasi.week10001;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenAlert(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("SuRe??");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this," THANKS BRO ",Toast.LENGTH_SHORT).show();

            }
        });

       builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               finish() ;
           }
       });

       builder.setMessage("Are you sure to leave?");
       builder.setCancelable(false);
       AlertDialog alert= builder.create();
       alert.show();

    }
}
