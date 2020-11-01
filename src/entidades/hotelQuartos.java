package entidades;

public class hotelQuartos {
	public int room;
	public String name;
	public String email;
	public int roomNumber;
	
	public hotelQuartos(int room, String name, String email, int roomNumber) {
		this.room = room;
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public hotelQuartos(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public hotelQuartos(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String toString() {
		return roomNumber+ ": " +name+ ", " +email;
	}
	
}
