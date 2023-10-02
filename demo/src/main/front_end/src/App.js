import React from 'react';
import './scss/App.scss';
import Header from './components/header/Header';
import SpotList from './components/spotList/SpotList';
import Footer from './components/footer/Footer';
import Banner from './banner.jpg'
import Tour from './tour_1.png'
import { FaSearch,FaHeart,FaShareAlt,FaBookmark} from "react-icons/fa" ;






function App() {
    return ( 
        <div className="App">
            {/*Header */}
            <Header />

            {/* APP Body */}
            <div className="app__body">
            <div className="main-bg" style={{backgroundImage: 'url('+ Banner +')'}}>
          
            <div class="content">
            <p className='content_span_1'>가득 내려앉은 함박눈이 아름다운 </p>
            <p className='content_span_2'>설산 힐링 여행</p>
            <button className='my_btn'> 자세히 보기 &gt; </button>

          </div>
          </div>
        <div className="info-list">
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">자연관광</p>
            </div>
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">역사관광</p>
            </div>
          
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">체험관광</p>
            </div>
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">문화관광</p>
            </div>
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">레저스포츠</p>
            </div>
            <div className="info-menu">
            <div className="info-icon" style={{backgroundImage: 'url('+ Tour +')'}}></div>
            <p className="info-text">쇼핑</p>
            </div>
    
            </div>
            <div className="info-btn">
            <button className='info-button'> 더보기</button>
            </div>
            
          
              
            <div className="info-btn">
            <div className="search__input">
            <FaSearch  size="20" color="#FFFFFF"/> 
                  <input type="text" placeholder="야경이 아름다운 도시"/>
                  <div className='icon_list'>
                  <FaHeart size="20" color="#FFFFFF"/> 
                  <FaShareAlt size="20" color="#FFFFFF" /> 
                  <FaBookmark size="20" color="#FFFFFF" /> 
                  </div>
                
                  </div>
                  
                  </div>
            
        
           
       
      
   
           

           

        
            
        </div> 
        <Footer /> 
        </div>
       
       
    );
}

export default App;