package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee

public class Intern extends StaffEmployee
{
    
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    
    public Intern(String eName, String eAddress, String ePhone, String socialSecurityNumber, double pay)
    {
        super(eName, eAddress, ePhone, socialSecurityNumber, pay);
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    @Override
    public double pay()
    {
        double internPay = 0;
      return internPay;
    }
}
