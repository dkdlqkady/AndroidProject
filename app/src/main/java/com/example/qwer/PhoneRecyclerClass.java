package com.example.qwer;

import android.app.Activity;
import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneRecyclerClass {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public void execute(Activity act, Context con){ // 리사이클러뷰 사용 시작
        recyclerView = (RecyclerView) act.findViewById(R.id.RecyclerView_Phone_List);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(con);

        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new PhoneRecyclerAdaptop(); // 원래 기존에 사용하던 것
        recyclerView.setAdapter(mAdapter);
    }


    public void add(UserData data){
        ((PhoneRecyclerAdaptop) mAdapter).add(data);
    } // 리사이클러뷰에 데이터 추가

    public void clear(){
        ((PhoneRecyclerAdaptop) mAdapter).clear();
    }  // 리사이클러뷰 전체 초기화
}
