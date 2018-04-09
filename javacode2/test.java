package s201708024204;

public class test {
	public static void main(String[] args) {
		Animal aa = new Animal();
		fish f1=new fish("jake",5,"blue",true);
		fish f2=new fish("jake",5,"blue",true);
		System.out.println(f1.equals(f2));
		System.out.println(f1==f2);
		f1.feed(f1);
		System.out.println(f1.getWeight());
		Cat aa1=new Cat("tom",3,"blue");
		aa1.setType("coffe");
		System.out.println(aa1);
		aa1.sing();
		aa1.feed(aa1);
		System.out.println(aa1.getWeight());
	}

}

