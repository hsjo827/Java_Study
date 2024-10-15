
public class Circle4 {
	
	int radius;
	public Circle4(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}
	
	
	public static void main(String[] args) {
		Circle4 ob1 = new Circle4(1);
		Circle4 ob2 = new Circle4(2);
		Circle4 ob3 = new Circle4(3);
		
		ob1.set(4);
		ob1.set(5);
		ob1.set(6);
		
	}

}
