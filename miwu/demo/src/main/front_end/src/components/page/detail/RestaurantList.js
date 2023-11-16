import React, { useState, useEffect } from 'react';
import axios from 'axios';

const RestaurantList = () => {
  const [restaurants, setRestaurants] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get('api/restaurant');
      setRestaurants(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  return (
    <div>
      {restaurants.map((restaurant, index) => (
        <div key={index}>
          <p>Name: {restaurant.name}</p>
          <p>Address: {restaurant.adress_last}</p>
          <p>Category: {restaurant.category}</p>
          <p>Image URL: {restaurant.imgUrl}</p>
          <hr />
        </div>
      ))}
    </div>
  );
};

export default RestaurantList;