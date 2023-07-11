package cl.samf.individual_mvp_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.samf.individual_mvp_7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}