package �ߴ����;
//��һְ��ԭ��
public class Danyizhize {
	public static void main(String args[]) {
    DogCry dog = new DogCry();
    CatCry cat = new CatCry();
    dog.cry("��");
    cat.cry("è");
	}
}
class DogCry{
	public void cry(String name) {
		System.out.println(name+"�����ؽУ�");
	}
}
class CatCry{
	public void cry(String name) {
		System.out.println(name+"�����ؽУ�");
	}
}