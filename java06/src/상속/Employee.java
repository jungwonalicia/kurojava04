package 상속;

public class Employee {
	String name; //이름
	String address; //주소
	int salary; //월급
	int rrn; //주민번호
	
	//멤버 변수 초기화(생성자)
	public Employee(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	//출력편하게 (toString())
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
//	}
	
	
	
}
