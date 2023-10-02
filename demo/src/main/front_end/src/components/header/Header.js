import React from 'react';
import { FaSearch} from "react-icons/fa";


function Header() {
    return (
       
        <div className="header">
            <div className="header__left">
             
            <h1 id="logo">미우</h1>
           
           </div>
           <div className="header__center">
                
           <br></br>
           <br></br>
                    <div className="menu-item  menu-item--activ">홈</div>
                    <div className="menu-item  menu-item--activ">테마</div>
                    <div className="menu-item  menu-item--activ">지역</div>
                    </div>
                    <div className="header__input">
                  
                    
                    <input className='input_text' type="text" placeholder="어디로, 어떤 여행을 떠날 예정인가요?"/>
               
                    
                    </div>
      
                </div>
            
               
               
        

    );
    
};

export default Header;