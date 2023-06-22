package com.example.projetoa2.ui.salas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SalasViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public SalasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is SALA fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}