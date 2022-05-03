package com.example.listviewdatastructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private Object ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();
        DataStructure DLL = new DataStructure();

        DLL.addNodeToBack("Invictus");
        DLL.addNodeToBack("By William Ernest Henley");
        DLL.addNodeToBack("");
        DLL.addNodeToBack("Out of the night that covers me,");
        DLL.addNodeToBack("Black as the pit from pole to pole,");
        DLL.addNodeToBack("I thank whatever gods may be");
        DLL.addNodeToBack("For my unconquerable soul.");
        DLL.addNodeToBack("");
        DLL.addNodeToBack("In the fell clutch of circumstance");
        DLL.addNodeToBack("I have not winced nor cried aloud.");
        DLL.addNodeToBack("Under the bludgeonings of chance");
        DLL.addNodeToBack("My head is bloody, but unbowed.");
        DLL.addNodeToBack("");
        DLL.addNodeToBack("Beyond this place of wrath and tears");
        DLL.addNodeToBack("Looms but the Horror of the shade,");
        DLL.addNodeToBack("And yet the menace of the years");
        DLL.addNodeToBack("Finds and shall find me unafraid.");
        DLL.addNodeToBack("");
        DLL.addNodeToBack("It matters not how strait the gate,");
        DLL.addNodeToBack("How charged with punishments the scroll,");
        DLL.addNodeToBack("I am the master of my fate,");
        DLL.addNodeToBack("I am the captain of my soul.");

        String[] poem = DLL.convertArray();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, poem);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "clicked item "+i+" "+arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}