package com.app.partner.plan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.partner.plan.Model.Request.PlanillaHistorico;
import com.app.partner.plan.R;

import java.util.List;

public class ListAdapterBoletas extends BaseAdapter {

    private Context context;
    List<PlanillaHistorico> lsplanilla;
    OnClickListener onClickListener;

    public ListAdapterBoletas(Context context, List<PlanillaHistorico> lsplanilla, OnClickListener onClickListener) {
        this.context = context;
        this.lsplanilla = lsplanilla;
        this.onClickListener = onClickListener;
    }

    public ListAdapterBoletas(Context context, List<PlanillaHistorico> lsplanilla) {
        this.context = context;
        this.lsplanilla = lsplanilla;
    }

    @Override
    public int getCount() {
        return lsplanilla.size();
    }

    @Override
    public Object getItem(int i) {
        return lsplanilla.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView( int  position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(R.layout.list_boletas, null);
            viewHolder.diaFerdo = convertView.findViewById(R.id.txtBoletas);
            viewHolder.downland = convertView.findViewById(R.id.imageViewVerBoleta);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.diaFerdo.setText(lsplanilla.get(position).getPdoMes().getDescripcion());
        viewHolder.downland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onDownland(lsplanilla.get(position), position);
            }
        });
        return convertView;
    }


    private static class ViewHolder {
        private TextView diaFerdo;
        private ImageView downland;
    }


    public interface OnClickListener {
        void onDownland(PlanillaHistorico planillaHistorico, int position);
    }
}
