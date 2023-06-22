package com.example.projetoa2.ui.feedback;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetoa2.R;
import com.example.projetoa2.databinding.FragmentFeedbackBinding;


public class FeedbackFragment extends Fragment {

    private FragmentFeedbackBinding binding;
    private ImageView imageView, imageView2, imageView3, imageView4, imageView5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FeedbackViewModel feedbackViewModel =
                new ViewModelProvider(this).get(FeedbackViewModel.class);

        binding = FragmentFeedbackBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        imageView = root.findViewById(R.id.cliente1);
        imageView2 = root.findViewById(R.id.cliente2);
        imageView3 = root.findViewById(R.id.cliente3);
        imageView4 = root.findViewById(R.id.cliente4);
        imageView5 = root.findViewById(R.id.cliente5);
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up2);
        Animation animation3 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up3);
        Animation animation4 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up4);
        Animation animation5 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up5);
        imageView.setVisibility(View.VISIBLE);
        imageView.startAnimation(animation);
        imageView2.setVisibility(View.VISIBLE);
        imageView2.startAnimation(animation2);
        imageView3.setVisibility(View.VISIBLE);
        imageView3.startAnimation(animation3);
        imageView4.setVisibility(View.VISIBLE);
        imageView4.startAnimation(animation4);
        imageView5.setVisibility(View.VISIBLE);
        imageView5.startAnimation(animation5);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}