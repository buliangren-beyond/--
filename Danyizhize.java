package 七大规则;
//单一职责原则
public class Danyizhize {
	public static void main(String args[]) {
    DogCry dog = new DogCry();
    CatCry cat = new CatCry();
    dog.cry("狗");
    cat.cry("猫");
	}
}
class DogCry{
	public void cry(String name) {
		System.out.println(name+"汪汪地叫！");
	}
}
class CatCry{
	public void cry(String name) {
		System.out.println(name+"喵喵地叫！");
	}
}