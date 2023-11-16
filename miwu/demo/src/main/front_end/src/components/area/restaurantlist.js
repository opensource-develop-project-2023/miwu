import React, { useState, useEffect } from 'react';
import axios from 'axios';

const RestaurantList = () => {
  const [restaurants, setRestaurants] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    console.log("hello");
    try {
      const response = await axios.get('/api/restaurant/서울특별시');
      console.log(response);
      setRestaurants(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  const restaurantData = restaurants.map((restaurant, index) => (
    <div key={index}>
      <p>Name: {restaurant.r_name}</p>
      <p>Address: {restaurant.r_adress}</p>
      <p>Category: {restaurant.r_category}</p>
      <p>Image URL: {restaurant.r_imgUrl}</p>
      <hr />
    </div>
  ))

  return (
    <div className="restaurant">
      {restaurantData}
    </div>
  );
};

export default RestaurantList; 
