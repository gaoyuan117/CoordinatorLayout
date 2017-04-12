package com.jzbwlkj.coordinatorlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/12.
 */

public class MyFragment1 extends Fragment{
    private List<String> mList;
    private MyAdapter myAdapter;
    private RecyclerView mListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,null);
        mListView = (RecyclerView) view.findViewById(R.id.lv1);
        mList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mList.add("1");
        }
        myAdapter = new MyAdapter(getActivity(),mList);
        mListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mListView.setAdapter(myAdapter);
        return view;
    }
}
