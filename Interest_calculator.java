// TDD 1st Ass.

import java.util.Scanner;

class Task
{
    Scanner sc = new Scanner(System.in);
    int loan_amount;
    float rate = 0.0f;    

    int getamount()
    {
        System.out.print("\n\nEnter Your Loan Ammout : ");
        return sc.nextInt();
    }

    int duration()
    {
        System.out.print("Enter Number of Year : ");
        return sc.nextInt();
    }

    float home_loan()
    {
        return rate = 6.99f;
    }

    float personal_loan()
    {
        return rate = 12.0f;     
    }

    float gold_loan()
    {
        return rate = 10.35f;     
    }
}

class Interest_calculator extends Task
{
    public static void main(String args[])
    {
	boolean isCheck = false;
       	int loan_amount = 0, year = 0;
        float percentage = 0;

        Task obj = new Task();

        do{ 
            System.out.println("\n1. Home Loan (6.99%)");
      	    System.out.println("2. Personal Loan (12%)");
      	    System.out.println("3. Gold Loan (10.35%)");
	    System.out.println("4. Exit");
      	    System.out.print("\nEnter Your Choice: ");

            Scanner sc = new Scanner(System.in);
            String choice =  sc.next();

            try 
            { 
                int b = Integer.parseInt(choice); 
                switch(b) {

                    case 1 :
                            System.out.println("------------------------------------");
                            System.out.print("You Are Choosing Home Loan"); 
			    percentage = obj.home_loan();
                            loan_amount= obj.getamount();
                            year = obj.duration();
                            break;

                    case 2 :
                            System.out.println("------------------------------------");
		            System.out.print("You Are Choosing Personal Loan");
			    percentage = obj.personal_loan();
                            loan_amount = obj.getamount();
                            year = obj.duration();
                            break;

		    case 3 :
                            System.out.println("------------------------------------");
                            System.out.print("You Are Choosing Gold Loan");
			    percentage = obj.gold_loan();
                            loan_amount = obj.getamount();
                            year = obj.duration();
                            break;

                    case 4 : 
                            System.out.println("\n\n******* Thank you for visit ! *********");
                            isCheck = false;
                            break;

                    default :
                            System.out.println("Please select valid option ");
                            isCheck = true;
                }
            }  
            catch(NumberFormatException e)  
            { 
                System.out.println("Please enter valid option");
                isCheck = true;
               
            } 

        }while(isCheck);

    float si = (loan_amount * percentage * year)/100;
    System.out.println("\nSimple Interest : " + si);
    System.out.println("------------------------------------");
    System.out.println("\n");
    }
}
