package day05;

public class Array2 {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5, 6};
		//배열대입
		arr1[1] = 20;
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		//2차원 배열	
		int arr2[][]= {{1,2},{3,4},{5,6},{7,8},{9,10}};
		
		
		//2차원 배열 대입
		arr2[3][1]=80;
		
		System.out.println(arr2[3][0]);
		System.out.println(arr2[3][1]);
	
		//2차원배열 - 이중반복문 사용
	for(int i=0; i<4; i++) {
		for(int j=0; j<2; j++) {
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}
}
