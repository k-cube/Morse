package com.keivannorouzi.morse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by keivannorouzi on 2015-12-06.
 */
public class InboxFragment extends android.support.v4.app.ListFragment {//android.support when using view pager or supporting old versions

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //similar to set content view
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inbox, container, false);

        return rootView;
    }
}
