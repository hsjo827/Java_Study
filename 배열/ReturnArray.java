// 정수 4개를 가지는 일차원 배열을 생성하고 1,2,3,4로 초기화한 다음, 배열을 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램 작성

public class ReturnArray {
	
	static int[] makeArray() { //정수형 배열을 리턴하는 메서드
		int temp[] = new int[4]; //배열 생성
		for (int i=0; i<temp.length;i++) {
			temp[i] = i; //배열의 원소를 0,1,2,3으로 초기화
		}
		return temp; //배열 리턴
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}	
	}

}
