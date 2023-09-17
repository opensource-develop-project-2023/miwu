import React from 'react';
import './scss/App.scss';

import Header from './components/header/Header';
import SpotList from './components/spotList/SpotList';

function App() {
    return ( 
        <div>
            <Header />
            <SpotList themeName="억새가 유혹하는 가을 여행지" />
            <SpotList themeName="청주" />
            <SpotList themeName="서울" />
            <SpotList themeName="강릉" />
            <SpotList themeName="부산" />
        </div> 
    );
}

export default App;