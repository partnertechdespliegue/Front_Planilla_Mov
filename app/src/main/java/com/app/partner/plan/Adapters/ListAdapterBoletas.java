package com.app.partner.plan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.partner.plan.Model.Request.PlanillaHistorico;
import com.app.partner.plan.Model.Request.Trabajador;
import com.app.partner.plan.R;

import java.util.List;

public class ListAdapterBoletas extends BaseAdapter {


    private Context context;
    private int layout;
    List<PlanillaHistorico> lsplanilla;
    OnClickListener onClickListener;

    public ListAdapterBoletas(Context context, int layout, List<PlanillaHistorico> lsplanilla, OnClickListener onClickListener) {
        this.context = context;
        this.layout = layout;
        this.lsplanilla = lsplanilla;
        this.onClickListener = onClickListener;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null){

            view = LayoutInflater.from(this.context).inflate(R.layout.list_boletas, null);
            holder = new ViewHolder();
            holder.diaFerdo = view.findViewById(R.id.txtBoletas);
            holder.downland = view.findViewById(R.id.imageViewVerBoleta);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        holder.diaFerdo.setText((CharSequence) lsplanilla.get(i));
        return view;
    }

    private static class ViewHolder {
        private TextView diaFerdo;
        private ImageView downland;

    }
    public interface OnClickListener {
        void onEyeClick(String bol, int position);
    }
}
