
public class Circle2 {

	int radius; 
	String name; 
	
	public Circle2() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle2 pizza;
		pizza = new Circle2();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle2 donut = new Circle2();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea(); //이미 변수가 정의되어 double 작성할 필요 X
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
