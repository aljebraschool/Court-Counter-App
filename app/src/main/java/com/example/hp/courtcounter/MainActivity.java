package com.example.hp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//import static android.os.Build.VERSION_CODES.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /*
   * Event that response to  +3 Points buttons of teamA
   * */
    public void addThreeForTeamA(View view) {
         scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /*
   * Event that response to  +3 Points buttons of teamA
   * */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /*
       * Event that response to  free thrown buttons of teamA
       * */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }
 /*
 * Method that displays the score  to the screen for teamA
 * */

    public void displayForTeamA(int score)
    {
        TextView teamScore = (TextView) findViewById(R.id.team_a_score);
        teamScore.setText(String.valueOf(score));
    }


    /*
   * Event that response to  +3 Points buttons of teamB
   * */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    /*
   * Event that response to  +3 Points buttons of teamB
   * */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }

    /*
       * Event that response to  free thrown buttons of teamB
       * */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }
 /*
 * Method that displays the score  to the screen for teamB
 * */

    public void displayForTeamB(int score)
    {
        TextView teamScore = (TextView) findViewById(R.id.team_b_score);
        teamScore.setText(String.valueOf(score));
    }

    /*
     * Reset both teams to 0
     * */
    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


}
