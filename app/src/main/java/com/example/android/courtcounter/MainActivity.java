package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
     //   display(score);
    }
   /** @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
*/
   /** @Override
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
*/
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void Points3(View view) {
        scoreTeamA=scoreTeamA+3;
        displayA(scoreTeamA);
    }
    public void Points2(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayA(scoreTeamA);
    }
    public void freeThrow(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayA(scoreTeamA);
    }
    public void displayA(int number)
    {
        TextView countView=(TextView) findViewById(R.id.team_a_score);
        countView.setText(""+number);
    }

    public void Points3B(View view) {
        scoreTeamB=scoreTeamB+3;
        displayB(scoreTeamB);
    }
    public void Points2B(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayB(scoreTeamB);
    }
    public void freeThrowB(View view)
    {
        scoreTeamB=scoreTeamB+1;
        displayB(scoreTeamB);
    }
    public void displayB(int number)
    {
        TextView countView=(TextView) findViewById(R.id.team_b_score);
        countView.setText(""+number);
    }
    public void resetButton(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }
}