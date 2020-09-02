package pack1;

public class Car extends Vehicle{
	private int maxSpeed;
	private String type;	
	
	public Car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	@Override
	public int increaseSpeed(int n) {
		if (currSpeed+n < maxSpeed) {
			currSpeed=currSpeed+n;
			return (currSpeed);

		}
		else
			return -1;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public String applyBreak() {
		// TODO Auto-generated method stu
		if(currSpeed-5>0) {
			currSpeed=currSpeed-5;
		}
		else {
			currSpeed=0;
		}
		
		return "Breaks Applied successfully!!";
	}

	
}
