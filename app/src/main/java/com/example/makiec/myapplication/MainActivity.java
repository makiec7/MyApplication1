package com.example.makiec.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.makiec.adapter.PersonListAdapter;

import java.util.ArrayList;
import java.util.List;

import support.Person;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    List<Person> people = new ArrayList<Person>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView = (ListView) findViewById(R.id.listView);
        prepare();
        PersonListAdapter personListAdapter = new PersonListAdapter(this, R.layout.adapter_view_layout, people);
        listView.setClickable(true);
        listView.setAdapter(personListAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Person person = (Person) adapterView.getItemAtPosition(1);
               // Toast.makeText(getApplicationContext(), person.getName()+" "+person.getSurname(),Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(R.string.dialog)
                        .setCancelable(false)
                        .setPositiveButton(R.string.tak, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), R.string.app_name,Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton(R.string.nie, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("alert");
                alert.setMessage("Chcesz użyć "+ person.getName()+" "+person.getSurname()+"?");
                alert.show();



            }
        });
    }

    private void prepare() {
        people.add(new Person("Maciej", "Adamiak", 179.5, true));
        people.add(new Person("Paweł", "Wróblewski", 180.4, false));
        people.add(new Person("Emil", "Rojewsi", 172.1, true));
        people.add(new Person("Jan", "Barucha", 191.3, true));
        people.add(new Person("Marcin", "Buciora", 175.8, true));
        people.add(new Person("Wiktor", "Kmieciak", 185.0, true));
        people.add(new Person("Maciej", "Adamiak", 179.5, true));
        people.add(new Person("Paweł", "Wróblewski", 180.4, false));
        people.add(new Person("Emil", "Rojewsi", 172.1, false));
        people.add(new Person("Jan", "Barucha", 191.3, false));
        people.add(new Person("Marcin", "Buciora", 175.8, false));
        people.add(new Person("Wiktor", "Kmieciak", 185.0, true));
        people.add(new Person("Maciej", "Adamiak", 179.5, true));
        people.add(new Person("Paweł", "Wróblewski", 180.4, false));
        people.add(new Person("Emil", "Rojewsi", 172.1, true));
        people.add(new Person("Jan", "Barucha", 191.3, false));
        people.add(new Person("Marcin", "Buciora", 175.8, false));
        people.add(new Person("Wiktor", "Kmieciak", 185.0, true));
        people.add(new Person("Maciej", "Adamiak", 179.5, true));
        people.add(new Person("Paweł", "Wróblewski", 180.4, true));
        people.add(new Person("Emil", "Rojewsi", 172.1, false));
        people.add(new Person("Jan", "Barucha", 191.3, true));
        people.add(new Person("Marcin", "Buciora", 175.8, false));
        people.add(new Person("Wiktor", "Kmieciak", 185.0, false));
        people.add(new Person("Maciej", "Adamiak", 179.5, true));
        people.add(new Person("Paweł", "Wróblewski", 180.4, true));
        people.add(new Person("Emil", "Rojewsi", 172.1, true));
        people.add(new Person("Jan", "Barucha", 191.3, false));
        people.add(new Person("Marcin", "Buciora", 175.8, false));
        people.add(new Person("Wiktor", "Kmieciak", 185.0, true));
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
