package com.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("ErrorCode")
    @Expose
    private String errorCode;
    @SerializedName("result")
    @Expose
    private Result result;
    @SerializedName("resultarray")
    @Expose
    private Object resultarray;

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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Object getResultarray() {
        return resultarray;
    }

    public void setResultarray(Object resultarray) {
        this.resultarray = resultarray;
    }

    public class Result {

        @SerializedName("userid")
        @Expose
        private String userid;
        @SerializedName("userContact")
        @Expose
        private String userContact;
        @SerializedName("userEmail")
        @Expose
        private String userEmail;
        @SerializedName("userName")
        @Expose
        private String userName;
        @SerializedName("user_uniqueId")
        @Expose
        private String userUniqueId;
        @SerializedName("term_condition")
        @Expose
        private String termCondition;
        @SerializedName("access_token")
        @Expose
        private String accessToken;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUserContact() {
            return userContact;
        }

        public void setUserContact(String userContact) {
            this.userContact = userContact;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserUniqueId() {
            return userUniqueId;
        }

        public void setUserUniqueId(String userUniqueId) {
            this.userUniqueId = userUniqueId;
        }

        public String getTermCondition() {
            return termCondition;
        }

        public void setTermCondition(String termCondition) {
            this.termCondition = termCondition;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

    }
}




