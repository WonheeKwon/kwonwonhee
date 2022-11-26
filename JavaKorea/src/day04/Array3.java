package day04;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String [4];					//-> 네칸 공간 만들어줌
		int no[] = {1,2,3,4}; 		//-> 그 네칸에 값 넣음
	
		name[0]="김가빈";
		name[1]="김김김";
		name[2]="이이이";
		name[3]="박박박";
		
		System.out.println("=====출석부=====");	
		for(int i=0; i<name.length;i++) {
			System.out.println(no[i]+"번-"+name[i]);
		}
	
	
	
	}
}
