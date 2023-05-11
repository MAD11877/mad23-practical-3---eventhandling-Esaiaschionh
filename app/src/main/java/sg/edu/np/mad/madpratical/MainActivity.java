package sg.edu.np.mad.madpratical;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            boolean isOn = false;

            @Override
            public void onClick(View v) {
                if (isOn) {
                    myButton.setText("Follow");
                    isOn = false;
                } else {
                    myButton.setText("Unfollow");
                    isOn = true;
                }
            }
        });
    }
}
