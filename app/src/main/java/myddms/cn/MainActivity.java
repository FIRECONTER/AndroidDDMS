package myddms.cn;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life TIme", "create");
   



    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Time","restart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Life Time", "resume");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Life Time", "stop");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Life Time", "start");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Life Time", "pause");
    }

    @Override
    protected void onDestroy()
    {
        Log.d("Life Time", "destroy");
        super.onDestroy();

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
}
