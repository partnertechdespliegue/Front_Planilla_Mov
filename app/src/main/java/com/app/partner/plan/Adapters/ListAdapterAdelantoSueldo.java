package com.app.partner.plan.Adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;
import com.app.partner.plan.R;

import java.util.ArrayList;
import java.util.List;

public class ListAdapterAdelantoSueldo extends BaseAdapter {

    private Context context;
    private List<AdelantoSueldoMODEL> lsAdelantosSueldo = new ArrayList<>();
    private ImageView imageViewVerAdelantoSueldo;
    private OnClickListener onClickListener;

    public ListAdapterAdelantoSueldo(Context context, List<AdelantoSueldoMODEL> lsAdelantosSueldo, OnClickListener listener) {
        this.context = context;
        this.lsAdelantosSueldo = lsAdelantosSueldo;
        this.onClickListener = listener;
    }

    public ListAdapterAdelantoSueldo(Context context, List<AdelantoSueldoMODEL> adelantoSueldoMODELS) {
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

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
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
        if(lsAdelantosSueldo.get(position).getEstado()==0){
            viewHolder.tvPeriodo.setText("cancelado");
            viewHolder.tvEstado.setText(lsAdelantosSueldo.get(position).getFechaSol().toString());
        }else if(lsAdelantosSueldo.get(position).getEstado()==1){
            viewHolder.tvPeriodo.setText("pendiente");
            viewHolder.tvEstado.setText(lsAdelantosSueldo.get(position).getFechaSol().toString());
        }


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
        void onEyeClick(AdelantoSueldoMODEL adelantoSueldoMODEL, int position);
    }
}
