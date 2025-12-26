package com.mycompany.javaproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mac
 */
public class SingleClubMember extends Member {
    private int club;

    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees,int pclub) {
        super(pMemberType, pMemberID, pName, pFees);
        club = pclub;
      
     
}
 
    
    public void setClub(int pClub){
        club = pClub;
        
    }
    
    public int getClub(){
    
        return club;
    
}
       
     @Override
   public String toString(){
        return super.toString() + "," + club;
}

}

