package com.example.custom_dialog;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class JavaMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create custom view
        View view = LayoutInflater.from(this).inflate(R.layout.activity_phone,null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();

        alertDialog.show();
        //Bind view in onCreate
        Button call = view.findViewById(R.id.btn_call);
        //Should be final as it call in onClick block
        final EditText box = view.findViewById(R.id.edt_phone);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Click","work");
                phoneCall(box.getText().toString());
            }
        });
    }

    public void phoneCall(String phone){
        Log.d("This is phone ",phone.toString());
        //Set up your phone call code by urself
    }
}
