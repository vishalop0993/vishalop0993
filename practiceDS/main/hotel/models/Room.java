package main.hotel.models;

public class Room {
 //   int HotelId;
    int roomID;
    String BookingStatus; // [EMPTY, BOOKED]

    public Room( int roomID, String bookingStatus) {
      //  HotelId = hotelId;
        this.roomID = roomID;
        BookingStatus = bookingStatus;
    }

   /* public int getHotelId() {
        return HotelId;
    }*/

    public int getRoomID() {
        return roomID;
    }

    public String getBookingStatus() {
        return BookingStatus;
    }

   /* public void setHotelId(int hotelId) {
        HotelId = hotelId;
    }*/

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setBookingStatus(String bookingStatus) {
        BookingStatus = bookingStatus;
    }
}
