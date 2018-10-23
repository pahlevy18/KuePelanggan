package com.marketplace.kelompok2.kue.ui.listtoko;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.marketplace.kelompok2.kue.BuildConfig;
import com.marketplace.kelompok2.kue.R;
import com.marketplace.kelompok2.kue.model.Barang;
import com.marketplace.kelompok2.kue.model.BarangTokoList;
import com.marketplace.kelompok2.kue.model.Penjual;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PilihTokoRecyclerViewAdapter extends RecyclerView.Adapter<PilihTokoRecyclerViewAdapter.PilihTokoViewHolder>{

    private Context context;
    private ArrayList<BarangTokoList> listBarangPenjual;

    public PilihTokoRecyclerViewAdapter(Context context, ArrayList<BarangTokoList> listBarangPenjual){
        this.context = context;
        this.listBarangPenjual = listBarangPenjual;
    }

    @NonNull
    @Override
    public PilihTokoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PilihTokoViewHolder(LayoutInflater.from(context).
                inflate(R.layout.daftar_pilihtoko, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PilihTokoViewHolder holder, int position) {
        holder.bindItem(listBarangPenjual.get(position).getPenjual());
    }

    @Override
    public int getItemCount() {
        return listBarangPenjual.size();
    }

    class PilihTokoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgToko;
        private TextView namaToko;
        public PilihTokoViewHolder(View view) {
            super(view);
            initView(view);
        }

        private void initView(View view){
            imgToko = view.findViewById(R.id.iv_fototoko_pilihtoko);
            namaToko = view.findViewById(R.id.tv_namatoko_pilihtoko);
        }

        public void bindItem(Penjual penjual){
            Picasso.get().load(BuildConfig.BASE_STORAGE
                    + penjual.getImagePenjual()).into(imgToko);
            namaToko.setText(penjual.getNamatoko());
        }
    }

}
