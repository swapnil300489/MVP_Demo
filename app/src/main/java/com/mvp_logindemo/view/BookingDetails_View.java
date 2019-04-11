package com.mvp_logindemo.view;

import com.pojo.BookingDetails_Response;

import java.util.List;

public interface BookingDetails_View {

    void historyReservtion(List<BookingDetails_Response.Result> result);
    void upComingReservation(List<BookingDetails_Response.Resultarray> resultarray);
    void upComingError(String data);

}
