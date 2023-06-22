package com.example.projetoa2.ui.historia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoriaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public HistoriaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is SALA fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}