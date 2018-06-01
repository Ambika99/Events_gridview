package ambika.android.com.events_gridview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alexfu.countdownview.CountDownView;

import net.colindodd.gradientlayout.GradientLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownView countDownView = findViewById(R.id.count_down);
        countDownView.start();


    }
}
