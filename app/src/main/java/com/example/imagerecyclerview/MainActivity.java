package com.example.imagerecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("DSA in Java", 4));
        courseModelArrayList.add(new CourseModel("Java Course", 3));
        courseModelArrayList.add(new CourseModel("C++ COurse", 4));
        courseModelArrayList.add(new CourseModel("DSA in C++", 4));
        courseModelArrayList.add(new CourseModel("Kotlin for Android", 4));
        courseModelArrayList.add(new CourseModel("Java for Android", 4));
        courseModelArrayList.add(new CourseModel("HTML and CSS", 4));

        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}