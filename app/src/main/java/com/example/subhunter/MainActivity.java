package com.example.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import java.util.Random;

public class MainActivity extends Activity {

    // Class scope variables
    int screenWidth, screenHeight;
    int blockSize;
    int gridWidth = 40;
    int gridHeight;
    float horizontalTouched = -100;
    float verticalTouched = -100;
    int subHorizontalPos, subVerticalPos;
    boolean hit = false;
    int shotsFired;
    int distanceFromSub;

    // Android runs this code just before the player sees the app. This makes it a good place to add
    // the code for the 'one-time' setup phase.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the current device's screen res
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size); 

        // Game code
        Log.d("Debugging", "In onCreate");
        newGame();
        draw();
    }

    // This code will execute when a new game needs to be started. It will happen when the app is
    // first started and after the player wins the game.
    void newGame() {
        Log.d("Debugging", "In newGame");
    }

    // Here we will do all the drawing. The grid lines, the HUD and the touch indicator.
    void draw() {
        Log.d("Debugging", "In draw");
    }

    // This part of the code will handle detecting that the player has tapped the screen.
    @Override
    public boolean onTouchEvent (MotionEvent motionEvent) {
        Log.d("Debugging", "In onTouchEvent");
        takeShot();
        return true;
    }

    // The code here will execute when the player taps the screen. It will calculate the distance
    // from the sub and decide if there was a hit or miss.
    void takeShot() {
        Log.d("Debugging", "In takeShot");
        draw();
    }

    // This code says "Boom!"
    void boom() {

    }

    // This code prints debug information
    void printDebugInfo() {

    }
}
