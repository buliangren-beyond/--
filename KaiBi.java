package �ߴ����;
//����ԭ��
public class KaiBi {
    public static void main(String args[]) {
    	CircleButton circle = new CircleButton();
    	RectangleButton rectangle = new RectangleButton();
    	display(circle);
    	display(rectangle);
    }
    public static void display(AbstractButton ab) {
    	ab.button();
    }
}
abstract class AbstractButton{
	public void button() {
	}
}
class CircleButton extends AbstractButton{
	@Override
	public void button() {
		super.button();
		System.out.println("����Բ��ť��");
	}
}
class RectangleButton extends AbstractButton{
	@Override
	public void button() {
		super.button();
		System.out.println("���Ƿ���ť��");
	}
}