package com.example.hdang.draganddraw;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_drag_and_draw);
    }

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
