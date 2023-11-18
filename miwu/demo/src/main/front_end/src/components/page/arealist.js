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
           <Link to="/gyeonggi-do">
    <img src={process.env.PUBLIC_URL + '/img/gyeonggi-do.jpg'} />
           <span>경기</span>
           </Link>
           </div>
           
           <div className='capital-area'>
           <Link to="/incheon">
           <img src={process.env.PUBLIC_URL + '/img/incheon.jpg'} />
           <span>인천</span>
           </Link>
           </div>
  
          </div>
          

           <div className='area-list'>
        <p>#충청권</p>
       </div>
       <div className="slider">
    
    <div className='chungcheong'>
    <Link to="/daejon">
    <img src={process.env.PUBLIC_URL + '/img/daejon.jpg'} />
           <span>대전</span>
           </Link>
    </div>
    <div className='chungcheong'>
    <Link to="/chungnam">
    <img src={process.env.PUBLIC_URL + '/img/chungnam.jpg'} />
           <span>충남</span>
           </Link>
    </div>
    <div className='chungcheong'>
     <Link to="/chungbuk">
    <img src={process.env.PUBLIC_URL + '/img/chungbuk.jpg'} />
           <span>충북</span>
           </Link>
    </div>
  
    <div className='chungcheong'>
    <Link to="/sejong">
           <img src={process.env.PUBLIC_URL + '/img/sejong.jpg'} />
           <span>세종</span>
           </Link>
           </div>
          </div>
        
          <div className='area-list'>
        <p>#경상권</p>
       </div>
       <div className="slider">
    
    <div className='gyeongsang'>
    <Link to="/busan">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>부산</span>
           </Link>
    </div>

    
    <div className='gyeongsang'>
    <Link to="/ulsan">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>울산</span>
           </Link>
           </div>
           
           <div className='gyeongsang '>
           <Link to="/daegu">
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>대구</span>
           </Link>
           </div>
        
           <div className='gyeongsang '>
           <Link to="/gyeongnam">
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>경남</span>
           </Link>
           </div>

           <div className='gyeongsang'>
           <Link to="/gyeongbuk">
           <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>경북</span>
           </Link>
           </div>
          
          </div>
          <div className='area-list'>
        <p>#호남권</p>
       </div>
       <div className="slider">
    
    <div className='honam'>
    <Link to="/gwangju">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>광주</span>
           </Link>
    </div>
    <div className='honam'>
    <Link to="/jeonnam">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>전남</span>
           </Link>
    </div>
    <div className='honam'>
    <Link to="/jeonbuk">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>전북</span>
           </Link>
    </div>
    </div>

    <div className='area-list'>
        <p>#강원권</p>
       </div>
       <div className="slider">
    
    <div className='gangwon'>
    <Link to="/gangwon">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>강원</span>
           </Link>
    </div>
    </div>
    <div className='area-list'>
        <p>#제주</p>
       </div>
       <div className="slider">
    
    <div className='jeju'>
    <Link to="/jeju">
    <img src={process.env.PUBLIC_URL + '/img/seoul2.jpg'} />
           <span>제주</span>
           </Link>
    </div>
    </div>
           </div>
         
            
    );
}

export default arealist;




