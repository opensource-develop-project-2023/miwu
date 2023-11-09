import React, { useEffect, useState } from 'react';
import { FaEye, FaEyeSlash } from "react-icons/fa" ;

import "./InfoInput.scss"

const InfoInput = (props) => {    
    const [hidePw, setHidePw] = useState(true); // 비밀번호 숨김 상태
    
    const toggleHidePw = (boolean) => { // 비밀번호 숨김 버튼 토글
        setHidePw(boolean);
    }

    return (
        <div key={props.id} className="info-input">
            {/* 입력해야 되는 종류와, 입력 조건 만족하였는지 안내 */}
            <label>{props.label}{props.notice}</label>
            <div className="input-div">
                {/* 입력받는 곳 */}
                <input      
                    type={props.type} 
                    name={props.name}
                    placeholder={props.placeholder}
                    onChange={props.handler}
                /> 

                {/* 아이디를 입력받는 곳이면, 중복 체크 버튼 생성 */}
                {/* 중복체크 기능 연결 예정 */}
                {
                    (props.name == "user_id") ? (
                        <button id="check-repetition" className="btn btn-primary">중복확인</button> 
                    ) : (<></>)
                }

                {/* 비밀번호를 입력받는 곳이면, 비밀번호 숨김 버튼 생성 */}
                {/* hidePw 상태값에 따라 버튼 모양(눈)이 감겼다 떠짐 */}
                {/* 숨김 기능 연결 예정 */}
                {
                    (props.type == "password") ? (
                        <div className="hide-eye" onClick={() => toggleHidePw(!hidePw)}> 
                            {
                                (hidePw) ? <FaEyeSlash size="24" color="#212121"/> 
                                : <FaEye size="24" color="#212121"/>
                            } 
                        </div>
                        
                    ) : (<></>)
                        
                    
                }
            </div>
            {/* 입력 조건 안내 */}
            <p>{props.condition}</p> 
        </div>
    );
}

export default InfoInput;