package com.example.an.miniproject1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.VideoView;


public class menu extends Activity {
    private boolean animating=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageButton b1= (ImageButton) findViewById(R.id.cinderella);
        b1.setBackgroundResource(R.drawable.cinde1);
        ImageButton b2= (ImageButton) findViewById(R.id.harrypotter);
        b2.setBackgroundResource(R.drawable.harry1);
        ImageButton b3= (ImageButton) findViewById(R.id.snowwhite);
        b3.setBackgroundResource(R.drawable.sw1);
        ImageButton b4= (ImageButton) findViewById(R.id.batb);
        b4.setBackgroundResource(R.drawable.batb1);
        ImageButton b5= (ImageButton) findViewById(R.id.rapunzel);
        b5.setBackgroundResource(R.drawable.rapunzel);
        Button b=(Button)findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(animating==false)
                {
                    ImageButton b1= (ImageButton) findViewById(R.id.cinderella);
                    b1.setBackgroundResource(R.drawable.cinde);
                    AnimationDrawable fA1=(AnimationDrawable)b1.getBackground();
                    fA1.start();
                    ImageButton b2= (ImageButton) findViewById(R.id.harrypotter);
                    b2.setBackgroundResource(R.drawable.harry);
                    AnimationDrawable fA2=(AnimationDrawable)b2.getBackground();
                    fA2.start();
                    ImageButton b3= (ImageButton) findViewById(R.id.snowwhite);
                    b3.setBackgroundResource(R.drawable.sw);
                    AnimationDrawable fA3=(AnimationDrawable)b3.getBackground();
                    fA3.start();
                    ImageButton b4= (ImageButton) findViewById(R.id.batb);
                    b4.setBackgroundResource(R.drawable.batb);
                    AnimationDrawable fA4=(AnimationDrawable)b4.getBackground();
                    fA4.start();
                    ImageButton b5= (ImageButton) findViewById(R.id.rapunzel);
                    b5.setBackgroundResource(R.drawable.rapun);
                    AnimationDrawable fA5=(AnimationDrawable)b5.getBackground();
                    fA5.start();
                    Button b=(Button) findViewById(R.id.button5);
                    b.setText("Static Icon");
                    animating=true;
                }
                else
                {
                    ImageButton b1= (ImageButton) findViewById(R.id.cinderella);
                    b1.setBackgroundResource(R.drawable.cinde1);
                    ImageButton b2= (ImageButton) findViewById(R.id.harrypotter);
                    b2.setBackgroundResource(R.drawable.harry1);
                    ImageButton b3= (ImageButton) findViewById(R.id.snowwhite);
                    b3.setBackgroundResource(R.drawable.sw1);
                    ImageButton b4= (ImageButton) findViewById(R.id.batb);
                    b4.setBackgroundResource(R.drawable.batb1);
                    ImageButton b5= (ImageButton) findViewById(R.id.rapunzel);
                    b5.setBackgroundResource(R.drawable.rapunzel);
                    animating=false;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onclick(View v) {
        Intent intent=new Intent(this,Books.class);
        int id=v.getId();
        intent.putExtra("BooksID",id);
        startActivity(intent);
    }
    public void onBackPressed() {
            /*
            http://stackoverflow.com/questions/3226495/android-exit-application-code
             */
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
    }
}
