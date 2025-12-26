package com.mycompany.javaproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mac
 */
public class Member {
    private char memberType;
   private int memberID;
   private String name;
   private double fees;

 public  Member( char pMemberType,  int pMemberID ,  String pName,   double pFees){
  
}
   public void setMemberType(char pMemberType)
   {
   memberType = pMemberType;
   }
    public char getMemberType()
   {
   return memberType;
   }
    public void setMemberType( int pMemberID)
   {
   memberID = pMemberID;
   }
     public int getMemberid()
   {
   return memberID;
   }
     public void setName(String pName){
    name = pName;
}
     public String getName(){
         return name;
     }
     public void setFees(double pFees){
         fees = pFees;
     }
   
public double getFees(){
    return fees;
}

 @Override
   public String toString(){
       return memberType + "," + memberID + "," + name + "," + fees;
}

}