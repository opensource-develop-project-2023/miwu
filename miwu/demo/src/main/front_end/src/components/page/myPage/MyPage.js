import React from 'react';
import { BrowserRouter, Routes, Route, useNavigate, Link } from 'react-router-dom'
import History from './History';
import Bookmark from './Bookmark';
import Privacy from './Privacy';
const MyPage = ({id, logout}) => {
    const navigate = useNavigate();
    
    function onClickHandler(event) {
        navigate("/");
        logout();
    }
    
    class Menu {
        constructor(name, link, tag) {
            this.name = name;
            this.link = link;
            this.tag = tag;
        }
    }
    
    const menuData = [
        new Menu("최근 본 여행지/맛집", "./history", {History}),
        new Menu("좋아요 한 여행지/맛집", "./bookmark", {Bookmark}),
        new Menu("개인정보 변경", "./privacy", {Privacy}),  
    ];

    const menuList = menuData.map((menu) => (
        <Link to={menu.link}>
            <p>{menu.name}</p>
        </Link>
    ));
    return (
        <div id="my-page">
            {menuList}
            <Routes>    
                <Route path="/history" element={<History />} />  
                <Route path= "/bookmark" element={<Bookmark /> } />
                <Route path="/privacy" element={<Privacy />} />
            </Routes>
            <button onClick={onClickHandler}>로그아웃</button>
        </div>
    );
}
export default MyPage;