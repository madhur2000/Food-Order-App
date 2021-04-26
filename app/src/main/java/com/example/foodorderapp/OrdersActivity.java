package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.foodorderapp.adapters.OrdersAdapter;
import com.example.foodorderapp.databinding.ActivityOrdersBinding;
import com.example.foodorderapp.models.OrdersModel;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrdersBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        DBHelper helper = new DBHelper(this);

        ArrayList<OrdersModel> list = helper.getOrders();
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));
//        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "123456789"));

        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}
