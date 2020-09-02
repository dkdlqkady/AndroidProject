package com.example.qwer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PhoneRecyclerAdaptop extends RecyclerView.Adapter<PhoneRecyclerAdaptop.MyViewHolder>{
    private List<UserData> data;


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        private TextView TextView_Phone_Name,TextView_Phone_Relation,TextView_Phone_Number;

        private View rootView; //목록 클릭시 이벤트 상황 처리
        public MyViewHolder(View v) {
            super(v);
            v.setClickable(true);
            v.setEnabled(true);
            TextView_Phone_Name = v.findViewById(R.id.TextView_Phone_Name);
            TextView_Phone_Relation = v.findViewById(R.id.TextView_Phone_Relation);
            TextView_Phone_Number = v.findViewById(R.id.TextView_Phone_Number);
        //    v.setOnTouchListener(touchListener);
            //v.setOnClickListener(clickListener);  //목록 클릭시 이벤트 상황 처리
            rootView = v;
        }
    }


    public PhoneRecyclerAdaptop () { // 찾아온 목록 클릭했을 때의 이벤트 처리 생성자 상태
        data = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.phone_setting_list2, parent, false);

        //화면 각각 목록의 레이아웃

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        UserData inputData = data.get(position);

        holder.TextView_Phone_Name.setText("이름 : " + inputData.getName());
        holder.TextView_Phone_Number.setText("휴대전화 : " + inputData.getHp());
        holder.TextView_Phone_Relation.setText("관계 : " + inputData.getRelation());
    }

    public void add(UserData udata){
        if(udata != null) {
            data.add(udata);
            notifyItemInserted(data.size() - 1); // 갱신용
        }
    }


    // Return the size of your dataset (invoked by the layout manager)

    public void clear(){
        data.clear();
        notifyItemRangeRemoved(0, data.size() - 1);
    }

    @Override
    public int getItemCount() {
        return data == null ?  0  : data.size();
    }

    public UserData getData(int pos){
        return data != null ? data.get(pos) : null;
    }
}