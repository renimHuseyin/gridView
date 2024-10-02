package com.renim.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        fillArray();
        GridAdapter adapter = new GridAdapter(this,text,image);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Selected "+ text.get(position),Toast.LENGTH_LONG).show();
            }
        });
        
    }
    public void fillArray(){
        text.add("Bird");
        text.add("Cat");
        text.add("Monkey");
        text.add("Dog");
        text.add("Lion");
        text.add("Fish");
        text.add("Turtle");
        text.add("Rabbit");
        text.add("Donkey");
        text.add("Chiken");
        text.add("Tiger");
        text.add("Snake");
        text.add("hedgehog");
        text.add("Cow");
        text.add("Giraffe");
        text.add("Elephant");
        text.add("Ant");
        text.add("Worm");
        text.add("Horse");
        text.add("Zebra");

        image.add(R.drawable.img);
        image.add(R.drawable.cat);
        image.add(R.drawable.monkey);
        image.add(R.drawable.dog);
        image.add(R.drawable.lion);
        image.add(R.drawable.fish);
        image.add(R.drawable.turtle);
        image.add(R.drawable.rabbit);
        image.add(R.drawable.donkey);
        image.add(R.drawable.chicken);
        image.add(R.drawable.tiger);
        image.add(R.drawable.snake);
        image.add(R.drawable.hedgehog);
        image.add(R.drawable.cow);
        image.add(R.drawable.giraffe);
        image.add(R.drawable.elephant);
        image.add(R.drawable.ant);
        image.add(R.drawable.worm);
        image.add(R.drawable.horse);
        image.add(R.drawable.zebra);

    }
}