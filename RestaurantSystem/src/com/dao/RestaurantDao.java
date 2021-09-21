package com.dao;

import com.model.Restaurant;

public interface RestaurantDao {
	
    public Restaurant searchRestaurant(int id);
    public boolean addRestaurant(Restaurant r);
    public boolean Update(Restaurant r);
    public boolean Delete(int id);
    public boolean Active_Deactive(int id);
    
	

}
