import React from 'react';
import ImgTest from '../imgTest/ImgTest';
import SpotList2 from '../spotList/SpotList2';
import Arealist from '../page/arealist';
import RestaurantList from './detail/RestaurantList';

const Home = () => {
    return (
        <div>
            <ImgTest />
            <Arealist />
            <RestaurantList />
        </div>
    );
}

export default Home;