package com.example.ishrak.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b11, b12, b13, b21, b22, b23, b31, b32, b33, restart;
    private char[][] mat;
    private char turn = 'O';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mat = new char[4][4];
        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <=3; j++){
                mat[i][j] = 'n';
            }
        }

        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        restart = findViewById(R.id.newGame);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[1][1] == 'n'){
                    mat[1][1] = turn;
                    b11.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[1][2] == 'n'){
                    mat[1][2] = turn;
                    b12.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");


                if (mat[1][3] == 'n'){
                    mat[1][3] = turn;
                    b13.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");


                if (mat[2][1] == 'n'){
                    mat[2][1] = turn;
                    b21.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[2][2] == 'n'){
                    mat[2][2] = turn;
                    b22.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[2][3] == 'n'){
                    mat[2][3] = turn;
                    b23.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[3][1] == 'n'){
                    mat[3][1] = turn;
                    b31.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[3][2] == 'n'){
                    mat[3][2] = turn;
                    b32.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("error","x1");

                if (mat[3][3] == 'n'){
                    mat[3][3] = turn;
                    b33.setText(String.valueOf(turn));
                    check(turn);
                    if (turn == 'O') {
                        turn = 'X';
                    }
                    else
                        turn = 'O';
                }
            }
        });


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    void check(char x){
        Log.d("error", "x3");
        int flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[i][i] != x) {
                flag = 1;
                break;
            }
        }
        Log.d("error", "x3");
        if (flag == 0){
            b11.setBackgroundColor(Color.GREEN);
            b22.setBackgroundColor(Color.GREEN);
            b33.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[1][i] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b11.setBackgroundColor(Color.GREEN);
            b12.setBackgroundColor(Color.GREEN);
            b13.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[2][i] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b21.setBackgroundColor(Color.GREEN);
            b22.setBackgroundColor(Color.GREEN);
            b23.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[3][i] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b31.setBackgroundColor(Color.GREEN);
            b32.setBackgroundColor(Color.GREEN);
            b33.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[i][1] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b11.setBackgroundColor(Color.GREEN);
            b21.setBackgroundColor(Color.GREEN);
            b31.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[i][2] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b12.setBackgroundColor(Color.GREEN);
            b22.setBackgroundColor(Color.GREEN);
            b32.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            if (mat[i][3] != x){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            b13.setBackgroundColor(Color.GREEN);
            b23.setBackgroundColor(Color.GREEN);
            b33.setBackgroundColor(Color.GREEN);
            restart.setVisibility(View.VISIBLE);
            disable();
            return;
        }

        flag = 0;
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                if (mat[i][j] == 'n')
                    flag = 1;
                break;
            }
        }
        if (flag==0) {
            restart.setVisibility(View.VISIBLE);
        }
    }

    void disable() {
        b11.setClickable(false);
        b12.setClickable(false);
        b13.setClickable(false);
        b21.setClickable(false);
        b22.setClickable(false);
        b23.setClickable(false);
        b31.setClickable(false);
        b32.setClickable(false);
        b33.setClickable(false);

    }


}
