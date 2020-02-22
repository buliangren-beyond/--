package �ߴ����;
//������תԭ��
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
		System.out.print("��˾��Ҫ�����ˣ�");
		car.run();
	}
}
class NewDriver implements IdDriver{
	public void drive(IdCar car) {
		System.out.print("��˾�������ˣ�");
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
		System.out.println("·����ʼ������!");
	}
}
class Benchi implements IdCar{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���ۿ�ʼ������!");
	}
	
}
class Baoma implements IdCar{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����ʼ������!");
	}
	
}