package com.example.projetoa2.ui.contato;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetoa2.R;
import com.example.projetoa2.databinding.FragmentContatoBinding;

public class ContatoFragment extends Fragment {

    private FragmentContatoBinding binding;
    Button btnEnviar;
    EditText txtNome, txtSobrenome, txtEmail, txtTel;
    RadioButton checkP, checkR, checkF;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        ContatoViewModel contatoViewModel =
                new ViewModelProvider(this).get(ContatoViewModel.class);

        binding = FragmentContatoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        txtNome = root.findViewById(R.id.txtNome);
        txtSobrenome = root.findViewById(R.id.txtSobrenome);
        txtEmail= root.findViewById(R.id.txtEmail);
        txtTel= root.findViewById(R.id.txtTel);
        checkP = (RadioButton) root.findViewById(R.id.checkP);
        checkR = (RadioButton) root.findViewById(R.id.checkR);
        checkF = (RadioButton) root.findViewById(R.id.checkF);

        btnEnviar = (Button) root.findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = txtNome.getText().toString().trim();
                String sobrenome = txtSobrenome.getText().toString().trim();
                String email = txtEmail.getText().toString().trim();
                String telefone = txtTel.getText().toString().trim();

                if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
                    Toast.makeText(getContext(), "Por favor, preencha todos os campos", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!checkP.isChecked() && !checkR.isChecked() && !checkF.isChecked()) {
                    Toast.makeText(getContext(), "Por favor, selecione uma opção de sala.", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!isValidEmail(email)) {
                    Toast.makeText(getContext(), "Por favor, insira um email válido.", Toast.LENGTH_LONG).show();
                    return;
                }
                if (telefone.length() != 11 && telefone.length() != 10) {
                    Toast.makeText(getContext(), "Contato inválido. Informe o DDD do telefone!", Toast.LENGTH_LONG).show();
                    return;
                }


                Toast.makeText(getContext(), "Dados enviados com sucesso!", Toast.LENGTH_LONG).show();
                txtNome.setText("");
                txtSobrenome.setText("");
                txtEmail.setText("");
                txtTel.setText("");
                checkP.setChecked(false);
                checkR.setChecked(false);
                checkF.setChecked(false);
            }
        });

        return root;
    }

    /*private boolean isValidEmail(String email) {
        // Padrão para verificar se o email está formatado corretamente
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }*/
    private boolean isValidEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}