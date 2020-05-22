package com.app.partner.plan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.partner.plan.Model.Vacaciones;
import com.app.partner.plan.R;

import java.util.List;

public class ListAdapterVacaciones extends BaseAdapter {

    private Context context;
    private List<Vacaciones> lsVacaciones;
    private OnClickListener onClickListener;

    public ListAdapterVacaciones(Context context, List<Vacaciones> lsVacaciones, OnClickListener listener){
        this.context = context;
        this.lsVacaciones = lsVacaciones;
        this.onClickListener = listener;
    }

    @Override
    public int getCount() {
        return lsVacaciones.size();
    }

    @Override
    public Object getItem(int position) {
        return lsVacaciones.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(R.layout.list_vacaciones, null);

            viewHolder.tvPeriodo = convertView.findViewById(R.id.textViewPeriodoVacacion);
            viewHolder.tvEstado = convertView.findViewById(R.id.textViewEstadoVacacion);
            viewHolder.ivVer = convertView.findViewById(R.id.imageViewVerVacacion);
            viewHolder.ivSolicitar = convertView.findViewById(R.id.imageViewTomarVacacion);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvPeriodo.setText(lsVacaciones.get(position).getDescripcion());
        viewHolder.tvEstado.setText(String.valueOf(lsVacaciones.get(position).getEstado()));

        if (lsVacaciones.get(position).getEstado() == 1){
            viewHolder.ivVer.setVisibility(View.GONE);
            viewHolder.ivSolicitar.setVisibility(View.VISIBLE);
        } else {
            viewHolder.ivSolicitar.setVisibility(View.GONE);
            viewHolder.ivVer.setVisibility(View.VISIBLE);
        }

        viewHolder.ivVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onEyeClick(lsVacaciones.get(position), position);
            }
        });

        viewHolder.ivSolicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onAirPlaneClick(lsVacaciones.get(position), position);
            }
        });

        return convertView;
    }

    public class ViewHolder{
        TextView tvPeriodo, tvEstado;
        ImageView ivVer, ivSolicitar;
    }

    public interface OnClickListener {
        void onEyeClick(Vacaciones vacaciones, int position);
        void onAirPlaneClick(Vacaciones vacaciones, int position);
    }
}
