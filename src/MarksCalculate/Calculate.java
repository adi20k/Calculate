package MarksCalculate;

abstract class Marks{
	double percentage;
	double getPercentage(){
		return percentage;
	}
}
class A extends Marks{
	double subjectScore[]=new double[3];
	A (double a,double b ,double c) {
		this.subjectScore[0]=a;
		this.subjectScore[1]=b;
		this.subjectScore[2]=c;
	}
	double getPercentage(){
			percentage=(subjectScore[0]+subjectScore[1]+subjectScore[2])/300* 100;
		return percentage;
	}
}
class B extends Marks{
	double subjectScore[]=new double[4];
	B (double a,double b ,double c,double d) {
		this.subjectScore[0]=a;
		this.subjectScore[1]=b;
		this.subjectScore[2]=c;
		this.subjectScore[3]=d;
	}
	double getPercentage(){
			percentage=(subjectScore[0]+subjectScore[1]+subjectScore[2]+subjectScore[3])/300* 100;
		return percentage;
	}
}
public class Calculate {
	 public static void main(String[] args) {
	        A ob = new A(70, 80, 75);
	        System.out.printf("Student A Percentage: %.2f",ob.getPercentage());	                

	        B obj = new B(70, 75, 80, 70);
	        System.out.printf("\nStudent B Percentager:  %.2f",obj.getPercentage());       

	    }   
	
}
