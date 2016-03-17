package com.example.user.homeworklesson2;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import android.widget.Toast;

/**
 * Created by User on 3/18/2016.
 */

public class CheckBoxClick implements AdapterView.OnItemClickListener {

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub
        CheckedTextView ctv = (CheckedTextView)arg1;
        if(ctv.isChecked()){

        }else{

        }
    }
}