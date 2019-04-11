package com.mvp_logindemo.model;

import com.global.Config;
import com.mvp_logindemo.presenter.BookingDetails_Presenter;
import com.mvp_logindemo.view.BookingDetails_View;
import com.pojo.BookingDetails_Response;
import com.retrofit.APIClient;
import com.retrofit.APIInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingDetails_Model implements BookingDetails_Presenter {

    private APIClient apiClient;
    private APIInterface apiInterface;
    private String osType = Config.OS_Type;
    private BookingDetails_View bookingDetails_view;

    public BookingDetails_Model(BookingDetails_View bookingDetails_view){

        this.bookingDetails_view = bookingDetails_view;
    }

    @Override
    public void getData(String userId) {

        Call<BookingDetails_Response> bookingDetails_responseCall = apiInterface.BOOKING_DETAILS_RESPONSE_CALL(userId,osType);

        bookingDetails_responseCall.enqueue(new Callback<BookingDetails_Response>() {
            @Override
            public void onResponse(Call<BookingDetails_Response> call, Response<BookingDetails_Response> response) {

                BookingDetails_Response bookingDetails_response = response.body();

                if(bookingDetails_response.getMsg().equals("Success")){

                    List<BookingDetails_Response.Result> result = bookingDetails_response.getResult();
                    List<BookingDetails_Response.Resultarray> resultarrays = bookingDetails_response.getResultarray();


                    if(result.size() != 0){
                        bookingDetails_view.historyReservtion(result);
                    }
                    if (resultarrays.size() != 0){
                        bookingDetails_view.upComingReservation(resultarrays);
                    }

                    if(result.size() == 0 && resultarrays.size() == 0){

                        bookingDetails_view.upComingError("1"); // No Rides

                    }



                }else{
                    bookingDetails_view.upComingError("2"); // Some thing went wrong
                }





            }

            @Override
            public void onFailure(Call<BookingDetails_Response> call, Throwable t) {

                bookingDetails_view.upComingError(t.getMessage());

            }
        });




    }

    @Override
    public void initRetrofit() {

        apiClient = new APIClient();
        apiInterface = apiClient.getConnection();

    }
}
