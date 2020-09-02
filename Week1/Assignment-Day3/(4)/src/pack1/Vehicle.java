package pack1;

public abstract class Vehicle implements Automobile {
	protected int regNo;
	protected String model;
	protected int currSpeed;
	
	public Vehicle(int regNo, String model, int currSpeed) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.currSpeed = currSpeed;
	}

	@Override
	public String start() {
		
		return("Vehicle started");
	}

	@Override
	public abstract int increaseSpeed(int n); 

	@Override
	public abstract String applyBreak();

	@Override
	public String stop() {
		return("Vehicle stopped");

		
	}
	
	
	
	
	
	

}
