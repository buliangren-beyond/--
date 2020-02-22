package 七大规则;
//合成复用原则
public class Hechengfuyong {
    public static void main(String args[]) {
    	System.out.println("房间与房子的关系合成！");
    }
	
}
class Room{
	public Room createRoom() {
		System.out.println("创建房间");
		return new Room();
	}
}
class House{
	private Room room;
	public House() {
		room = new Room();
	}
	public void createHouse() {
		room.createRoom();
	}
}
