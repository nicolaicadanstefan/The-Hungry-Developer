package android.exemple.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView startedCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startedCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main);
        dessertsCard = findViewById(R.id.card_view_dessert);

        //Move to starters dishes page with explicit Intent(Main Activity --> Starter Activity):
        startedCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        //Move to mains dishes page with explicit Intent(Main Activity --> Mains Course Activity):
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainsActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        //Connecting app email with email aplication with implicit intent:
        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydeveloper@company.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        //Move to desserts page with implicit Intent(Main Activity --> Dessert Activity):
        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(dessertsActivityIntent);
            }
        });
    }
}