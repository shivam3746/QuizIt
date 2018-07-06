package com.example.pavlion.quizit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
        // Question 1
        RadioButton question1_choice2;
        // Question 2
        RadioButton question2_choice3;
        // Question 3
        CheckBox question3_choice1;
        CheckBox question3_choice2;
        CheckBox question3_choice3;
        CheckBox question3_choice4;
        // Question 4
        CheckBox question4_choice1;
        CheckBox question4_choice2;
        CheckBox question4_choice3;
        CheckBox question4_choice4;
        // Question 5
        RadioButton question5_choice2;
        // Question 6
        RadioButton question6_choice2;
        // Question 7
        CheckBox question7_choice1;
        CheckBox question7_choice2;
        CheckBox question7_choice3;
        CheckBox question7_choice4;
        // Question 8
        CheckBox question8_choice1;
        CheckBox question8_choice2;
        CheckBox question8_choice3;
        CheckBox question8_choice4;
        // Question 9
        RadioButton question9_choice3;
        // Question 10
        RadioButton question10_choice1;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #2 (Portugal)
        //------------------------------------------------------------------------------------------
        Boolean answer1;
        question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        answer1 = question1_choice2.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is #3 (Russia)
        //------------------------------------------------------------------------------------------
        Boolean answer2;
        question2_choice3 = (RadioButton) this.findViewById(R.id.question2_choice3);
        answer2= question2_choice3.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #1 (Larry Page) and #3 (Sergey Brin)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question3_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answers are #2 (Ryan Gosling) and #3 (Leonardo di Caprio)
        //------------------------------------------------------------------------------------------
        Boolean answer4_choice1;
        Boolean answer4_choice2;
        Boolean answer4_choice3;
        Boolean answer4_choice4;
        question4_choice1 = (CheckBox) this.findViewById(R.id.question4_choice1);
        question4_choice2 = (CheckBox) this.findViewById(R.id.question4_choice2);
        question4_choice3 = (CheckBox) this.findViewById(R.id.question4_choice3);
        question4_choice4 = (CheckBox) this.findViewById(R.id.question4_choice4);
        answer4_choice1 = question4_choice1.isChecked();
        answer4_choice2 = question4_choice2.isChecked();
        answer4_choice3 = question4_choice3.isChecked();
        answer4_choice4 = question4_choice4.isChecked();
        if (!answer4_choice1 && answer4_choice2 && answer4_choice3 && !answer4_choice4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #2 (Peru)
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is #2 (Japan)
        //------------------------------------------------------------------------------------------
        Boolean answer6;
        question6_choice2 = (RadioButton) this.findViewById(R.id.question6_choice2);
        answer6 = question6_choice2.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #3 (Earth) and #4 (Pluto)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answers are #1 (Hamlet) and #4 (As you Like It)
        //------------------------------------------------------------------------------------------
        Boolean answer8_choice1;
        Boolean answer8_choice2;
        Boolean answer8_choice3;
        Boolean answer8_choice4;
        question8_choice1 = (CheckBox) this.findViewById(R.id.question8_choice1);
        question8_choice2 = (CheckBox) this.findViewById(R.id.question8_choice2);
        question8_choice3 = (CheckBox) this.findViewById(R.id.question8_choice3);
        question8_choice4 = (CheckBox) this.findViewById(R.id.question8_choice4);
        answer8_choice1 = question8_choice1.isChecked();
        answer8_choice2 = question8_choice2.isChecked();
        answer8_choice3 = question8_choice3.isChecked();
        answer8_choice4 = question8_choice4.isChecked();
        if (answer8_choice1 && !answer8_choice2 && !answer8_choice3 && answer8_choice4) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #3 (Rafael Nadal)
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice3 = (RadioButton) this.findViewById(R.id.question9_choice3);
        answer9 = question9_choice3.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is #1 (Gay Lussac)
        //------------------------------------------------------------------------------------------
        Boolean answer10;
        question10_choice1 = (RadioButton) this.findViewById(R.id.question10_choice1);
        answer10 = question10_choice1.isChecked();
        if (answer10) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    public void finishQuiz(View view){

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        }

}


