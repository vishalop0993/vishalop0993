package main.hotel.models;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Hotel {
    int hotelId;
    String hotelName;
    String preference;
    TreeSet<Room> listRooms;

    public Hotel(int hotelId) {
        this.hotelId = hotelId;
    }

    public Hotel(int hotelId, String hotelName, String preference) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.preference = preference;
        this.listRooms = getAllRooms();
        if(preference.equals("TOP_DOWN"))
        {
            //reverse
        }
        // handle prefrence here
       // Collections.sort(this.listRooms,new SortDesending());
    }

    private TreeSet<Room> getAllRooms() {
        TreeSet<Room> roomSet = new TreeSet<>();
        roomSet.add(new Room(101,"EMPTY"));
        roomSet.add(new Room(102,"EMPTY"));
        roomSet.add(new Room(103,"EMPTY"));
        roomSet.add(new Room(201,"EMPTY"));
        roomSet.add(new Room(202,"EMPTY"));
        roomSet.add(new Room(203,"EMPTY"));
        return roomSet;

    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getPreference() {
        return preference;
    }

    public TreeSet<Room> getListAvailableRooms(int numberOfRooms) throws Exception {
        Set<Room> availableRooms = new TreeSet<>();
        int i = 0;
        for(Room room : this.listRooms)
            if(room.BookingStatus.equals("EMPTY") && i<numberOfRooms)
            {
               // room.setBookingStatus("BOOKED");
                availableRooms.add(room);
                i++;
            }
        if(availableRooms.size()<numberOfRooms)
        {
            throw new Exception("Room Not Available");
        }
        return listRooms;
    }
}

public void checkoutRoom(List<Rooms>)



class  SortDesending implements Comparator<Room> {

    @Override
    public int compare(Room o1, Room o2) {
        return o1.getRoomID()-o2.getRoomID();

    }

    @Override
    public Comparator<Room> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Room> thenComparing(Comparator<? super Room> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Room> thenComparing(Function<? super Room, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Room> thenComparing(Function<? super Room, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Room> thenComparingInt(ToIntFunction<? super Room> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Room> thenComparingLong(ToLongFunction<? super Room> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Room> thenComparingDouble(ToDoubleFunction<? super Room> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}