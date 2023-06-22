package com.example.projetoa2.ui.redes;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.projetoa2.R;
import com.example.projetoa2.databinding.FragmentRedesSociaisBinding;
import com.example.projetoa2.ui.redes.RedesSociaisViewModel;

import java.util.ArrayList;

public class RedesSociaisFragment extends Fragment {

    private FragmentRedesSociaisBinding binding;
    ImageView btnFace, btnInsta, btnTwitter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RedesSociaisViewModel redesViewModel =
                new ViewModelProvider(this).get(RedesSociaisViewModel.class);

        binding = FragmentRedesSociaisBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        btnFace = root.findViewById(R.id.btnFace);
        btnInsta = root.findViewById(R.id.btnInsta);
        btnTwitter = root.findViewById(R.id.btnTwitter);
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        btnInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}