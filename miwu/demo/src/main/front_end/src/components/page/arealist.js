import React from 'react';
import { Link } from 'react-router-dom';



const arealist = () => {
    return (
        <div className="spotlist">
           
           <div className="area-header"> 
           <p>어디로 여행을 떠나고 싶으신가요?</p>
           </div>
          

       <div className='area-list'>
        <p>#수도권</p>
       </div>
          <div className="slider">
    
  
        <div className='capital-area'>
        <Link to="/seoul">
            <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>서울</span>
           </Link>
           </div>
    

           <div className='capital-area'>
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>경기</span>
           </div>
           
           <div className='capital-area'>
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>인천</span>
           </div>
  
          </div>
          

           <div className='area-list'>
        <p>#충청권</p>
       </div>
       <div className="slider">
    
    <div className='chungcheong'>
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>대전</span>
    </div>

    
    <div className='chungcheong'>
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>세종</span>
           </div>
           
           
        
  
          </div>
          
    
        
          <div className='area-list'>
        <p>#경상권</p>
       </div>
       <div className="slider">
    
    <div className='gyeongsang '>
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>부산</span>
    </div>

    
    <div className='gyeongsang'>
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>울산</span>
           </div>
           
           <div className='gyeongsang '>
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>대구</span>
           </div>
        
          </div>
          <div className='area-list'>
        <p>#호남권</p>
       </div>
       <div className="slider">
    
    <div className='honam'>
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>광주</span>
    </div>
    </div>
           </div>
         
            
    );
}

export default arealist;




