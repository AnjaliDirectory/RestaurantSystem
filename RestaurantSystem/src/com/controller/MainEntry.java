package com.controller;

import java.util.Scanner;

import com.dao.RestaurantDao;
import com.model.Restaurant;

public class MainEntry {

	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     
	     do
	     {
	    	 System.out.println("welcome to resturant system");
	    	 System.out.println("1->Search \n 2->Add \n3->Update \n 4->Delete \n 5->Active/Deactive \n6->Exit");
	    	 System.out.println("ENTER UR CHOICE : ");
	    	 int choice=sc.nextInt();
	    	 
	    	 RestaurantDao rDao=new RestaurantDaoImplement();
	    	 
	    	 switch(choice) 
	    	 {
	    	 
	    	 case 1:
	    		      System.out.println("enter Search Restaurant");
	    		      int rid=sc.nextInt();
	    		      Restaurant searchRestaurant = r.
	    		      
	    		      
	    		      
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 }
	    	 
	    	 if(choice==6)
	    		 break;
	    	 
	     }while(true);
	     
	     System.out.println("Thanks!!!!");
	}

}
