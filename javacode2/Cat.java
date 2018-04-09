package s201708024204;

public class Cat extends Animal implements singable{
	private String type;
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return super.toString()+"\nType:"+type;
	}


	@Override
	public boolean equals(Object arg0) {
		Cat cc=(Cat)arg0;
		if(this.type.equals(cc.type)&&super.equals(arg0))
		return true;
		return false;
	}


	@Override
	public void sing() {
		System.out.println("ίχίχίχ");
		
	}
	
	
}
