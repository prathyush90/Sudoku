package nlp.com.sudoku;

import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity  {

    private ArrayList<EditText> arrayList = new ArrayList<>();
    private int[][] board = new int[9][9];
    int flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        generateBoard(flag);

        EditText e1 = (EditText) findViewById(R.id.s1);
        arrayList.add(e1);
        EditText e2 = (EditText) findViewById(R.id.s2);
        arrayList.add(e2);
        EditText e3 = (EditText) findViewById(R.id.s3);
        arrayList.add(e3);
        EditText e4 = (EditText) findViewById(R.id.s4);
        arrayList.add(e4);
        EditText e5 = (EditText) findViewById(R.id.s5);
        arrayList.add(e5);
        EditText e6 = (EditText) findViewById(R.id.s6);
        arrayList.add(e6);
        EditText e7 = (EditText) findViewById(R.id.s7);
        arrayList.add(e7);
        EditText e8 = (EditText) findViewById(R.id.s8);
        arrayList.add(e8);
        EditText e9 = (EditText) findViewById(R.id.s9);
        arrayList.add(e9);

        EditText e10 = (EditText) findViewById(R.id.s10);
        arrayList.add(e10);
        EditText e11 = (EditText) findViewById(R.id.s11);
        arrayList.add(e11);
        EditText e12 = (EditText) findViewById(R.id.s12);
        arrayList.add(e12);
        EditText e13 = (EditText) findViewById(R.id.s13);
        arrayList.add(e13);
        EditText e14 = (EditText) findViewById(R.id.s14);
        arrayList.add(e14);
        EditText e15 = (EditText) findViewById(R.id.s15);
        arrayList.add(e15);
        EditText e16 = (EditText) findViewById(R.id.s16);
        arrayList.add(e16);
        EditText e17 = (EditText) findViewById(R.id.s17);
        arrayList.add(e17);
        EditText e18 = (EditText) findViewById(R.id.s18);
        arrayList.add(e18);


        EditText e19 = (EditText) findViewById(R.id.s19);
        arrayList.add(e19);
        EditText e20 = (EditText) findViewById(R.id.s20);
        arrayList.add(e20);
        EditText e21 = (EditText) findViewById(R.id.s21);
        arrayList.add(e21);
        EditText e22 = (EditText) findViewById(R.id.s22);
        arrayList.add(e22);
        EditText e23 = (EditText) findViewById(R.id.s23);
        arrayList.add(e23);
        EditText e24 = (EditText) findViewById(R.id.s24);
        arrayList.add(e24);
        EditText e25 = (EditText) findViewById(R.id.s25);
        arrayList.add(e25);
        EditText e26 = (EditText) findViewById(R.id.s26);
        arrayList.add(e26);
        EditText e27 = (EditText) findViewById(R.id.s27);
        arrayList.add(e27);

        EditText e28 = (EditText) findViewById(R.id.s28);
        arrayList.add(e28);
        EditText e29 = (EditText) findViewById(R.id.s29);
        arrayList.add(e29);
        EditText e30 = (EditText) findViewById(R.id.s30);
        arrayList.add(e30);
        EditText e31 = (EditText) findViewById(R.id.s31);
        arrayList.add(e31);
        EditText e32 = (EditText) findViewById(R.id.s32);
        arrayList.add(e32);
        EditText e33 = (EditText) findViewById(R.id.s33);
        arrayList.add(e33);
        EditText e34 = (EditText) findViewById(R.id.s34);
        arrayList.add(e34);
        EditText e35 = (EditText) findViewById(R.id.s35);
        arrayList.add(e35);
        EditText e36 = (EditText) findViewById(R.id.s36);
        arrayList.add(e36);

        EditText e37 = (EditText) findViewById(R.id.s37);
        arrayList.add(e37);
        EditText e38 = (EditText) findViewById(R.id.s38);
        arrayList.add(e38);
        EditText e39 = (EditText) findViewById(R.id.s39);
        arrayList.add(e39);
        EditText e40 = (EditText) findViewById(R.id.s40);
        arrayList.add(e40);
        EditText e41 = (EditText) findViewById(R.id.s41);
        arrayList.add(e41);
        EditText e42 = (EditText) findViewById(R.id.s42);
        arrayList.add(e42);
        EditText e43 = (EditText) findViewById(R.id.s43);
        arrayList.add(e43);
        EditText e44 = (EditText) findViewById(R.id.s44);
        arrayList.add(e44);
        EditText e45 = (EditText) findViewById(R.id.s45);
        arrayList.add(e45);

        EditText e46 = (EditText) findViewById(R.id.s46);
        arrayList.add(e46);
        EditText e47 = (EditText) findViewById(R.id.s47);
        arrayList.add(e47);
        EditText e48 = (EditText) findViewById(R.id.s48);
        arrayList.add(e48);
        EditText e49 = (EditText) findViewById(R.id.s49);
        arrayList.add(e49);
        EditText e50 = (EditText) findViewById(R.id.s50);
        arrayList.add(e50);
        EditText e51 = (EditText) findViewById(R.id.s51);
        arrayList.add(e51);
        EditText e52 = (EditText) findViewById(R.id.s52);
        arrayList.add(e52);
        EditText e53 = (EditText) findViewById(R.id.s53);
        arrayList.add(e53);
        EditText e54 = (EditText) findViewById(R.id.s54);
        arrayList.add(e54);

        EditText e55 = (EditText) findViewById(R.id.s55);
        arrayList.add(e55);
        EditText e56 = (EditText) findViewById(R.id.s56);
        arrayList.add(e56);
        EditText e57 = (EditText) findViewById(R.id.s57);
        arrayList.add(e57);
        EditText e58 = (EditText) findViewById(R.id.s58);
        arrayList.add(e58);
        EditText e59 = (EditText) findViewById(R.id.s59);
        arrayList.add(e59);
        EditText e60 = (EditText) findViewById(R.id.s60);
        arrayList.add(e60);
        EditText e61 = (EditText) findViewById(R.id.s61);
        arrayList.add(e61);
        EditText e62 = (EditText) findViewById(R.id.s62);
        arrayList.add(e62);
        EditText e63 = (EditText) findViewById(R.id.s63);
        arrayList.add(e63);

        EditText e64 = (EditText) findViewById(R.id.s64);
        arrayList.add(e64);
        EditText e65 = (EditText) findViewById(R.id.s65);
        arrayList.add(e65);
        EditText e66 = (EditText) findViewById(R.id.s66);
        arrayList.add(e66);
        EditText e67 = (EditText) findViewById(R.id.s67);
        arrayList.add(e67);
        EditText e68 = (EditText) findViewById(R.id.s68);
        arrayList.add(e68);
        EditText e69 = (EditText) findViewById(R.id.s69);
        arrayList.add(e69);
        EditText e70 = (EditText) findViewById(R.id.s70);
        arrayList.add(e70);
        EditText e71 = (EditText) findViewById(R.id.s71);
        arrayList.add(e71);
        EditText e72 = (EditText) findViewById(R.id.s72);
        arrayList.add(e72);

        EditText e73 = (EditText) findViewById(R.id.s73);
        arrayList.add(e73);
        EditText e74 = (EditText) findViewById(R.id.s74);
        arrayList.add(e74);
        EditText e75 = (EditText) findViewById(R.id.s75);
        arrayList.add(e75);
        EditText e76 = (EditText) findViewById(R.id.s76);
        arrayList.add(e76);
        EditText e77 = (EditText) findViewById(R.id.s77);
        arrayList.add(e77);
        EditText e78 = (EditText) findViewById(R.id.s78);
        arrayList.add(e78);
        EditText e79 = (EditText) findViewById(R.id.s79);
        arrayList.add(e79);
        EditText e80 = (EditText) findViewById(R.id.s80);
        arrayList.add(e80);
        EditText e81 = (EditText) findViewById(R.id.s81);
        arrayList.add(e81);



        //attachtextchanged();
        refreshTexts();
        attachtextchanged();

        Button easy = (Button) findViewById(R.id.easy);
        Button medium = (Button) findViewById(R.id.medium);
        Button hard = (Button) findViewById(R.id.hard);
        Button refresh = (Button) findViewById(R.id.refresh);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateBoard(flag);
                refreshTexts();
                attachtextchanged();
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 0;

                generateBoard(flag);
                refreshTexts();
                attachtextchanged();
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag  = 1;

                generateBoard(flag);
                refreshTexts();
                attachtextchanged();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag  = 2;

                generateBoard(flag);
                refreshTexts();
                attachtextchanged();
            }
        });


    }

    TextWatcher mTextWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {





        }

        @Override
        public void afterTextChanged(Editable s) {

            if(!TextUtils.isEmpty(s) && arrayList.size() >0)
            {
                int pos = 0;
                for(int i=0;i<arrayList.size();i++)
                {
                    if(arrayList.get(i).getText().hashCode() == s.hashCode())
                    {
                        pos = i;
                        break;
                    }
                }
                 int x = pos / 9;
                int y  = pos % 9;
                board[x][y] = Integer.parseInt(s.toString());
                SudokuChecker sudoku = new SudokuChecker( board );
                if( !sudoku.checkPuzzle())
                {
                    showAlert("InvalidMove","Ok");
                    board[x][y] = 0;
                    arrayList.get(pos).setText(String.valueOf(0));
                }
                if(sudoku.completed())
                {
                    showAlert("GameComplete","Refresh");
                }
            }

        }


    };

    public void attachtextchanged()
    {
        for(int i=0;i<arrayList.size();i++)
        {
            final int pos = i;
             int x = pos/9;
            int y = pos % 9;
            if(!(board[x][y] == 0))
            {
                arrayList.get(i).setEnabled(false);
                // arrayList.get(i).setFocusable(false);
                arrayList.get(i).setBackgroundColor(Color.parseColor("#000000"));
                arrayList.get(i).setTextColor(Color.parseColor("#FFFFFF"));
                continue;
            }

            arrayList.get(i).addTextChangedListener(mTextWatcher);
            //arrayList.get(i).setFocusable(true);
            arrayList.get(i).setEnabled(true);
            arrayList.get(i).setBackgroundColor(Color.parseColor("#FFFFFF"));
            arrayList.get(i).setTextColor(Color.parseColor("#000000"));
            //arrayList.get(i).setFocusable(false);
        }
    }

    private void showAlert(final String invalidMove, final String okText) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setPositiveButton(okText, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if(okText.equals("Refresh"))
                {
                    generateBoard(flag);
                    refreshTexts();
                    attachtextchanged();


                }
                dialog.cancel();
                dialog.dismiss();
            }
        });
       AlertDialog dialog =  builder.create();
        dialog.setMessage(invalidMove);
        dialog.show();
    }

    public void generateBoard(int flag)
    {
        Random rn = new Random();
        int difficulty = (flag == 0 )? rn.nextInt(5) + 15 : (flag == 1) ? rn.nextInt(20)+20 : rn.nextInt(20)+40;

        SudokuGenerator sg = new SudokuGenerator();
        sg.nextBoard(difficulty);
        board = sg.getBoard();

    }

    public void refreshTexts()
    {
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                int pos = i*9 + j;
                arrayList.get(pos).setText(String.valueOf(board[i][j]));
                arrayList.get(pos).removeTextChangedListener(mTextWatcher);

            }
        }
    }


}
