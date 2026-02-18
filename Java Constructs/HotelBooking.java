public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.display();
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);
        b2.display();
        HotelBooking b3 = new HotelBooking(b2);
        b3.display();
    }
}
