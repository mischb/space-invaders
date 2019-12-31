package p.mischaberlin.spaceinvaders;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class SpaceInvaders extends AppCompatActivity {

    //the view -- engine - of the game
    SpaceInvadersView spaceInvadersView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //display object to access screen details
        Display display = getWindowManager().getDefaultDisplay();
        // load the resolution into a point object
        Point size = new Point();
        display.getSize(size);

        //initialise gameview and set it as teh view
        spaceInvadersView = new SpaceInvadersView(this, size.x, size.y);
        setContentView(spaceInvadersView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //tell the gameview resume method to execute
        spaceInvadersView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //tell the gameview to pause
        spaceInvadersView.pause();
    }
}
