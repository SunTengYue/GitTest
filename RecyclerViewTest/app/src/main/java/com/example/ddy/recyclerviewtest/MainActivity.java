package com.example.ddy.recyclerviewtest;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @BindView(R.id.swipe)
    SwipeRefreshLayout swipe;

    private List<Fruit> fruitList = new ArrayList<>();
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        initFruits();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList,this);
        recyclerView.setAdapter(adapter);


    }

    public void initFruits() {
        for (int i = 0; i < 10; i++) {
            Fruit apple = new Fruit("苹果", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("香蕉", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("橘子", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("西瓜", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("梨", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("葡萄", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("菠萝", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("草莓", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("樱桃", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("芒果", R.drawable.mango_pic);
            fruitList.add(mango);
        }


        swipe.setColorSchemeResources(R.color.colorPrimary);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshFruits();
            }
        });
    }

    private void refreshFruits() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        swipe.setRefreshing(false);
                    }
                });
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
