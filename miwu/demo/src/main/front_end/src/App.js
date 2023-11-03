import React, { useEffect, useState } from 'react';
import './scss/App.scss';
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom'
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
            </BrowserRouter>
            <Footer />
        </div>
    );
}

export default App;