package it.jgiem.apps.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import it.jgiem.apps.databinding.ActivityIntentInputBinding;

public class InputActivity extends AppCompatActivity {

    private ActivityIntentInputBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntentInputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initUi();
    }

    private void initUi() {
        Intent intent= getIntent();
        if(intent != null){
            String name = intent.getStringExtra("name");
            binding.et.setText(name);
        }
    }

    public void onSave(View view) {
        String text = binding.et.getText().toString();
        if(!text.isEmpty()){
            Intent intent = new Intent();
            intent.putExtra("text", text);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            Toast.makeText(this, "Empty Text!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onExit(View view) {
        finish();
    }
}