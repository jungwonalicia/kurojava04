package 상속;

public class Manager extends Employee{
	int bonus;
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	public void test() {
		System.out.println("관리감독하다.");
	}
	
	//출력 편하게. toString()
	@Override //재정의
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}
	
}
