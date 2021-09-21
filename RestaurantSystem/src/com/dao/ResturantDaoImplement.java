package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.configuration.DBConnect;
import com.model.Restaurant;

public class ResturantDaoImplement implements RestaurantDao{

	@Override
	public Restaurant searchRestaurant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRestaurant(Restaurant r) {
	  try(Connection con=DBConnect.getConnection();
			  PreparedStatement pst=con.prepareStatement("insert into restaurant values(?,?,?,?,?,?,?)"))
	  {
		  pst.setInt(1,r.getRid());
		  pst.setString(2,r.getResName());
		  pst.setString(3,r.getOpeningTime());
		  pst.setString(4, r.getClosingTime());
		  pst.setString(5, r.getPhoneNo());
		  pst.setString(6, r.getAddress_of_res());
		  pst.setString(7, r.getCuisine());
		  
		  pst.executeUpdate();
		  return true;
		  
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean Update(Restaurant r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Active_Deactive(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
