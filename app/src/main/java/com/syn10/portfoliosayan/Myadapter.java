package com.syn10.portfoliosayan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    Context context;
    ArrayList<MyAccount> arrAccount;

    Myadapter(Context context, ArrayList<MyAccount> arrAccount) {
        this.context = context;
        this.arrAccount = arrAccount;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_account, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(arrAccount.get(position).name);
        holder.book_about1.setText(arrAccount.get(position).book_about1);
        holder.nameAbout1.setText(arrAccount.get(position).nameAbout1);
        holder.experience_about.setText(arrAccount.get(position).experience_about);
        holder.workplace.setText(arrAccount.get(position).workplace);
        holder.phoneNo.setText(arrAccount.get(position).phoneNo);
        holder.email.setText(arrAccount.get(position).email);
        holder.book_about2.setText(arrAccount.get(position).book_about2);
        holder.img.setImageResource(arrAccount.get(position).img);

        holder.skill1.setText(arrAccount.get(position).skill1);
        holder.skill2.setText(arrAccount.get(position).skill2);
        holder.skill3.setText(arrAccount.get(position).skill3);
        holder.skill4.setText(arrAccount.get(position).skill4);
        holder.skill5.setText(arrAccount.get(position).skill5);
        holder.skill6.setText(arrAccount.get(position).skill6);

        holder.skill1_img.setImageResource(arrAccount.get(position).skill1_img);
        holder.skill2_img.setImageResource(arrAccount.get(position).skill2_img);
        holder.skill3_img.setImageResource(arrAccount.get(position).skill3_img);
        holder.skill4_img.setImageResource(arrAccount.get(position).skill4_img);
        holder.skill5_img.setImageResource(arrAccount.get(position).skill5_img);
        holder.skill6_img.setImageResource(arrAccount.get(position).skill6_img);

        holder.project1.setText(arrAccount.get(position).project1);
        holder.project2.setText(arrAccount.get(position).project2);
        holder.project3.setText(arrAccount.get(position).project3);
        holder.project4.setText(arrAccount.get(position).project4);

    }

    @Override
    public int getItemCount() {
        return arrAccount.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, nameAbout1, workplace, email, book_about1, book_about2, experience_about;
        TextView skill1, skill2, skill3, skill4, skill5, skill6;
        TextView project1,project2,project3,project4;
        ImageView img, skill1_img, skill2_img, skill3_img, skill4_img, skill5_img, skill6_img;
        Button book_btn, call_btn, email_btn;
        TextView phoneNo;
        LinearLayout entireLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            nameAbout1 = itemView.findViewById(R.id.nameabout1);
            workplace = itemView.findViewById(R.id.workPlace);
            phoneNo = itemView.findViewById(R.id.PhoneNumber_id);
            email = itemView.findViewById(R.id.Email_id);
            book_about1 = itemView.findViewById(R.id.book_about1);
            book_about2 = itemView.findViewById(R.id.book_about2);
            experience_about = itemView.findViewById(R.id.experience_about);
            book_btn = itemView.findViewById(R.id.book_btn);
            img = itemView.findViewById(R.id.UserIMG);
            entireLayout = itemView.findViewById(R.id.entireLayout);

            skill1 = itemView.findViewById(R.id.skill1);
            skill2 = itemView.findViewById(R.id.skill2);
            skill3 = itemView.findViewById(R.id.skill3);
            skill4 = itemView.findViewById(R.id.skill4);
            skill5 = itemView.findViewById(R.id.skill5);
            skill6 = itemView.findViewById(R.id.skill6);

            skill1_img = itemView.findViewById(R.id.skill1_img);
            skill2_img = itemView.findViewById(R.id.skill2_img);
            skill3_img = itemView.findViewById(R.id.skill3_img);
            skill4_img = itemView.findViewById(R.id.skill4_img);
            skill5_img = itemView.findViewById(R.id.skill5_img);
            skill6_img = itemView.findViewById(R.id.skill6_img);

            project1=itemView.findViewById(R.id.project1);
            project2=itemView.findViewById(R.id.project2);
            project3=itemView.findViewById(R.id.project3);
            project4=itemView.findViewById(R.id.project4);



            book_btn.setOnClickListener(view -> {
                Toast.makeText(context, "Booking Successful", Toast.LENGTH_SHORT).show();
            });

            call_btn = itemView.findViewById(R.id.call_btn);
            email_btn = itemView.findViewById(R.id.email_btn);

            call_btn.setOnClickListener(view -> {
                Toast.makeText(context, "Switched to call dialer", Toast.LENGTH_SHORT).show();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNo.getText().toString()));
                context.startActivity(callIntent);
            });

            email_btn.setOnClickListener(view -> {
                Toast.makeText(context, "Switched to email", Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email.getText().toString()));
                context.startActivity(emailIntent);
            });
        }
    }
}
