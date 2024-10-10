package programs;
import java.util.Scanner;

class matrixmultiplication{
	int mat1[][];
	int mat2[][];
	int res[][];
	int size;
	Scanner sc = new Scanner(System.in);
	public void creatematrix() {
		System.out.println("creating the matrices ");
		System.out.println("enter the size of matrix");
		size=sc.nextInt();
		mat1=new int[size][size];
		System.out.println("matrix-1 is craeted");
		mat2=new int[size][size];
		System.out.println("matrix-2 is created");
		System.out.println("=====================");
		}
	public void collectingdatafor_mat1() {
		System.out.println("collecting data ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("the data is collected for matrix1");
		System.out.println("============================");
	}
	public void collectingdatafor_mat2() {
		System.out.println("collecting data ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("the data is collected for matrix2");
		System.out.println("============================");
	}
	public void multiply() {
		res= new int[size][size];
		System.out.println("resultant matrix is collecting data");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				for(int k=0;k<size;k++) {
					res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
				}
			}
			System.out.println();
			System.out.println("=============");
		}
	}
	void display() {
		System.out.println("printing the resultant");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class matrixOps {
	public static void main(String[] args) {
		matrixmultiplication mo = new matrixmultiplication();
		mo.creatematrix();
		mo.collectingdatafor_mat1();
		mo.collectingdatafor_mat2();
		mo.multiply();
		mo.display();
	}

}
