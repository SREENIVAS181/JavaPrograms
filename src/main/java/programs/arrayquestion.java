package programs;
import java.util.Scanner;
class program1{
	int arr[];
	int size;
	int sum;
	Scanner sc = new  Scanner(System.in);
	void creatingarray() {
		System.out.println("enter the size of array");
		size=sc.nextInt();
		arr =new int [size];
		System.out.println("array is created");
	}
	void addingdata() {
		for(int i=0;i<size;i++) {
			System.out.println("enter the cost of the item");
		    arr[i]=sc.nextInt();
		}
		System.out.println("the data is stored");
		}
	void calculating_data() {
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
			}
		System.out.println("data is calculated");
		System.out.println("the total expenses are : "+sum);
		}
	void displaymessage() {
		System.out.println("enter the number of members");
		int a = sc.nextInt();
		System.out.println("enter the amount per person ");
		int b = sc.nextInt();
		int total=a*b;
		if(total>sum)
			System.out.println("expenses are undershoot");
		else 
			System.out.println("expenses are overshoot");
	}
	     
	}


public class arrayquestion {
	public static void main(String[] args) {
		program1 a1= new program1();
		a1.creatingarray();
		a1.addingdata();
		a1.calculating_data();
		a1.displaymessage();
	}
	

}

