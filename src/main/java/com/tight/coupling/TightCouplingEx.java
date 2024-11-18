package com.tight.coupling;

public class TightCouplingEx {
    public static void main(String args[])
    {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }

}
