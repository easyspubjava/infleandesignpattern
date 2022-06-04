package template.after;

public abstract class Car {

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public abstract void drive();
	public abstract void stop();
	public void washCar() {};
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();  //hook method
	}
}
