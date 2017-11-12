package com.infinium.tutotial;

/**
 * Created by User on 28.10.17.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Fragment2 extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private ListView mListview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        mListview = (ListView) view.findViewById(R.id.listView);

//        ArrayList<Card> list = new ArrayList<>();
//
//        list.add(new Card("@drawable://" + R.drawable.Picture1, "This is picture 1"));
//        list.add(new Card("@drawable://" + R.drawable.Picture2, "This is picture 2"));
//        list.add(new Card("@drawable://" + R.drawable.Picture3, "This is picture 3"));
//        list.add(new Card("@drawable://" + R.drawable.Picture4, "This is picture 4"));
//        list.add(new Card("@drawable://" + R.drawable.Picture5, "This is picture 5"));
//        //list.add(new Card("@drawable://" + R.drawable.Picture6, "This is picture 6"));
//        list.add(new Card("@drawable://" + R.drawable.Picture7, "This is picture 7"));
//        list.add(new Card("@drawable://" + R.drawable.Picture8, "This is picture 8"));
//        list.add(new Card("@drawable://" + R.drawable.Picture9, "This is picture 9"));
//
////        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.fragment1, list);
////        mListview.setAdapter(adapter);
//
        return view;
    }
}