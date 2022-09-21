package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];
        staffList[0]  = new StaffEmployee("Moaath Alrajab", " 25 New Tree Line", " 516-101-3131", " 000-000-1234", 21900.5);
        staffList[1]  = new StaffEmployee("Moaath Alrajab", " 25 New Tree Line", " 516-101-3131", " 000-000-1234", 21900.5);
        staffList[2]  = new StaffEmployee("Moaath Alrajab", " 25 New Tree Line", " 516-101-3131", " 000-000-1234", 21900.5);
        staffList[2]  = new StaffEmployee("Moaath Alrajab", " 25 New Tree Line", " 516-101-3131", " 000-000-1234", 21900.5);
        staffList[2]  = new StaffEmployee("Moaath Alrajab", " 25 New Tree Line", " 516-101-3131", " 000-000-1234", 21900.5);
        
        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(String.format("Employee - %d", count));
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
