package 七大规则;
//开闭原则
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
		System.out.println("这是圆按钮！");
	}
}
class RectangleButton extends AbstractButton{
	@Override
	public void button() {
		super.button();
		System.out.println("这是方按钮！");
	}
}