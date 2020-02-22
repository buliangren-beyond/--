package 七大规则;
//依赖倒转原则
public class Yilaidaozhuan {
	public static void main(String args[]) {
		IdCar luhu = new Luhu();
		IdCar benchi = new Benchi();
		IdCar baoma = new Baoma();
		
		IdDriver driver = new Driver();
		driver.drive(luhu);
		driver.drive(benchi);
		driver.drive(baoma);
		
		IdDriver newdriver = new NewDriver();
		newdriver.drive(baoma);
		newdriver.drive(luhu);
		newdriver.drive(benchi);
	}
}
interface IdDriver{
	public void drive(IdCar car);
}
class Driver implements IdDriver{
	public void drive(IdCar car) {
		System.out.print("老司机要开车了！");
		car.run();
	}
}
class NewDriver implements IdDriver{
	public void drive(IdCar car) {
		System.out.print("新司机开车了！");
		car.run();
	}
}
interface IdCar{
	public void run();
}
class Luhu implements IdCar{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("路虎开始发动了!");
	}
}
class Benchi implements IdCar{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("奔驰开始发动了!");
	}
	
}
class Baoma implements IdCar{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("宝马开始发动了!");
	}
	
}