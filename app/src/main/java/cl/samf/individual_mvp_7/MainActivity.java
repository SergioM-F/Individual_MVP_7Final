package cl.samf.individual_mvp_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.samf.individual_mvp_7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IviewPresentador {

    private Presentador presentando;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //vista - construir el modelo y presentador

        presentando = new Presentador(this);
        binding.editTextPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentando.evaluarContrasena(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void mostrarDebil() {
        Toast.makeText(this, "DEBIL", Toast.LENGTH_SHORT).show();
        //binding.textViewNivel.setBackgroundColor(getColor().GREEN);

    }

    @Override
    public void mostrarMedio() {
        Toast.makeText(this, "MEDIO", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarFuerte() {
        Toast.makeText(this, "FUERTE", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostrarError() {
        Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();

    }
}