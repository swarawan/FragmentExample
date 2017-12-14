package com.swarawan.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rioswarawan on 12/14/17.
 */

public class FragmentColor extends Fragment {

    public static final int COLOR_RED = 1;
    public static final int COLOR_BLUE = COLOR_RED << 1;
    public static final int COLOR_GREEN = COLOR_RED << 2;
    public static final String paramKey = "selected-color";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        if (getArguments() != null) {
            int color = getArguments().getInt(paramKey);
            if (color == COLOR_RED) {
                view.findViewById(R.id.image_color).setBackgroundColor(getResources().getColor(R.color.red));
            } else if (color == COLOR_GREEN) {
                view.findViewById(R.id.image_color).setBackgroundColor(getResources().getColor(R.color.green));
            } else if (color == COLOR_BLUE) {
                view.findViewById(R.id.image_color).setBackgroundColor(getResources().getColor(R.color.blue));
            }
        }

        return view;
    }
}
