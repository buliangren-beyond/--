package 七大规则;
//里氏代换原则
public class Lishidaihuan {
    public static void main(String args[]) {
    	Rectangle r = new Rectangle();
    	r.setLength(8);
    	r.setWidth(6);
    	display(r);
    	Square s = new Square();
    	s.setSizeLength(5);
    	display(s);
    }
	public static void display(Sibianxing sbx) {
		System.out.println(sbx.getLength());
		System.out.println(sbx.getWidth());
	}
}
interface Sibianxing{ //四边形
	public long getLength();
	public long getWidth();
}
class Rectangle implements Sibianxing{ //长方形
    private long length;
    private long width;
    
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getWidth() {
		return width;
	}
	public void setWidth(long width) {
		this.width = width;
	}
}
class Square implements Sibianxing{//正方形
    private long sizeLength;

	@Override
	public long getLength() {
		// TODO Auto-generated method stub
		return this.getSizeLength();
	}

	@Override
	public long getWidth() {
		// TODO Auto-generated method stub
		return this.getSizeLength();
	}
	
	public void setLength(long length) {
		this.setSizeLength(length);
	}
	
	public void setWidth(long width) {
		this.setSizeLength(width);
	}

	public long getSizeLength() {
		return sizeLength;
	}

	public void setSizeLength(long sizeLength) {
		this.sizeLength = sizeLength;
	}
    
}