 package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.RecyclerViewNotes);
        notes.add(new Note("Парикмакер", "Сделать прическу", "Понедельник", 2));
        notes.add(new Note("Стоматолог", "Лечить зубы", "Среда", 1));
        notes.add(new Note("Спорт зал", "Сходить в спортзал", "Суббота", 1));
        notes.add(new Note("Погулять с друзьями", "Погулять", "Понедельник", 3));
        notes.add(new Note("Кот", "Покормить кота", "Четверг", 1));
        notes.add(new Note("Футбол", "Посмотреть матч лиги чемпионов", "Вторник", 3));
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);

    }
}