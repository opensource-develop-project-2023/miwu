import React, { useEffect, useState } from 'react';
import { Map } from 'react-kakao-maps-sdk';

const Kakaomap = () => {

    const [position, setPosition] = useState([]);
    const [isLoading, setIsLoading] = useState(true);
    useEffect(() => {
        fetch("/position")
            .then((res) => {
                return res.json();
            })
            .then((coordinate) => {
                setIsLoading(false);
                setPosition(coordinate);
            });
    }, [])
    
    return (
        <>
        {!isLoading ? (
            <Map 
            center={{ lat: position[0], lng: position[1] }}   // 지도의 중심 좌표
            style={{ width: '800px', height: '600px' }} // 지도 크기
            level={3}                                   // 지도 확대 레벨
        />
        ) : (<p>로딩중</p>)
        }
        </>
    );
    
}
export default Kakaomap;