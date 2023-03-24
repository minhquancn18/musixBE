package com.example.musixBE.models.status;

public class StatusList {
    public static final StatusData successService = new StatusData(200, "Success");
    public static final StatusData errorService = new StatusData(500, "Error while save data");
    public static final StatusData errorUsernameExisted = new StatusData(452, "Username is existed");
    public static final StatusData errorUsernameNotFound = new StatusData(453, "Username Not Found");
    public static final StatusData errorPasswordNotCorrect = new StatusData(454, "Password Not Correct");
    public static final StatusData errorTokenNotFound = new StatusData(455, "Token Not Found");
    public static final StatusData errorTokenNotValid = new StatusData(456, "Token Not Valid");
    public static final StatusData errorUserIdNotFound = new StatusData(457, "User Id Not Found");
    public static final StatusData errorEmailNotFound = new StatusData(458, "No User Found For This Email Address");
    public static final StatusData errorTokenDoesNotMatch = new StatusData(459, "Token does not match with the email");
}
