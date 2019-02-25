package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Web, but1Calendar, btn1Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
       // setupButtonClickEvents();



    }



//Load the web page of this event
    public void WebInfo1(View view)
    {
        Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d131356734%26view%3devent%26-childview%3d");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(webIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        startActivity(webIntent);
    }

//Load the web page of this event
    public void WebInfo2(View view)
    {
        Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d131034185%26view%3devent%26-childview%3d");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(webIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        startActivity(webIntent);
    }

//Load the web page of this event
    public void WebInfo3(View view)
    {
        Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d129951622%26view%3devent%26-childview%3d");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(webIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        startActivity(webIntent);
    }



    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                startActivity(webIntent);
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
                GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 3, 40);
                GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 4, 40);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);

            }
        });




        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
            }
        });
    }

    public void addCalendar1(View view)
    {

        // Do something in response to button click

        Intent calIntent = new Intent(Intent.ACTION_INSERT);
        calIntent.setType("vnd.android.cursor.item/event");
        calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
        GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 3, 40);
        GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 4, 40);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                begDate.getTimeInMillis());
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                endDate.getTimeInMillis());
        startActivity(calIntent);


    }

    public void addCalendar2(View view)
    {

            // Do something in response to button click

            Intent calIntent = new Intent(Intent.ACTION_INSERT);
            calIntent.setType("vnd.android.cursor.item/event");
            calIntent.putExtra(CalendarContract.Events.TITLE, "Health, Wholeness, and Humanity'");
            calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "BWC");
            GregorianCalendar begDate = new GregorianCalendar(2019, 2, 26, 7, 30);
            GregorianCalendar endDate = new GregorianCalendar(2019, 2, 26, 8, 30);
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                    begDate.getTimeInMillis());
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                    endDate.getTimeInMillis());
            startActivity(calIntent);


    }

    public void addCalendar3(View view)
    {

        // Do something in response to button click

        Intent calIntent = new Intent(Intent.ACTION_INSERT);
        calIntent.setType("vnd.android.cursor.item/event");
        calIntent.putExtra(CalendarContract.Events.TITLE, "\n" +
                "The Francis X. Shea Memorial Lecture Presents Poet Jane Hirshfield");
        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
        GregorianCalendar begDate = new GregorianCalendar(2019, 3, 5, 7, 30);
        GregorianCalendar endDate = new GregorianCalendar(2019, 3, 5, 9, 30);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                begDate.getTimeInMillis());
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                endDate.getTimeInMillis());
        startActivity(calIntent);


    }

    public void map(View view)
    {
        // Map point based on address
        Uri location = Uri.parse("https://www.google.com/maps/place/1200+Kenwood+Ave,+Duluth,+MN+55811/@46.8139092,-92.1170318,15.5z/data=!4m5!3m4!1s0x52afad45e28267a3:0x5c884be0749736a3!8m2!3d46.8163661!4d-92.1080999");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(mapIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        startActivity(mapIntent);
    }


}
