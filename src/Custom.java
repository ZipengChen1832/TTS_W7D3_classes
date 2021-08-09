public class Custom {
    private int room;
    private int bathroom;
    private int floor;

    public Custom() {

    }

    public Custom(int room, int bathroom) {
        this.room = room;
        this.bathroom = bathroom;
    }

    public Custom(int room,int bathroom, int floor) {
        this.room = room;
        this.bathroom = bathroom;
        this.floor = floor;
    }

    public int getRoom() {
        return this.room;
    }

    public int getBathroom() {
        return this.bathroom;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setRoom(int room) { this.room = room; }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isSingleFloor(){
        return this.floor == 1;
    }

    public String buyHouse(String action){
        return action;
    }
}
