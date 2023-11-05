import React, { useEffect, useState } from 'react';
import './scss/App.scss';
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import { Map } from 'react-kakao-maps-sdk';

import Header from './components/header/Header';
import Footer from './components/footer/Footer';

import Home from './components/page/Home';
import Login from './components/page/login/Login';
import Register from './components/page/register/Register';
import MyPage from './components/page/myPage/MyPage';
import Local from './components/page/Local';
import Theme from './components/page/Theme';

function App() {
    const [LoggedIn, setLoggedIn] = useState(false);
    const [UserId, setUserId] = useState("");
    
    const login = (id) => { 
        setLoggedIn(true);
        setUserId(id);
    }
    
    const logout = () => {
        setLoggedIn(false);
        setUserId("");
    }

    const [I, setI] = useState(0);
    function plus() {
        setI(I + 1);
    }

    return ( 
        <div className="App">
            <BrowserRouter>
                <Header loggedIn={LoggedIn} id={UserId} />
                <Routes>
                    <Route path="/" element={<Home />} />  
                    <Route path= "/login" element={<Login login={login} /> } />
                    <Route path="/register" element={<Register />} />
                    <Route path="/mypage/*" element={<MyPage id={UserId} logout={logout}/> } />
                    <Route path="/theme" element={<Theme />} />
                    <Route path="/local" element={<Local />} />
                    <Route path="*" element={<Navigate replace to="/" />} /> 
                </Routes>
                <Map 
                    center={{ lat: 33.5563, lng: 126.79581 }}   // 지도의 중심 좌표
                    style={{ width: '800px', height: '600px' }} // 지도 크기
                    level={3}                                   // 지도 확대 레벨
                >
                </Map>
            </BrowserRouter>
            <Footer />
        </div>
    );
}

export default App;