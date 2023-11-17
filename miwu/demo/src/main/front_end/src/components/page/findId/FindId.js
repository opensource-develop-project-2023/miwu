import React, { useState } from 'react';
import "./FindId.scss";

import axios from 'axios';

const FindId = () => {
    const [name, setName] = useState("");
    const [userName, setUserName] = useState("");
    const [nameValidity, setNameValidity] = useState(false);
    const [id, setId] = useState("");

    const updateName = (event) => {
        setName(event.currentTarget.value);
        setNameValidity(checkNameValidity(name));
    } // 이름 값이 변경되면, 상태값도 업데이트함
    
    const checkNameValidity = (name) => { // 이름 유효성 검사
        return /[가-힣]{2,4}$/.test(name); 
    }

    const onSubmit = (event) => { // 회원가입 버튼 눌렀을 때 실행되는 함수
        event.preventDefault();
        
        axios.post('/api/find_id', 
            {
                name: name
            },
            {
                headers: {
                    "Content-Type": "application/json"
                }
            }
        )
        .then((response) => {
            setUserName(name);
            setId(response.data);
        })
        .catch((error) => { // 실패했을 경우 에러 출력
            setUserName(name); // 테스트 코드입니다. 백엔드 기능 구현되면 제거하겠습니다. 
            setId("root"); // 테스트 코드입니다.
            console.log(error);
        })
    }

    return (
        <div id="find-id">
            <h1>아이디 찾기</h1>
            <div className="input-div">
                <label>이름</label>
                <input 
                    type="text" 
                    name="name" 
                    value={name}
                    placeholder="사용자님의 이름을 입력해주세요" 
                    onChange={updateName}
                />
            </div>
            {
                (id === "") ? 
                <></> : 
                <div id="id-info">
                    <p>가입된 아이디가 있습니다</p>
                    <div>
                        <p>이름</p>
                        <p>{userName}</p>
                    </div>
                    <div>
                        <p>계정</p>
                        <p>{id}</p>
                    </div>
                </div>
            }
            <button onClick={onSubmit} className="btn btn-outline-primary">아이디 찾기</button>
        </div>
    );
}
export default FindId;