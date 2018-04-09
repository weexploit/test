package s201708024204;

public class Animal implements singable {
	private String name;
	private int weight;
	private String color;
	public Animal() {
		super();
	}
	public Animal(String name, int weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Name:" + name + "\nWeight:" + weight + "\nColor:" + color ;
	}
	@Override
	public boolean equals(Object arg0) {
		Animal aa=(Animal)arg0;
		if(this.color.equals(aa.color)
				&&this.name.equals(aa.name)
				&&this.weight==aa.weight)
		return true;
		return false;
	}
	@Override
	public void sing() {
		System.out.println("³ª¸èÁË");
		
	}
	void feed(Animal aa1){
		aa1.setWeight(aa1.getWeight()+1);
		aa1.sing();
	}
	
}

