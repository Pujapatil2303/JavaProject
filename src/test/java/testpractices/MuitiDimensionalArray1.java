package testpractices;

public class MuitiDimensionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,30,60},{40,60,80}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
	}
	}
}
