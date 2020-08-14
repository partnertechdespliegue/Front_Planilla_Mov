package com.app.partner.plan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.partner.plan.Model.Request.MODEL.AdelantoSueldoMODEL;
import com.app.partner.plan.R;
import java.util.List;

public class ListAdapterCuotaAdelantoSueldo extends BaseAdapter {

    private Context context;
    private List<AdelantoSueldoMODEL> lscuotas;

    private ListAdapterAdelantoSueldo.OnClickListener onClickListener;

    public ListAdapterCuotaAdelantoSueldo(Context context, List<AdelantoSueldoMODEL> lscuotas, ListAdapterAdelantoSueldo.OnClickListener onClickListener) {
        this.context = context;
        this.lscuotas = lscuotas;
        this.onClickListener = onClickListener;
    }

    public ListAdapterCuotaAdelantoSueldo(Context context, List<AdelantoSueldoMODEL> lscuotas) {
        this.context = context;
        this.lscuotas = lscuotas;
    }

    @Override
    public int getCount() {
        return lscuotas.size();
    }

    @Override
    public Object getItem(int position) {
        return lscuotas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_cuota_adelanto_sueldo, null);
            viewHolder.tvPeriodoCuota = convertView.findViewById(R.id.textViewPeriodoCuotaAdeSueldo);
            viewHolder.tvEstadoCuota =  convertView.findViewById(R.id.textViewEstadoCuotaAdeSueldo);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvPeriodoCuota.setText(lscuotas.get(position).getFechaSol().toString());
        viewHolder.tvEstadoCuota.setText(lscuotas.get(position).getEstado());

        viewHolder.ivVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onEyeClick(lscuotas.get(position),position);
            }
        });

        return convertView;
    }

    public class ViewHolder {
        TextView tvPeriodoCuota, tvEstadoCuota;
        ImageView ivVer;
    }

    public interface OnClickListener {
        void onEyeClick(AdelantoSueldoMODEL adelantoSueldo, int position);
    }
}
