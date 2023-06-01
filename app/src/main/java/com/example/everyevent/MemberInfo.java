package com.example.everyevent;


import android.os.Parcel;
import android.os.Parcelable;

public class MemberInfo implements Parcelable {
    private String phoneNumber;
    private String birthDay;
    private String address;
    private String username;
    private String password;
    private String role;

    public MemberInfo(String phoneNumber, String birthDay, String address, String username, String password, String role) {
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    protected MemberInfo(Parcel in) {
        phoneNumber = in.readString();
        birthDay = in.readString();
        address = in.readString();
        username = in.readString();
        password = in.readString();
        role = in.readString();
    }

    public static final Creator<MemberInfo> CREATOR = new Creator<MemberInfo>() {
        @Override
        public MemberInfo createFromParcel(Parcel in) {
            return new MemberInfo(in);
        }

        @Override
        public MemberInfo[] newArray(int size) {
            return new MemberInfo[size];
        }
    };

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAdmin() {
        return "admin".equals(role);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(phoneNumber);
        dest.writeString(birthDay);
        dest.writeString(address);
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(role);
    }
}
