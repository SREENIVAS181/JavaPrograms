package programs;

import java.util.Scanner;

class  identitymatrix{
	int mat1[][];
	int size;
	Scanner sc = new Scanner(System.in);
	public void creatematrix() {
		System.out.println("creating the matrices ");
		System.out.println("enter the size of matrix");
		size=sc.nextInt();
		mat1=new int[size][size];
		System.out.println("matrix-1 is craeted");
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
	public void check_for_identity_matrix() {
		System.out.println("checking if the given matrix is identity matrix or not");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j) {
					if(mat1[i][j]!=1) {
						System.out.println("the given matrix is not an identity matrix");
					System.exit(0);
					}
				}
				else {
					if(mat1[i][j]!=0) {
						System.out.println("the given matrix is not an identity matrix");
						System.exit(0);
					}
				}
					
			}
		}
		System.out.println("the given matrix is identity matrix");
		System.exit(0);
	}
	
}

public class identity_matrix {
	public static void main(String[] args) {
		identitymatrix mo =new identitymatrix();
		mo.creatematrix();
		mo.collectingdatafor_mat1();
		mo.check_for_identity_matrix();
		}
}
