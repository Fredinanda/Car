

public class Car {
	String name;
	int speed;
	static int numberOfCars;

	
	public Car(){
		name = "MyCar";
		speed = 0;
		numberOfCars++;
	}
	public Car(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public void setSpeed(int speed){
		
		this.speed = speed;
	}
	public String getName()
	{
		return name;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public void printCarInfo(){
		System.out.println("�� ��� ���� �̸��� : "+name);
		System.out.println("�� ���� �ְ� �ӵ��� : "+speed);
	}
	

}
