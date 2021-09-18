package empWage;
import java.util.*;
public class empWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHr;
		int empWage = 0;
		int totalEmpWage=0 ;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
{
	  totalWorkingDays++;
int empCheck = (int) (Math.floor(Math.random()*10)%3);;
// int rand_int2 = rand.nextInt(1000);

 // Print random integers
 System.out.println("Random Integers: "+empCheck);
 //System.out.println("Random Integers: "+rand_int2);

 switch (empCheck) {
 case 1:   empHr=8;
          System.out.print("full time");
          break;
 case 2:  empHr=4;
          System.out.print("part time");
          break;
 case 0:  empHr=0;
          System.out.println("absent");
          break;
 
 default:empHr=0;
          break;
}
 
 empWage=empHr*EMP_RATE_PER_HOUR;
  totalEmpWage=totalEmpWage+empWage;
 System.out.println("days"+totalWorkingDays+"emphrs"+empHr);
 System.out.println("wage"+totalEmpWage);
	}
 
System.out.println("total wage"+totalEmpWage);
	}
}
