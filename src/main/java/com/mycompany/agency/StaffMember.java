package com.mycompany.agency;



// TODO 1: Make this class work and public
public class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    // TODO 2: Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    @Override
    public String toString()
    {
        String sOutput = "";
        sOutput += String.format("Name: %s", name) + "/n";
        sOutput += String.format("Address: %s", address) + "/n";
        sOutput += String.format("Phone: %s", phone) + "/n";
        return sOutput;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public double pay(){
        return 0;
    }
    
}
