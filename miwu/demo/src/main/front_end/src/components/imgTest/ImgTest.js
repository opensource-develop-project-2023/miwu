import React, { useEffect, useState } from 'react';

const ImgTest = (props) => {
    const url = "https://i.namu.wiki/i/vzQIsovYmymvt84FWS9hhAS3Qva_O31fczg3ErMrSQrSgnJ9h3oQDf3kVo5M6aD1Q05-etvQRlqc3dnurUczXw.webp";
    return (
        <div className="ImgTest"> 
            <img src={`${process.env.PUBLIC_URL}/img/banner.jpg`} alt="불러오기 실패" />
        </div>
    );    
};

export default ImgTest;