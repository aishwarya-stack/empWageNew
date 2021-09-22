package empWage;

import java.util.*;

class Employee 
{
	// declaration of variables
	int empCheck, empHr, empWage, totalEmpWage, totalWorkingDays, totalEmpHrs;
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	int NUM_OF_WORKING_DAYS;
	int MAX_HRS_IN_MONTH;

 	     int numOfDays(int numOfWorkingDays)
	    {
		NUM_OF_WORKING_DAYS = numOfWorkingDays;

		return NUM_OF_WORKING_DAYS;
       	}

	    int workingHrs(int maxHrInMonth)
	   {

		MAX_HRS_IN_MONTH = maxHrInMonth;

		return MAX_HRS_IN_MONTH;
	   }

	     int CalculateWage()
    	{
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
	    	{
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("" + empCheck);

			totalWorkingDays++;

			switch (empCheck) {
			case 1:
				empHr = 8;
				System.out.print("full time");
				break;
			case 2:
				empHr = 4;
				System.out.print("part time");
				break;
			case 0:
				empHr = 0;
				System.out.println("absent");
				break;

			default:
				empHr = 0;
				break;
			}
			empWage = empHr * EMP_RATE_PER_HOUR;
			totalEmpWage = totalEmpWage + empWage;
			System.out.println("days" + totalWorkingDays + "emphrs" + empHr);
			System.out.println("wage" + totalEmpWage);
		   }
		    return totalEmpWage;
	    }
}

public class Object 
{
	public static void main(String args[]) 
	{
		Employee company = new Employee();
		// int Check= (int) (Math.floor(Math.random()*10)%3);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Days:");
		int Days = sc.nextInt();
		System.out.println("enter Hrs:");
		int Hrs = sc.nextInt();
		company.numOfDays(Days);
		company.workingHrs(Hrs);
		company.CalculateWage();

	}

}
