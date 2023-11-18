import React, { useState, useEffect } from 'react';
import axios from 'axios';


const Gyeonggires = () => {
  const [restaurants, setRestaurants] = useState([]);
  const [visibleRestaurants, setVisibleRestaurants] = useState(10);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get('/api/restaurant/경기도');
      setRestaurants(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  const loadMore = () => {
    setVisibleRestaurants((prevVisible) => prevVisible + 10);
  };

  const restaurantData = restaurants.slice(0, visibleRestaurants).map((restaurant, index) => (
    <div key={index} className="card">
      <div className="restaurant-card-content">
        <div className="restaurant-image-container">
          <img src={restaurant.r_imgUrl} alt={restaurant.r_name} />
        </div>
        <div className="restaurant-details">
          <p className="name">Name: {restaurant.r_name}</p>
          <p className="address">Address: {restaurant.r_adress}</p>
          <p className="category">Category: {restaurant.r_category}</p>
        </div>
      </div>
      <hr />
    </div>
  ));

  return (
    <div className="restaurant-list-container">
      <div className="restaurant-list">
        {restaurantData}
        <div className="load-more-container">
          {restaurants.length > visibleRestaurants && (
            <button className="load-more-button" onClick={loadMore}>
              더보기
            </button>
          )}
        </div>
      </div>
    </div>
  );
};

export default Gyeonggires;
