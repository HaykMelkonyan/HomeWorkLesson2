package com.example.user.homeworklesson2;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ListView listview;
   ArrayList<String> items;
    boolean enabled;
    Context context;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        items= new ArrayList<String>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        listview = (ListView)findViewById(R.id.listView1);
        items.add("item1") ;
        items.add("item6") ;
        items.add("item5") ;
        items.add("item4") ;
        items.add("item3") ;
        items.add("item2") ;
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, items);
        listview.setAdapter(adapter);
        listview.setItemsCanFocus(false);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listview.setOnItemClickListener(new CheckBoxClick());
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                    view.setBackgroundColor(Color.DKGRAY);
                return  true;

            }
        });
        Button btnDelete = (Button) findViewById(R.id.button1);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SparseBooleanArray checked = listview.getCheckedItemPositions();
                for (int i = 0; i < listview.getCount(); i++){

                    if (checked.get(i)==true)
                    {
                        items.remove(i);

                    }
                    adapter.notifyDataSetChanged();

                }
                listview.clearChoices();
            }
        });
        Button btnEnable= (Button)findViewById(R.id.button2);
        btnEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

}

