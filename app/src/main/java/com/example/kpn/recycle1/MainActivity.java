package com.example.kpn.recycle1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_movie;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<movie> list = new ArrayList<movie>();
        movie obj1 = new movie("Transformers","30 June",(float)3.5,R.drawable.transformers);
        list.add(obj1);
        movie obj2 = new movie("Despicable Me 3","23 June",(float)4,R.drawable.des);
        list.add(obj2);
        movie obj3 = new movie("Spiderman Homecoming","7 July",(float)3.5,R.drawable.spiderman);
        list.add(obj3);
        movie obj4 = new movie("Cars 3","16 June",(float)4,R.drawable.cars);
        list.add(obj4);
        movie obj5= new movie("Tubelight","23 June",(float)4,R.drawable.tubelight);
        list.add(obj5);

        rv_movie=(RecyclerView)findViewById(R.id.rv_movie);
        adapter=new RecyclerAdapter(list);
        layoutManager = new LinearLayoutManager(this);
        rv_movie.setLayoutManager(layoutManager);
        rv_movie.setHasFixedSize(true);
        rv_movie.setAdapter(adapter);
    }


}


class movie{

    String name,release;
    int imgid;
    float rating;

    public movie(String name, String release, float rating,int imgid) {
        this.name = name;
        this.release = release;
        this.rating = rating;
        this.imgid=imgid;
    }
}
