package emp;

public class PartTime extends Employee implements BusinessTrip {
	int time;
	int payPerTime;
	
	public PartTime (String id, String name, int time, int payPerTime) {
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}
	
	public int getPay() {
		return time*payPerTime;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 급여: " + getPay();
	}

	@Override
	public void goBusinessTrip(int day) {
		time += day*24;		
	}
	
	
	
}
