package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class noteEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        EditText editText =(EditText)findViewById(R.id.editText);
        Intent intent = getIntent();
         int noteId = intent.getIntExtra("noteId" ,-1);
        if (noteId!= -1){
            editText.setText(MainActivity.notes.get(noteId));
        }
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                MainActivity.notes.set(noteId,String.valueOf(charSequence));
//                MainActivity.arrayAdapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
    }
}