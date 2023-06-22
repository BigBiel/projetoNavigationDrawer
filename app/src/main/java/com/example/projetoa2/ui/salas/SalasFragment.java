package com.example.projetoa2.ui.salas;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoa2.databinding.FragmentSalasBinding;

public class SalasFragment extends Fragment {

    private FragmentSalasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SalasViewModel salaViewModel =
                new ViewModelProvider(this).get(SalasViewModel.class);

        binding = FragmentSalasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}