package com.example.an.miniproject1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;


/**
 * Created by An on 6/28/2015.
 */
public class Books extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);
        Intent intent=getIntent();
        TextView tv=new TextView(this);
        final int bookid=intent.getIntExtra("BooksID",R.id.cinderella);
        switch(bookid)
        {
            case R.id.cinderella:
            {
                tv.setText("Cinderella");
                break;
            }
            case R.id.snowwhite:
            {
                tv.setText("Snow White and the seven Dwarfs");
                break;
            }
            case R.id.batb:
            {
                tv.setText("Beauty and the Beast");
                break;
            }
            case R.id.harrypotter:
            {
                tv.setText("Harry Potter and the Sorcerer's Stone");
                break;
            }
            case R.id.rapunzel:
            {
                tv.setText("Rapunzel");
                break;
            }
        }
        tv.setTextColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        int page=0;
        LinearLayout ll=(LinearLayout) findViewById(R.id.booklinear);
        ll.addView(tv);
        if(bookid==R.id.cinderella)
        {
            page=10;
            for(int i=1;i<page+1;++i)
            {
                String pagenum="Page "+i;
                Button t=new Button(this);
                t.setText(pagenum);
                final int id=i;
                t.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Books.this, Pages.class);
                        intent.putExtra("BooksID", bookid);
                        intent.putExtra("PagesID",id-1);
                        startActivity(intent);
                    }
                });
                t.setGravity(Gravity.CENTER);
                t.setWidth(dpToPx(250));
                ll.addView(t);
            }
        }
        else if (bookid==R.id.batb) {
            page=10;
            for(int i=1;i<page+1;++i)
            {
                String pagenum="Page "+i;
                Button t=new Button(this);
                t.setText(pagenum);
                final int id=i;
                t.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Books.this, Pages.class);
                        intent.putExtra("BooksID", bookid);
                        intent.putExtra("PagesID",id-1);
                        startActivity(intent);
                    }
                });
                t.setGravity(Gravity.CENTER);
                t.setWidth(dpToPx(250));
                ll.addView(t);
            }
        }
        else if(bookid==R.id.snowwhite)
        {
            page=10;
            for(int i=1;i<page+1;++i)
            {
                String pagenum="Page "+i;
                Button t=new Button(this);
                t.setText(pagenum);
                final int id=i;
                t.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Books.this, Pages.class);
                        intent.putExtra("BooksID", bookid);
                        intent.putExtra("PagesID",id-1);
                        startActivity(intent);
                    }
                });
                t.setGravity(Gravity.CENTER);
                t.setWidth(dpToPx(250));
                ll.addView(t);
            }
        }
        else if(bookid==R.id.harrypotter)
        {
            page=10;
            for(int i=1;i<page+1;++i)
            {
                String pagenum="Page "+i;
                Button t=new Button(this);
                t.setText(pagenum);
                final int id=i;
                t.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Books.this, Pages.class);
                        intent.putExtra("BooksID", bookid);
                        intent.putExtra("PagesID",id-1);
                        startActivity(intent);
                    }
                });
                t.setGravity(Gravity.CENTER);
                t.setWidth(dpToPx(250));
                ll.addView(t);
            }
        }
        else if(bookid==R.id.rapunzel)
        {
            page=10;
            for(int i=1;i<page+1;++i)
            {
                String pagenum="Page "+i;
                Button t=new Button(this);
                t.setText(pagenum);
                final int id=i;
                t.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Books.this, Pages.class);
                        intent.putExtra("BooksID", bookid);
                        intent.putExtra("PagesID",id-1);
                        startActivity(intent);
                    }
                });
                t.setGravity(Gravity.CENTER);
                t.setWidth(dpToPx(250));
                ll.addView(t);
            }
        }
        Button t=new Button(this);
        String quizz="Quiz";
        t.setText(quizz);
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Books.this, Quizz.class);
                intent.putExtra("BooksID", bookid);
                startActivity(intent);
            }
        });
        t.setGravity(Gravity.CENTER);
        ll.addView(t);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }
    /*
    http://stackoverflow.com/questions/8232608/fit-image-into-imageview-keep-aspect-ratio-and-then-resize-imageview-to-image-d
     */
    private int dpToPx(int dp)
    {
        float density = getApplicationContext().getResources().getDisplayMetrics().density;
        return Math.round((float)dp * density);
    }
    /*

     */
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
    public void back(View view) {
        Intent intent= new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
    public void onBackPressed() {
        Intent intent=new Intent(this,menu.class);
        startActivity(intent);
    }
}
