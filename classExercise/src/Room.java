
public class Room {

	private String Gusts[];
	private int maxGusts;
	private int gustsInRoom;
	private String name;
	private double pricePerNight;

	public Room(int maxGusts, String name, double pricePerNight) {
		this.maxGusts = maxGusts;
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.gustsInRoom = gustsInRoom;

	}

	public Room ( Room room) {
		this (room.guest)
	}

	private boolean isFull() {
		if (room == isFull.room) {
			return true;

		} else {
			return false;

		}

	}

}
