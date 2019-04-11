package com.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookingDetails_Response {

    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("ErrorCode")
    @Expose
    private String errorCode;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("resultarray")
    @Expose
    private List<Resultarray> resultarray = null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public List<Resultarray> getResultarray() {
        return resultarray;
    }

    public void setResultarray(List<Resultarray> resultarray) {
        this.resultarray = resultarray;
    }

    public class Result {

        @SerializedName("booking_pickup_location")
        @Expose
        private String bookingPickupLocation;
        @SerializedName("booking_destination_location")
        @Expose
        private String bookingDestinationLocation;
        @SerializedName("incentive")
        @Expose
        private String incentive;
        @SerializedName("schedule_date_time")
        @Expose
        private String scheduleDateTime;
        @SerializedName("booking_request_id")
        @Expose
        private String bookingRequestId;
        @SerializedName("booking_request_status")
        @Expose
        private String bookingRequestStatus;
        @SerializedName("distance")
        @Expose
        private String distance;
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("vehicleType")
        @Expose
        private String vehicleType;
        @SerializedName("booking_type")
        @Expose
        private Object bookingType;
        @SerializedName("booking")
        @Expose
        private Object booking;
        @SerializedName("trip_type")
        @Expose
        private Object tripType;
        @SerializedName("FinalAmount")
        @Expose
        private String finalAmount;
        @SerializedName("Drivername")
        @Expose
        private String drivername;
        @SerializedName("Drivercarno")
        @Expose
        private String drivercarno;
        @SerializedName("driverprof")
        @Expose
        private String driverprof;
        @SerializedName("riderContact")
        @Expose
        private String riderContact;
        @SerializedName("driverContact")
        @Expose
        private String driverContact;
        @SerializedName("drivershakey")
        @Expose
        private String drivershakey;
        @SerializedName("odoreading")
        @Expose
        private Object odoreading;
        @SerializedName("driverId")
        @Expose
        private String driverId;
        @SerializedName("chatflag")
        @Expose
        private String chatflag;
        @SerializedName("smallluggageCount")
        @Expose
        private String smallluggageCount;
        @SerializedName("mediumluggageCount")
        @Expose
        private String mediumluggageCount;
        @SerializedName("largeluggageCount")
        @Expose
        private String largeluggageCount;
        @SerializedName("passengerCount")
        @Expose
        private String passengerCount;

        public String getBookingPickupLocation() {
            return bookingPickupLocation;
        }

        public void setBookingPickupLocation(String bookingPickupLocation) {
            this.bookingPickupLocation = bookingPickupLocation;
        }

        public String getBookingDestinationLocation() {
            return bookingDestinationLocation;
        }

        public void setBookingDestinationLocation(String bookingDestinationLocation) {
            this.bookingDestinationLocation = bookingDestinationLocation;
        }

        public String getIncentive() {
            return incentive;
        }

        public void setIncentive(String incentive) {
            this.incentive = incentive;
        }

        public String getScheduleDateTime() {
            return scheduleDateTime;
        }

        public void setScheduleDateTime(String scheduleDateTime) {
            this.scheduleDateTime = scheduleDateTime;
        }

        public String getBookingRequestId() {
            return bookingRequestId;
        }

        public void setBookingRequestId(String bookingRequestId) {
            this.bookingRequestId = bookingRequestId;
        }

        public String getBookingRequestStatus() {
            return bookingRequestStatus;
        }

        public void setBookingRequestStatus(String bookingRequestStatus) {
            this.bookingRequestStatus = bookingRequestStatus;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public void setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
        }

        public Object getBookingType() {
            return bookingType;
        }

        public void setBookingType(Object bookingType) {
            this.bookingType = bookingType;
        }

        public Object getBooking() {
            return booking;
        }

        public void setBooking(Object booking) {
            this.booking = booking;
        }

        public Object getTripType() {
            return tripType;
        }

        public void setTripType(Object tripType) {
            this.tripType = tripType;
        }

        public String getFinalAmount() {
            return finalAmount;
        }

        public void setFinalAmount(String finalAmount) {
            this.finalAmount = finalAmount;
        }

        public String getDrivername() {
            return drivername;
        }

        public void setDrivername(String drivername) {
            this.drivername = drivername;
        }

        public String getDrivercarno() {
            return drivercarno;
        }

        public void setDrivercarno(String drivercarno) {
            this.drivercarno = drivercarno;
        }

        public String getDriverprof() {
            return driverprof;
        }

        public void setDriverprof(String driverprof) {
            this.driverprof = driverprof;
        }

        public String getRiderContact() {
            return riderContact;
        }

        public void setRiderContact(String riderContact) {
            this.riderContact = riderContact;
        }

        public String getDriverContact() {
            return driverContact;
        }

        public void setDriverContact(String driverContact) {
            this.driverContact = driverContact;
        }

        public String getDrivershakey() {
            return drivershakey;
        }

        public void setDrivershakey(String drivershakey) {
            this.drivershakey = drivershakey;
        }

        public Object getOdoreading() {
            return odoreading;
        }

        public void setOdoreading(Object odoreading) {
            this.odoreading = odoreading;
        }

        public String getDriverId() {
            return driverId;
        }

        public void setDriverId(String driverId) {
            this.driverId = driverId;
        }

        public String getChatflag() {
            return chatflag;
        }

        public void setChatflag(String chatflag) {
            this.chatflag = chatflag;
        }

        public String getSmallluggageCount() {
            return smallluggageCount;
        }

        public void setSmallluggageCount(String smallluggageCount) {
            this.smallluggageCount = smallluggageCount;
        }

        public String getMediumluggageCount() {
            return mediumluggageCount;
        }

        public void setMediumluggageCount(String mediumluggageCount) {
            this.mediumluggageCount = mediumluggageCount;
        }

        public String getLargeluggageCount() {
            return largeluggageCount;
        }

        public void setLargeluggageCount(String largeluggageCount) {
            this.largeluggageCount = largeluggageCount;
        }

        public String getPassengerCount() {
            return passengerCount;
        }

        public void setPassengerCount(String passengerCount) {
            this.passengerCount = passengerCount;
        }

    }


    public class Resultarray {

        @SerializedName("booking_pickup_location")
        @Expose
        private String bookingPickupLocation;
        @SerializedName("booking_destination_location")
        @Expose
        private String bookingDestinationLocation;
        @SerializedName("incentive")
        @Expose
        private String incentive;
        @SerializedName("schedule_date_time")
        @Expose
        private String scheduleDateTime;
        @SerializedName("booking_request_id")
        @Expose
        private String bookingRequestId;
        @SerializedName("booking_request_status")
        @Expose
        private String bookingRequestStatus;
        @SerializedName("distance")
        @Expose
        private String distance;
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("vehicleType")
        @Expose
        private String vehicleType;
        @SerializedName("booking_type")
        @Expose
        private Object bookingType;
        @SerializedName("booking")
        @Expose
        private Object booking;
        @SerializedName("trip_type")
        @Expose
        private Object tripType;
        @SerializedName("FinalAmount")
        @Expose
        private String finalAmount;
        @SerializedName("Drivername")
        @Expose
        private String drivername;
        @SerializedName("Drivercarno")
        @Expose
        private String drivercarno;
        @SerializedName("driverprof")
        @Expose
        private String driverprof;
        @SerializedName("riderContact")
        @Expose
        private String riderContact;
        @SerializedName("driverContact")
        @Expose
        private String driverContact;
        @SerializedName("drivershakey")
        @Expose
        private String drivershakey;
        @SerializedName("odoreading")
        @Expose
        private Object odoreading;
        @SerializedName("driverId")
        @Expose
        private String driverId;
        @SerializedName("chatflag")
        @Expose
        private String chatflag;
        @SerializedName("smallluggageCount")
        @Expose
        private String smallluggageCount;
        @SerializedName("mediumluggageCount")
        @Expose
        private String mediumluggageCount;
        @SerializedName("largeluggageCount")
        @Expose
        private String largeluggageCount;
        @SerializedName("passengerCount")
        @Expose
        private String passengerCount;

        public String getBookingPickupLocation() {
            return bookingPickupLocation;
        }

        public void setBookingPickupLocation(String bookingPickupLocation) {
            this.bookingPickupLocation = bookingPickupLocation;
        }

        public String getBookingDestinationLocation() {
            return bookingDestinationLocation;
        }

        public void setBookingDestinationLocation(String bookingDestinationLocation) {
            this.bookingDestinationLocation = bookingDestinationLocation;
        }

        public String getIncentive() {
            return incentive;
        }

        public void setIncentive(String incentive) {
            this.incentive = incentive;
        }

        public String getScheduleDateTime() {
            return scheduleDateTime;
        }

        public void setScheduleDateTime(String scheduleDateTime) {
            this.scheduleDateTime = scheduleDateTime;
        }

        public String getBookingRequestId() {
            return bookingRequestId;
        }

        public void setBookingRequestId(String bookingRequestId) {
            this.bookingRequestId = bookingRequestId;
        }

        public String getBookingRequestStatus() {
            return bookingRequestStatus;
        }

        public void setBookingRequestStatus(String bookingRequestStatus) {
            this.bookingRequestStatus = bookingRequestStatus;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public void setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
        }

        public Object getBookingType() {
            return bookingType;
        }

        public void setBookingType(Object bookingType) {
            this.bookingType = bookingType;
        }

        public Object getBooking() {
            return booking;
        }

        public void setBooking(Object booking) {
            this.booking = booking;
        }

        public Object getTripType() {
            return tripType;
        }

        public void setTripType(Object tripType) {
            this.tripType = tripType;
        }

        public String getFinalAmount() {
            return finalAmount;
        }

        public void setFinalAmount(String finalAmount) {
            this.finalAmount = finalAmount;
        }

        public String getDrivername() {
            return drivername;
        }

        public void setDrivername(String drivername) {
            this.drivername = drivername;
        }

        public String getDrivercarno() {
            return drivercarno;
        }

        public void setDrivercarno(String drivercarno) {
            this.drivercarno = drivercarno;
        }

        public String getDriverprof() {
            return driverprof;
        }

        public void setDriverprof(String driverprof) {
            this.driverprof = driverprof;
        }

        public String getRiderContact() {
            return riderContact;
        }

        public void setRiderContact(String riderContact) {
            this.riderContact = riderContact;
        }

        public String getDriverContact() {
            return driverContact;
        }

        public void setDriverContact(String driverContact) {
            this.driverContact = driverContact;
        }

        public String getDrivershakey() {
            return drivershakey;
        }

        public void setDrivershakey(String drivershakey) {
            this.drivershakey = drivershakey;
        }

        public Object getOdoreading() {
            return odoreading;
        }

        public void setOdoreading(Object odoreading) {
            this.odoreading = odoreading;
        }

        public String getDriverId() {
            return driverId;
        }

        public void setDriverId(String driverId) {
            this.driverId = driverId;
        }

        public String getChatflag() {
            return chatflag;
        }

        public void setChatflag(String chatflag) {
            this.chatflag = chatflag;
        }

        public String getSmallluggageCount() {
            return smallluggageCount;
        }

        public void setSmallluggageCount(String smallluggageCount) {
            this.smallluggageCount = smallluggageCount;
        }

        public String getMediumluggageCount() {
            return mediumluggageCount;
        }

        public void setMediumluggageCount(String mediumluggageCount) {
            this.mediumluggageCount = mediumluggageCount;
        }

        public String getLargeluggageCount() {
            return largeluggageCount;
        }

        public void setLargeluggageCount(String largeluggageCount) {
            this.largeluggageCount = largeluggageCount;
        }

        public String getPassengerCount() {
            return passengerCount;
        }

        public void setPassengerCount(String passengerCount) {
            this.passengerCount = passengerCount;
        }

    }
}



