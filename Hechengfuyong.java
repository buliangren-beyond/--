package �ߴ����;
//�ϳɸ���ԭ��
public class Hechengfuyong {
    public static void main(String args[]) {
    	System.out.println("�����뷿�ӵĹ�ϵ�ϳɣ�");
    }
	
}
class Room{
	public Room createRoom() {
		System.out.println("��������");
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
