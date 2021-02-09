package emp;

public class Permanent extends Employee {
	int pay;
	public Permanent(String id, String name, int pay) {
		super(id, name);
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 급여: " + getPay();  // Sales에서는 info를 호출하진 않았지만 getPay에서 incentive를 더하도록 했기 때문에 그냥 pay로 적어두면 incentive가 적용 안 됨
	}
	
	
}
