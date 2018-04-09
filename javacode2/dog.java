package s201708024204;

public class dog extends Animal implements singable {
	private int age;

	public dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public dog(String name, int weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	public dog(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object arg0) {
		dog dd=(dog)arg0;
		if(this.age==dd.age&&super.equals(arg0))
		return true;
		return false;
	}

	@Override
	public void sing() {
		System.out.println("ÍôÍôÍô");
		
	}
	

}
