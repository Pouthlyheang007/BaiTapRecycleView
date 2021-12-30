package com.example.baitaprecyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> mListUser;
    private Context mContent;

    public UserAdapter(Context context, List<User> mListUser) {
        this.mContent = context;
        this.mListUser = mListUser;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        final User user = mListUser.get(position);
        if (user == null){
            return;
        }

        holder.imgAvatar.setImageResource(user.getResourceId());
        holder.tvName.setText(user.getName());
        holder.tvEmail.setText(user.getEmail());
        holder.tvAddress.setText(user.getAddress());
        holder.tvPhone.setText(user.getPhone());
        holder.tvCompany.setText(user.getCompany());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(user);
            }
        });
    }

    public void onClickGoToDetail(User user){
        Intent intent = new Intent(mContent, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_user",user);
        intent.putExtras(bundle);
        mContent.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if (mListUser != null){
            return mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout layoutItem;
        private ImageView imgAvatar;
        private TextView tvName;
        private TextView tvEmail;
        private TextView tvAddress;
        private TextView tvPhone;
        private TextView tvCompany;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            tvName = itemView.findViewById(R.id.tv_name);
            tvEmail = itemView.findViewById(R.id.tv_email);
            tvAddress = itemView.findViewById(R.id.tv_address);
            tvPhone = itemView.findViewById(R.id.tv_phone);
            tvCompany = itemView.findViewById(R.id.tv_company);
        }
    }
}
