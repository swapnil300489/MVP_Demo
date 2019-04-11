package com.retrofit;


import com.pojo.BookingDetails_Response;
import com.pojo.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {


    @POST("PHPLogin")
    @FormUrlEncoded
    Call<LoginResponse> LOGIN_RESPONSE_CALL(@Field("email") String email,
                                            @Field("password") String password,
                                            @Field("OS_Type") String OS_Type);

    @POST("OngoingHistory")
    @FormUrlEncoded
    Call<BookingDetails_Response> BOOKING_DETAILS_RESPONSE_CALL(@Field("riderId") String riderId,
                                                                @Field("OS_Type") String OS_Type);
}
