package com.example.an.miniproject1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by An on 6/29/2015.
 */
public class Quizz extends Activity {
    private static final String[] cindequestion={"Does Cinderella's family rich?","How many daughter does Cinderella's stepmother has?"};
    private static final String[] cinderightanswe={"Yes","2"};
    private static final String[] swquestion={"How many dwarfs are there in the story ?","Where do the dwarfs live in ?"};
    private static final String[] swrightanswe={"7","A Cottage"};
    private static final String[] harryquestion={"How old is Harry when he received the letter from Hogwarts","What creature bring the letter from Hogwarts to Harry ?"};
    private static final String[] harryrightanswe={"11","An Owl"};
    private static final String[] batbquestion={"What does the heroin's father do?","What does the heroin often do in her freetime ?"};
    private static final String[] batbrightanswe={"Merchant","Read book"};
    private static final String[] rapunquestion={"What is the heroin's name?","What creature kidnapped the heroin when she is still a infant ?"};
    private static final String[] rapunrightanswe={"Rapunzel","An Enchantress"};
    private int point=0;
    private int numofquestion=0;
    private int noofquestion=0;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizz);
        startquizz();
    }

    private void startquizz() {
        Intent intent=getIntent();
        final int bookid=intent.getIntExtra("BooksID", R.id.cinderella);
        final RadioButton a1=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton a2=(RadioButton) findViewById(R.id.radioButton2);
        final RadioButton a3=(RadioButton) findViewById(R.id.radioButton3);
        final RadioButton a4=(RadioButton) findViewById(R.id.radioButton4);
        a1.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);
        a4.setVisibility(View.INVISIBLE);
        TextView t= (TextView) findViewById(R.id.textView);
        final Button b1=(Button) findViewById(R.id.button2);
        b1.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setVisibility(View.INVISIBLE);
                Button b3=(Button) findViewById(R.id.button);
                b3.setVisibility(View.VISIBLE);
                ++noofquestion;
                nextquestion(bookid);
            }
        });
        Button b2=(Button) findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=getApplicationContext();
                int duration= Toast.LENGTH_LONG;
                Toast toast;
                toast=Toast.makeText(context,"The right answer is "+cinderightanswe[noofquestion],duration);
                switch(bookid)
                {
                    case R.id.cinderella:
                    {
                        toast=Toast.makeText(context,"The right answer is "+cinderightanswe[noofquestion],duration);
                        break;
                    }
                    case R.id.snowwhite:
                    {
                        toast=Toast.makeText(context,"The right answer is "+swrightanswe[noofquestion],duration);
                        break;
                    }
                    case R.id.harrypotter:
                    {
                        toast=Toast.makeText(context,"The right answer is "+harryrightanswe[noofquestion],duration);
                        break;
                    }
                    case R.id.batb:
                    {
                        toast=Toast.makeText(context,"The right answer is "+batbrightanswe[noofquestion],duration);
                        break;
                    }
                    case R.id.rapunzel:
                    {
                        toast=Toast.makeText(context,"The right answer is "+rapunrightanswe[noofquestion],duration);
                        break;
                    }
                }
                toast.show();
                Button b3=(Button) findViewById(R.id.button);
                b3.setVisibility(View.INVISIBLE);
                b3=(Button) findViewById(R.id.button2);
                b3.setVisibility(View.VISIBLE);
            }
        });
        
        if(bookid==R.id.cinderella)
            {
                
                numofquestion=2;
                t.setText(cindequestion[0]);
                a1.setText("Yes");
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a2.setText("No");
            }
        else if(bookid==R.id.harrypotter)
            {
                
                t.setText(harryquestion[0]);
                a1.setText("10");
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a2.setText("11");
                a3.setText("12");
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                a4.setText("13");
            }
        else if(bookid==R.id.snowwhite)
            {
                
                t.setText(swquestion[0]);
                a1.setText("10");
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a2.setText("8");
                a3.setText("7");
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                a4.setText("3");
            }
        else if(bookid==R.id.batb)
            {
                
                t.setText(batbquestion[0]);
                a1.setText("Merchant");
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a2.setText("Singer");
                a3.setText("Bandit");
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                a4.setText("Beggar");
            }
        else if(bookid==R.id.rapunzel)
            {
                
                t.setText(rapunquestion[0]);
                a1.setText("Rapuzel");
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a2.setText("Rapunze");
                a3.setText("Rapunzel");
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                a4.setText("Ripunzel");
            }
        Button b=(Button) findViewById(R.id.button);
        b.setText("Confirm");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noofquestion==0)
                {
                    ++noofquestion;
                    switch(bookid)
                    {
                        case R.id.cinderella:
                        {
                            if(a1.isChecked())
                            {
                                ++point;
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                toast.show();
                            }
                            else
                            {
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                toast.show();
                            }
                            break;
                        }
                        case R.id.snowwhite:
                        {
                            if(a3.isChecked())
                            {
                                ++point;
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                toast.show();
                            }
                            else
                            {
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                toast.show();
                            }
                            break;
                        }
                        case R.id.harrypotter:
                        {
                            if(a2.isChecked())
                            {
                                ++point;
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                toast.show();
                            }
                            else
                            {
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                toast.show();
                            }
                            break;
                        }
                        case R.id.rapunzel:
                        {
                            if(a3.isChecked())
                            {
                                ++point;
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                toast.show();
                            }
                            else
                            {
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                toast.show();
                            }
                            break;
                        }
                        case R.id.batb:
                        {
                            if(a1.isChecked())
                            {
                                ++point;
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                toast.show();
                            }
                            else
                            {
                                Context context=getApplicationContext();
                                int duration= Toast.LENGTH_SHORT;
                                Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                toast.show();
                            }
                            break;
                        }
                    }
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            nextquestion(bookid);
                        }
                    }, 3000);
                }
            }
        });
    }
    private void backtomain()
    {
        Intent intent= new Intent(Quizz.this,menu.class);
        startActivity(intent);
    }

    private void nextquestion(final int bookid) {
        final RadioButton a1=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton a2=(RadioButton) findViewById(R.id.radioButton2);
        final RadioButton a3=(RadioButton) findViewById(R.id.radioButton3);
        final RadioButton a4=(RadioButton) findViewById(R.id.radioButton4);
        ImageView iv=(ImageView) findViewById(R.id.imageView);

        a1.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);
        a4.setVisibility(View.INVISIBLE);
        TextView t= (TextView) findViewById(R.id.textView);
        switch(bookid){
            case R.id.cinderella:
            {
                if(noofquestion==1)
                {
                    
                    t.setText(cindequestion[1]);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);
                    a1.setText("1");
                    a2.setText("2");
                    a3.setText("3");
                    a4.setText("4");
                }
                break;
            }
            case R.id.harrypotter:
            {
                
                if(noofquestion==1)
                {
                    t.setText(harryquestion[1]);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);
                    a1.setText("An Owl");
                    a2.setText("A Snake");
                    a3.setText("A Frog");
                    a4.setText("A Gryffon");
                }
                break;
            }
            case R.id.snowwhite:
            {
                
                if(noofquestion==1)
                {
                    t.setText(swquestion[1]);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);
                    a1.setText("A Giant Shoe");
                    a2.setText("A Cottage");
                    a3.setText("A Shack");
                    a4.setText("A Cave");
                    break;
                }
            }
            case R.id.batb:
            {
                
                if(noofquestion==1)
                {
                    t.setText(batbquestion[1]);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);
                    a1.setText("Dance");
                    a2.setText("Gossip");
                    a3.setText("Read books");
                    a4.setText("Travel");
                    break;
                }
            }
            case R.id.rapunzel:
            {
                
                if(noofquestion==1)
                {
                    t.setText(rapunquestion[1]);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);
                    a1.setText("An Orge");
                    a2.setText("A Wolf");
                    a3.setText("A Dwarf");
                    a4.setText("An Enchantress");
                    break;
                }
            }
        }
        Button b=(Button) findViewById(R.id.button);
        mp=MediaPlayer.create(Quizz.this,R.raw.letitgo);
        if(noofquestion==1)
        {
            b.setText("Finish");
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        switch(bookid)
                        {
                            case R.id.cinderella:
                            {
                                if(a2.isChecked())
                                {
                                    ++point;
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                    toast.show();
                                }
                                else
                                {
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                    toast.show();
                                }
                                break;
                            }
                            case R.id.snowwhite:
                            {
                                if(a2.isChecked())
                                {
                                    ++point;
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                    toast.show();
                                }
                                else
                                {
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                    toast.show();
                                }
                                break;
                            }
                            case R.id.harrypotter:
                            {
                                if(a1.isChecked())
                                {
                                    ++point;
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                    toast.show();
                                }
                                else
                                {
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                    toast.show();
                                }
                                break;
                            }
                            case R.id.rapunzel:
                            {
                                if(a4.isChecked())
                                {
                                    ++point;
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                    toast.show();
                                }
                                else
                                {
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                    toast.show();
                                }
                                break;
                            }
                            case R.id.batb:
                            {
                                if(a3.isChecked())
                                {
                                    ++point;
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"You're right!! Your point is: "+point,duration);
                                    toast.show();
                                }
                                else
                                {
                                    Context context=getApplicationContext();
                                    int duration= Toast.LENGTH_SHORT;
                                    Toast toast=Toast.makeText(context,"Wrong!!",duration);
                                    toast.show();
                                }
                                break;
                            }
                        }
                        if(point==2)
                        {
                            Context context=getApplicationContext();
                            int duration= Toast.LENGTH_SHORT;
                            Toast toast=Toast.makeText(context,"Congratulation!! You have achieved full score!!",duration);
                            toast.show();
                            toast=Toast.makeText(context,"You have unlocked a song. Enjoy!",Toast.LENGTH_LONG);
                            toast.show();
                            mp.start();
                        }
                        Button b1=(Button) findViewById(R.id.button);
                        b1.setText("Leave");
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                backtomain();
                                mp.stop();
                            }
                        });
                    Button b2=(Button) findViewById(R.id.button3);
                    b2.setVisibility(View.INVISIBLE);
                }
            });
        }
        Button b3=(Button) findViewById(R.id.button2);
        if(noofquestion==1)
        {
            b3.setText("Finish");
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, "Your point is: " + point, duration);
                    toast.show();
                    backtomain();
                }
            });
        }
        RadioGroup r1=(RadioGroup) findViewById(R.id.Radiobox);
        r1.clearCheck();
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
    public void back(View view) {
        Intent intent= new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        if(mp!=null)
        {
            if(mp.isPlaying())
            {
                mp.stop();
            }
        }

        Intent intent=new Intent (this,menu.class);
        startActivity(intent);
        return;
    }
}
