package com.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.global.Config;
import com.mvp_logindemo.R;
import com.pojo.BookingDetails_Response;

import java.util.List;

public class Booking_Adapter extends  RecyclerView.Adapter<Booking_Adapter.MyViewHolder>{

    private Context context;
    private List<BookingDetails_Response.Result> historyData;
    private List<BookingDetails_Response.Resultarray> upComingData;
    private String flag = "";
    private Config config = new Config();


    public Booking_Adapter(Context context, List<BookingDetails_Response.Result> results, String flag) {
        this.context = context;
        this.historyData = results;
        this.flag    = flag;

    }

    public Booking_Adapter(List<BookingDetails_Response.Resultarray> resultarrays, Context context, String flag) {
        this.flag         = flag;
        this.upComingData = resultarrays;
        this.context      = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.booking_item, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        switch (flag){

            case "1":

                historyReservation(holder, position, historyData);
                break;

            case  "2":
                upcomingDataSet(holder, position, upComingData);
                break;

        }





    }

    private void upcomingDataSet(MyViewHolder holder, int position, List<BookingDetails_Response.Resultarray> upComingData) {

        holder.txt_bookingId.setText(upComingData.get(position).getBookingRequestId());
        holder.txt_datetime.setText(config.setDateTime(upComingData.get(position).getScheduleDateTime()));
        holder.txt_pick.setText(upComingData.get(position).getBookingPickupLocation());
        holder.txt_drop.setText(upComingData.get(position).getBookingDestinationLocation());
        holder.seatTV.setText(upComingData.get(position).getPassengerCount());
        holder.txt_cartype.setText(upComingData.get(position).getVehicleType());

        switch (upComingData.get(position).getBookingRequestStatus()){
            case "0":
                holder.txt_bookingstatus.setText("Upcoming");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#ff531a"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                break;

            case "1":
                holder.txt_bookingstatus.setText("Driver Confirmed");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#b300b3"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                break;

            case "8":
                holder.txt_bookingstatus.setText("Driver is on the way");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#5c00e6"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                break;

            case "9":
                holder.txt_bookingstatus.setText("Driver has reached");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#ff531a"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                break;
        }

       String carType = upComingData.get(position).getVehicleType();

        if (carType.equals("Standard")) {
            holder.img_car.setImageResource(R.drawable.mini_new);
        } else if (carType.equals("Large")) {
            holder.img_car.setImageResource(R.drawable.sedan_new);
        } else if (carType.equals("Premium")) {
            holder.img_car.setImageResource(R.drawable.suv_new);
        } else if (carType.equals("Premium XL")) {
            holder.img_car.setImageResource(R.drawable.primexl);
        }


    }

    private void historyReservation(MyViewHolder holder, int position, List<BookingDetails_Response.Result> historyData) {

        holder.txt_bookingId.setText(historyData.get(position).getBookingRequestId());
        holder.txt_datetime.setText(config.setDateTime(historyData.get(position).getScheduleDateTime()));
        holder.txt_pick.setText(historyData.get(position).getBookingPickupLocation());
        holder.txt_drop.setText(historyData.get(position).getBookingDestinationLocation());
        holder.seatTV.setText(historyData.get(position).getPassengerCount());
        holder.txt_cartype.setText(historyData.get(position).getVehicleType());



        switch (historyData.get(position).getBookingRequestStatus()){

            case "2":
                holder.txt_bookingstatus.setText("Driver Canceled");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#dcf23b4d"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                holder.luggage_LL.setVisibility(View.GONE);
                break;

            case "3":
                holder.txt_bookingstatus.setText("Rider Canceled");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#dcf23b4d"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                holder.luggage_LL.setVisibility(View.GONE);
                break;

            case "4":
                holder.txt_bookingstatus.setText("Reservation Completed");
                holder.txt_bookingstatus.setTextColor(Color.parseColor("#008000"));
                holder.txt_bookingstatus.setVisibility(View.VISIBLE);
                holder.luggage_LL.setVisibility(View.GONE);


                String smallCount ="", mediunCount ="", largeCount ="";

                smallCount  = historyData.get(position).getSmallluggageCount();
                mediunCount = historyData.get(position).getMediumluggageCount();
                largeCount  = historyData.get(position).getLargeluggageCount();

                setLuggageData(smallCount,mediunCount,largeCount, holder);

                break;


        }

        String carType = historyData.get(position).getVehicleType();

        if (carType.equals("Standard")) {
            holder.img_car.setImageResource(R.drawable.mini_new);
        } else if (carType.equals("Large")) {
            holder.img_car.setImageResource(R.drawable.sedan_new);
        } else if (carType.equals("Premium")) {
            holder.img_car.setImageResource(R.drawable.suv_new);
        } else if (carType.equals("Premium XL")) {
            holder.img_car.setImageResource(R.drawable.primexl);
        }

    }

    private void setLuggageData(String smallCount, String mediunCount, String largeCount, MyViewHolder holder) {


        if(!smallCount.equals("0") && !mediunCount.equals("0") && !largeCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("S: "+smallCount +",M: "+mediunCount +",L: "+largeCount);
        }else if(!smallCount.equals("0") && !mediunCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("S: "+smallCount+",M: "+mediunCount);
        }else if(!mediunCount.equals("0") && !largeCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("M: "+mediunCount+",L: "+largeCount);
        }else if(!smallCount.equals("0") && !largeCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("S: "+smallCount+",L: "+largeCount);
        }else if(!smallCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("S: "+smallCount);
        }else if(!mediunCount.equals("0"))
        {
            holder.luggageIV.setVisibility(View.VISIBLE);
            holder.luggageTV.setText("M: "+mediunCount);
        }else if(!largeCount.equals("0"))
        {
            holder.luggageIV .setVisibility(View.VISIBLE);
            holder.luggageTV.setText("L: "+largeCount);
        }else if(smallCount.equals("0") && mediunCount.equals("0") && largeCount.equals("0")) {

            holder.luggage_LL.setVisibility(View.GONE);

        }
    }


    @Override
    public int getItemCount() {

        int size = 0;

        switch (flag){

            case "1":
                size = this.historyData.size();
                break;

            case "2":
                size = this.upComingData.size();
                break;

                case "3":

                size = 1;
                break;
        }

        return size;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView txt_bookingId, txt_datetime, txt_finalbill, txt_pick, txt_drop, txt_cartype, txt_bookingstatus, seatTV, luggageTV;
        private ImageView img_car, img_popupmenu, seatIV, luggageIV;
        private LinearLayout ll_pickup, ll_drop, ongoingHistoryLL, luggage_LL;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            txt_bookingId     =  itemView.findViewById(R.id.txt_bookingId);
            txt_datetime      =  itemView.findViewById(R.id.txt_tatetime_id);

            txt_finalbill     =  itemView.findViewById(R.id.txt_finalbill_id);
            txt_pick          =  itemView.findViewById(R.id.txt_pick_id);

            txt_drop          =  itemView.findViewById(R.id.txt_drop_id);
            txt_cartype       =  itemView.findViewById(R.id.txt_cartype_id);

            txt_bookingstatus =  itemView.findViewById(R.id.txt_bookingstatus_id);
            luggage_LL        = itemView.findViewById(R.id.ll_luggage);

            seatTV            = itemView.findViewById(R.id.id_car_seat);
            luggageTV         = itemView.findViewById(R.id.id_car_luggagetv);

            seatIV            = itemView.findViewById(R.id.id_car_seatIV);
            luggageIV         = itemView.findViewById(R.id.id_car_luggageIV);

            img_car           = itemView.findViewById(R.id.img_car_id);
            img_popupmenu     = itemView.findViewById(R.id.img_popupmenu_id);

            ll_pickup         = itemView.findViewById(R.id.ll_pickup_id);
            ll_drop           = itemView.findViewById(R.id.ll_drop_id);

            ongoingHistoryLL =  itemView.findViewById(R.id.id_upcominghistoryLL);
        }
    }
}
