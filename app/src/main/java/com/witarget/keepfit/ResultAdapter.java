package com.witarget.keepfit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ResultAdapter extends RecyclerView.Adapter<ResultViewHolder> {

    private List<Result> resultList;
    private Context context;

    public ResultAdapter(Context context) {

        this.context = context;
        this.resultList = new ArrayList<>();
    }

    @Override
    public ResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.result_item, null);
        final ResultViewHolder rcv = new ResultViewHolder(itemView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ResultViewHolder holder, int position) {

        Result result = resultList.get(position);

        holder.score.setText(String.valueOf(result.getscore()));
        holder.name.setText(result.getname());

    }

    @Override
    public int getItemCount() {
        return (resultList == null) ? 0 : resultList.size();
    }

    public void setResultList(List<Result> results) {
        if (results != null) {
            this.resultList.clear();
            this.resultList.addAll(results);
            notifyDataSetChanged();
        }

    }

    public List<Result> getResultList(){
        return resultList;
    }

}


