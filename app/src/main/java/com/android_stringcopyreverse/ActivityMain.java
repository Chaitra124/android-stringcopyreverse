package com.android_stringcopyreverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    private EditText editTextString;
    private EditText editTextStringCopy;

    private void linkObjectsToViews() {
        this.editTextString=(EditText)this.findViewById(R.id.editTextString);
        this.editTextStringCopy=(EditText)this.findViewById(R.id.editTextStringCopy);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.linkObjectsToViews();
    }
    public void buttonCopyHandler(View view) {
        String strString=this.editTextString.getText().toString();
        this.editTextStringCopy.setText(strString);
        Toast.makeText(this,"String has been copied",Toast.LENGTH_SHORT).show();
    }
}