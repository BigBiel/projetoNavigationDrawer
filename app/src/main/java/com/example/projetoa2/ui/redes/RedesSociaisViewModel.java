package com.example.projetoa2.ui.redes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RedesSociaisViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public RedesSociaisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is SALA fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}