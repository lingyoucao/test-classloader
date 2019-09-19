package com.lcs.lean.classloader.proxy.model;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class House {
    /**
     * 房子位置
     */
    private String address;
    /**
     * 房间号
     */
    private String roomNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
