package com.mvp_logindemo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.adapter.Booking_Adapter;
import com.mvp_logindemo.R;
import com.mvp_logindemo.model.BookingDetails_Model;
import com.mvp_logindemo.model.LoginModel;
import com.mvp_logindemo.presenter.BookingDetails_Presenter;
import com.mvp_logindemo.presenter.LoginPresenter;
import com.mvp_logindemo.view.BookingDetails_View;
import com.pojo.BookingDetails_Response;

import java.util.List;

public class BookingStatus_Activity extends AppCompatActivity implements BookingDetails_View {

    private String usrID = "";
    private BookingDetails_Presenter bookingDetails_presenter;
    private RecyclerView history_recycler, upcoming_recycler;
    private LinearLayout ll_upcoming, ll_history;
    private List<BookingDetails_Response.Resultarray> resultarrays;
    private List<BookingDetails_Response.Result> results;
    private NestedScrollView scrollView;
    private TextView txt_nohistory;
    private LinearLayout ll_ridehistory;
    private String flag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_status);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Reservation Details");

        usrID = getIntent().getStringExtra("userId");

        init();

        bookingDetails_presenter = new BookingDetails_Model(this);
        bookingDetails_presenter.initRetrofit();
        bookingDetails_presenter.getData(usrID);

    }

    private void init() {
        history_recycler  = findViewById(R.id.yourrides_recycler_id);
        upcoming_recycler =  findViewById(R.id.upcoming_recycler_id);
        scrollView        = findViewById(R.id.scrollView);

        txt_nohistory  =  findViewById(R.id.txt_nohistory_id);
        ll_ridehistory =  findViewById(R.id.ll_ridehistory_id);
        ll_upcoming    =  findViewById(R.id.ll_upcoming_id);
        ll_history     =  findViewById(R.id.ll_history_id);

        history_recycler.setLayoutManager(new LinearLayoutManager(this));
        upcoming_recycler.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void historyReservtion(List<BookingDetails_Response.Result> historyData) {


        if (historyData.size() != 0)
        {
            flag = "1";
            results = historyData;
            history_recycler.setAdapter(new Booking_Adapter(BookingStatus_Activity.this, results, flag));
            history_recycler.setVisibility(View.VISIBLE);
            ll_history.setVisibility(View.VISIBLE);

        }else {
            history_recycler.setVisibility(View.GONE);
            ll_history.setVisibility(View.GONE);
        }

        scrollView.fullScroll(NestedScrollView.FOCUS_UP);
    }

    @Override
    public void upComingReservation(List<BookingDetails_Response.Resultarray> upComingData) {

        if (upComingData.size() != 0)
        {
            flag = "2";
            resultarrays = upComingData;
            upcoming_recycler.setAdapter(new Booking_Adapter(resultarrays,BookingStatus_Activity.this, flag));
            upcoming_recycler.setVisibility(View.VISIBLE);
            ll_upcoming.setVisibility(View.VISIBLE);
        }else {
            upcoming_recycler.setVisibility(View.GONE);
            ll_upcoming.setVisibility(View.GONE);
        }

        scrollView.fullScroll(NestedScrollView.FOCUS_UP);
    }

    @Override
    public void upComingError(String data) {

        if(data.equals("1")){

            history_recycler.setVisibility(View.GONE);
            ll_history.setVisibility(View.GONE);

            upcoming_recycler.setVisibility(View.GONE);
            ll_upcoming.setVisibility(View.GONE);

            txt_nohistory.setVisibility(View.VISIBLE);
            ll_ridehistory.setVisibility(View.GONE);

        }else {

            Toast.makeText(this, "Something went wrong, please try again.", Toast.LENGTH_SHORT).show();

        }

    }
}
