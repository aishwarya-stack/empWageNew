package empWage;

public class empWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME=2;
		int IS_PART_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
int empCheck = (int) (Math.floor(Math.random()*10)%2);;
// int rand_int2 = rand.nextInt(1000);

 // Print random integers
 System.out.println("Random Integers: "+empCheck);
 //System.out.println("Random Integers: "+rand_int2);

 if(empCheck==IS_PART_TIME)
 {
     empHrs=4;	  
	   
 }
 else if(empCheck==IS_FULL_TIME)
 {
	  empHrs=8;
 }
 else 
 {
      empHrs=0;	  
	   System.out.println("employee absent");
 }
 empWage=empHrs*EMP_RATE_PER_HOUR;
System.out.println("emp wage"+empWage);
	
	}

}
