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

public class FragmentMaster extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        view.findViewById(R.id.button_red).setOnClickListener(onRedClicked);
        view.findViewById(R.id.button_green).setOnClickListener(onGreenClicked);
        view.findViewById(R.id.button_blue).setOnClickListener(onBlueClicked);

        return view;
    }

    private View.OnClickListener onRedClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ((MainActivity)getActivity()).changeFragmentBackground(FragmentColor.COLOR_RED);
        }
    };

    private View.OnClickListener onGreenClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ((MainActivity)getActivity()).changeFragmentBackground(FragmentColor.COLOR_GREEN);
        }
    };

    private View.OnClickListener onBlueClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ((MainActivity)getActivity()).changeFragmentBackground(FragmentColor.COLOR_BLUE);
        }
    };
}
