
public class Array2Example {

	public static void main(String[] args) {
		int[][] array2 = new int[2][3];
		System.out.println(array2.length);  // array2 = new int[][] {array2[0], array2[1]}
		System.out.println(array2[0].length);  // array2[0] = new int[3]; array2[0]에는 참조값이 저장됨
		System.out.println(array2[1].length);  // array2[1] = new int[3];
		
		int[][] varray = new int[2][];  // 가변배열, 각 행의 갯수를 가변적으로 설정 가능
		varray[0] = new int[2];
		varray[1] = new int[3];
		
		int[][] iarray = {{1,2},{3,4,5}};
		int sum = 0;
		for (int i=0; i<iarray.length; i++) {
			for (int j=0; j<iarray[i].length; j++) {
				sum += iarray[i][j];
			}
		}
		System.out.println(sum);

	}

}
