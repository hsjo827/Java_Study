// 메서드에 배열 인수 전달

public class PassArray {

	public static void main(String[] args) {
	
		int [] array = {1,2,3,4,5} ;
		
		System.out.printf(
				"Effects of passing reference to entire array:%n" +
				"The values of the original array are:%n");
		
		for (int value : array) {
			System.out.printf("   %d", value);	
		}
		
		modifyArray(array); //pass array reference
		System.out.printf("%n%nThe values of the modified array are:%n");
		
		for (int value : array) {
			System.out.printf("   %d", value);	
		}
		
		System.out.printf(
				"%n%nEffects of passing array element value:%n" +
				"array[3] before modifyElement: %d%n", array[3]);
		
		modifyElement(array[3]);
		System.out.printf(
				"array[3] after modifyElement: %d%n", array[3]);
		
	}

	 // 배열 전체를 전달하면 배열의 참조(주소)가 전달되기 때문에, 메서드에서 배열을 수정하면 원래 배열도 같이 바뀜
	public static void modifyArray(int[] array2) {
		
		for (int counter=0; counter < array2.length; counter++) {
			array2[counter] *=2;
		}
	}
	
	// 배열의 개별 요소를 전달하면 그 요소 값의 복사본만 전달. 따라서 메서드가 그 값을 수정하더라도 원래 배열에는 영향을 미치지 X
	public static void modifyElement(int element) {
		
		element *=2;
		System.out.printf(
			"Value of element in modifyElement: %d%n", element);
	}
	
}
