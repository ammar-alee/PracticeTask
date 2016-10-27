package com.example.ammarali.practicerecyclerview.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ammarali.practicerecyclerview.R;
import com.example.ammarali.practicerecyclerview.adapter.MyAdapter;
import com.example.ammarali.practicerecyclerview.model.DummyData;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recView;
     private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recView = (RecyclerView) findViewById(R.id.rec_list);

        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(DummyData.getListData(), this);
        recView.setAdapter(adapter);
    }



}
