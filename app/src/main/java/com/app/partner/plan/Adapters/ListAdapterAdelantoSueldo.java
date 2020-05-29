package com.app.partner.plan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.partner.plan.R;

import java.util.List;

public class ListAdapterAdelantoSueldo extends BaseAdapter {

    private Context context;
    private List<String> lsAdelantosSueldo;
    private OnClickListener onClickListener;

    public ListAdapterAdelantoSueldo(Context context, List<String> lsAdelantosSueldo, OnClickListener listener) {
        this.context = context;
        this.lsAdelantosSueldo = lsAdelantosSueldo;
        this.onClickListener = listener;
    }

    @Override
    public int getCount() {
        return lsAdelantosSueldo.size();
    }

    @Override
    public Object getItem(int position) {
        return lsAdelantosSueldo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(R.layout.list_adelanto_sueldo, null);
            viewHolder.tvPeriodo = convertView.findViewById(R.id.textViewPeriodoAdelantoSueldo);
            viewHolder.tvEstado = convertView.findViewById(R.id.textViewEstadoAdelantoSueldo);
            viewHolder.ivVer = convertView.findViewById(R.id.imageViewVerAdelantoSueldo);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvPeriodo.setText(lsAdelantosSueldo.get(position));
        viewHolder.tvEstado.setText(lsAdelantosSueldo.get(position));
      //  viewHolder.diaFerdo.setText(lsplanilla.get(position));


        viewHolder.ivVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onEyeClick(lsAdelantosSueldo.get(position), position);
            }
        });
        return convertView;
    }

    static class ViewHolder {
        TextView tvPeriodo, tvEstado;
        ImageView ivVer;
    }

    public interface OnClickListener {
        void onEyeClick(String adelantoSueldo, int position);
    }
}
