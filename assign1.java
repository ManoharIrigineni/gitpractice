class assign1{
    public static void main(String[] args){
        String EmployeeName = "Ravi",EmployeeRole = "JavaDeveloper",EmployeeDept = "IT",Gender = "Male";
        String EmployeeID = "12A",EmailID = "ravi@gmail.com",MobileNumber="9392566148";
       int Employee_salary_Day = 500 ;
        /*byte workingDays= 24;
        byte Days_present= 20;
        byte Days_abs= workingDays - Days_present;
        short Employee_salary=(short)Employee_salary_Day * (short)Days_present;

        */
        /*int workingDays= 24,Days_present=20;s
        int Days_abs= workingDays-Days_present;
        int Employee_salary=Employee_salary_Day * Days_present;*/


        /* int n1=20,n2=40;
        int mul=n1*n2;
        System.out.println(n1+"X"+n2+"="+mul); */
          /* 
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
 String EmployeeName = "Ravi",EmployeeRole = "JavaDeveloper",EmployeeDept = "IT",Gender = "Male";
        String EmployeeID = "12A",EmailID = "ravi@gmail.com",MobileNumber="9392566148";
       int Employee_salary_Day = 500 ;
    byte workingDays=(byte) 24;
        byte Days_present=(byte)20;
        byte Days_abs= (byte)(workingDays - Days_present);
short Employee_salary=(short)(Employee_salary_Day *Days_present);
System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee Role: " + EmployeeRole);
        System.out.println("Employee Dept: " + EmployeeDept);
        System.out.println("Gender: " + Gender);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Email ID: " + EmailID);
        System.out.println("Days Present: " + Days_present);
                System.out.println("Employee_salary: " + Employee_salary);
        System.out.println("MobileNumber: " + MobileNumber);
    }
}*/
        
      
      
        /*
        //area and perimeter of rectange

       int length= 4,breadth=8;
       int Area= length*breadth;
       int perimeter=2*(length+breadth);
       System.out.println("Area of Rectangle is:"+Area + "  Perimeter of Rectangle is :"+perimeter);

        //hours to mins and mins to secs


       int time_in_hours= 5;
       int time_in_mins= time_in_hours*60;
       int time_in_seconds=time_in_mins*60;
       System.out.println("Time in Minutes: "+time_in_mins + "  Time in seconds: "+time_in_seconds);

    // DOllars to rupees and rupees to dollars
       int Money_in_Dollars= 50;
       int Money_in_Rupees = Money_in_Dollars*80;
       int money_rupees = 250;
       int money_dollars= 250/80;
       System.out.println(Money_in_Rupees+" "+money_dollars); */

/*       //student marks application

       String Name= "Suresh";
       int Tel_marks= 80, Hin_Marks=90, Mat_Marks=85,Soc_marks=79,Science_marks= 99,Englsih_marks=90;
       int total_marks= Tel_marks+Hin_Marks+Mat_Marks+Soc_marks+Science_marks+Englsih_marks;

       double Percentage_scored = (total_marks)*100/600;
       System.out.println(Percentage_scored); */


       /*
       //hike calculator

       int salary_per_day= 1000;
       int noof_working_days= 280; //in a year
       int hike_increase= 8; //percentage per year
       int total_salary = salary_per_day*noof_working_days;
       double  hike_amount= hike_increase*total_salary/100;
       double Total_salary = total_salary+hike_amount;
       System.out.println("total_Salary_without_hike is:"+total_salary+" hike amount: "+hike_amount);
       System.out.println("Total_Salary_with_Hike is :"+ Total_salary);
        */
        int x= 10, y=20;
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println(x+" "+y);




    }
}