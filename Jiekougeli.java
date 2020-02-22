package 七大规则;
//接口隔离原则
public class Jiekougeli {
    public static void main(String args[]) {
    	AbstractServiceA a = new ClientA();
    	AbstractServiceB b = new ClientB();
    	AbstractServiceC c = new ClientC();
    	a.operateA();
    	b.operateB();
    	c.operateC();
    }
}
interface AbstractServiceA{
	public void operateA();
}
interface AbstractServiceB{
	public void operateB();
}
interface AbstractServiceC{
	public void operateC();
}
class ClientA implements AbstractServiceA{
	@Override
	public void operateA() {
		// TODO Auto-generated method stub
	}
}
class ClientB implements AbstractServiceB{
	@Override
	public void operateB() {
		// TODO Auto-generated method stub
	}
}
class ClientC implements AbstractServiceC{
	@Override
	public void operateC() {
		// TODO Auto-generated method stub
	}
}