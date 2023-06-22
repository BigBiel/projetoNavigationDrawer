package com.example.projetoa2.ui.historia;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoa2.databinding.FragmentHistoriaBinding;

public class HistoriaFragment extends Fragment {

    private FragmentHistoriaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HistoriaViewModel historiaViewModel =
                new ViewModelProvider(this).get(HistoriaViewModel.class);

        binding = FragmentHistoriaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}