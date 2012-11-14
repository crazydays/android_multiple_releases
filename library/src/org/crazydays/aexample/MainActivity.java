package org.crazydays.aexample;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity
    extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDoit();
    }

    private void setupDoit()
    {
        if (Product.isApplication()) {
            setupDoitApplication();
        } else if (Product.isFree()) {
            setupDoitFree();
        } else {
            hideDoit();
        }
    }

    private void setupDoitApplication()
    {
        findViewById(R.id.doit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, R.string.gloat,
                    Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setupDoitFree()
    {
        findViewById(R.id.doit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, R.string.whine,
                    Toast.LENGTH_LONG).show();
            }
        });
    }

    private void hideDoit()
    {
        findViewById(R.id.doit).setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
