package edu.wpi.adonay.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing list
        ArrayList<String> itemList = new ArrayList<String>();

        // Populating list items
        for(int i=0; i<100; i++) {
            itemList.add("Item " + i);
        }

        // Creating adapter instance
        StringArrayAdapter itemArrayAdapter = new StringArrayAdapter(R.layout.list_item, itemList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemArrayAdapter);
    }
}
