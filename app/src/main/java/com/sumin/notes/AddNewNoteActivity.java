package com.sumin.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class AddNewNoteActivity extends AppCompatActivity {

    private EditText editTextTitle;
    private EditText multiAutoCompleteTextView;
    private RadioGroup radioGroup;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note);
        editTextTitle = findViewById(R.id.editTextTextTitle);
        multiAutoCompleteTextView = findViewById(R.id.editTextTextDescription);
        radioGroup = findViewById(R.id.radioGroupPriority);
        spinner = findViewById(R.id.spinnerDaysOfWeek);
    }

    public void onClickSaveNote(View view) {
        String title = editTextTitle.getText().toString().trim();
        String description = multiAutoCompleteTextView.getText().toString();
        String dayOfWeek = spinner.getSelectedItem().toString();
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(radioButtonId);
        int priority = Integer.parseInt(radioButton.getText().toString());
        Note note = new Note(title, description, dayOfWeek, priority);
        MainActivity.notes.add(note);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}