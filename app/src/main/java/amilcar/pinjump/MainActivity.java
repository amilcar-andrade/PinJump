package amilcar.pinjump;

import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.Animatable2Compat;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.pin);
        final AnimatedVectorDrawableCompat avd = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_endless_pin_jump);
        if (avd != null) {
            imageView.setImageDrawable(avd);
            avd.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
                @Override
                public void onAnimationEnd(Drawable drawable) {
                    avd.start();
                }
            });
            avd.start();
        }
    }
}
