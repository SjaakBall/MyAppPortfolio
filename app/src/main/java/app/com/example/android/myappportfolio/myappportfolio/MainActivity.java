package app.com.example.android.myappportfolio.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
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

    public void sendMessage_capstone(View view) {
        showToast("This button will launch my capstone app!");
    }

    public void sendMessage_media_streamer(View view) {
        showToast("This button will launch the media streamer!");
    }

    public void sendMessage_super_duo1(View view) {
        showToast("This button will launch the super duo 1!");
    }

    public void sendMessage_super_duo2(View view) {
        showToast("This button will launch the super duo 2!");
    }

    public void sendMessage_ant_terminator(View view) {
        showToast("This button will launch the ant terminator!");
    }

    public void sendMessage_materialize(View view) {
        showToast("This button will launch materialize!");
    }

    private void showToast(String s) {
        Context context = getApplicationContext();
        CharSequence text = s;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
