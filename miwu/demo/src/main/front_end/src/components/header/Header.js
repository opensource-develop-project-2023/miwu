import React from 'react';
import { Link } from 'react-router-dom'
import {GoSearch} from "react-icons/go";
import { FaUser } from "react-icons/fa";

function Header({loggedIn, id}) {
    return (
        <div className="header"> 
            <div className="logo">
                <Link to="/">
                    <h1 id="logo">미우</h1>    
                </Link>
            </div>
            <div className="top-navigation">
                <div className="nav-item">
                    <Link to="/">
                    <p>홈</p>
                    </Link>
                </div>
                <div className="nav-item">
                    <Link to="/theme">
                        <p>테마</p>
                    </Link>
                </div>
                <div className="nav-item">
                    <Link to="local">
                        <p>지역</p>
                    </Link>
                </div>
            </div>
            <div className="search-bar">
                <div className="divider">
                   
                    <Link to={loggedIn ? "/myPage" : "/login"}>
               
                <p>{loggedIn ? id : "로그인"}</p>
            </Link>
                
                </div>
            </div>
           
        </div>
    );
};

export default Header;