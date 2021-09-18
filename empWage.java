package empWage;

public class empWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
int empCheck = (int) (Math.floor(Math.random()*10)%2);;
// int rand_int2 = rand.nextInt(1000);

 // Print random integers
 System.out.println("Random Integers: "+empCheck);
 //System.out.println("Random Integers: "+rand_int2);

 if(empCheck==1)
 {
	   System.out.println("employee present");
	   
 }
 else
 {
	   System.out.println("employee absent");
 }
 
	}

}
