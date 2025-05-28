package com.mudhiya.recyclerviewa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {
    public ImageView _imageView2;
    public TextView _deskripsiTextView;
    public TextView _namaTextView;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _deskripsiTextView = (TextView)itemView.findViewById(R.id.deskrpsiTextView);
    }
}

