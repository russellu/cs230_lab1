package com.russ.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Button topLeftButton;
    private Button topMiddleButton;
    private Button topRightButton;
    private Button middleLeftButton;
    private Button middleMiddleButton;
    private Button middleRightButton;
    private Button bottomLeftButton;
    private Button bottomMiddleButton;
    private Button bottomRightButton;

    Button[][] grid;


    private Button resetButton;
    private TextView turnTextView;
    boolean playerOneTurn = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = new Button[3][3];

        topLeftButton = findViewById(R.id.topLeft);
        topMiddleButton = findViewById(R.id.topMiddle);
        topRightButton = findViewById(R.id.topRight);
        middleLeftButton = findViewById(R.id.middleLeft);
        middleMiddleButton = findViewById(R.id.middleMiddle);
        middleRightButton = findViewById(R.id.middlRight);
        bottomLeftButton = findViewById(R.id.bottomLeft);
        bottomMiddleButton = findViewById(R.id.bottomMiddle);
        bottomRightButton = findViewById(R.id.bottomRight);

        grid[0][0] = topLeftButton;
        grid[0][1] = topMiddleButton;
        grid[0][2] = topRightButton;
        grid[1][0] = middleLeftButton;
        grid[1][1] = middleMiddleButton;
        grid[1][2] = middleRightButton;
        grid[2][0] = bottomLeftButton;
        grid[2][1] = bottomMiddleButton;
        grid[2][2] = bottomRightButton;

        final Context context = this;

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                final int row=i;
                final int col=j;
                grid[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(playerOneTurn) {
                            if(grid[row][col].getText().equals("")) {
                                grid[row][col].setText("X");
                                checkForWin();
                            }
                            else {
                                Toast.makeText(context, "already picked!", Toast.LENGTH_SHORT).show();
                                Log.e("picked","already picked");
                            }
                        }
                        else {
                            if(grid[row][col].getText().equals("")) {
                                grid[row][col].setText("O");
                                checkForWin();
                            }
                            else
                                Toast.makeText(context,"already picked!",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
    }


    // TODO: finish checkForWin() method.
    public void checkForWin(){

    }


    // TODO: finish resetGame() method
    public void resetGame(){

    }


}
