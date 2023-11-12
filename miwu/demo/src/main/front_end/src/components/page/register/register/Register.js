import React, { useEffect, useState } from 'react';
import axios from 'axios';

import InfoInput from '../infoInput/InfoInput';
import "./Register.scss";

const Register = () => {
    class Info {
        constructor(id, label, type, name, placeholder, handler, condition, notice) {
            this.id = id; // 아이디
            this.label = label; // 라벨링
            this.type = type; // 입력 유형(ex. text, password, email)
            this.name = name; // 태그 이름
            this.placeholder = placeholder; // input box 안 설명
            this.handler = handler;
            this.condition = condition; // 아이디 조건 안내
            this.notice = notice // 조건 부합하는지
        }
    }

    const [id, setId] = useState("");
    const [pw, setPw] = useState("");
    const [name, setName] = useState("");
    
    const updateId = (event) => {
        setId(event.currentTarget.value);
    } // 아이디 값이 변경되면, 상태값도 업데이트함

    const updatePw = (event) => {
        setPw(event.currentTarget.value);
    } // 비밀번호 값이 변경되면, 상태값도 업데이트함

    const updateName = (event) => {
        setName(event.currentTarget.value);
    } // 이름 값이 변경되면, 상태값도 업데이트함

    const infoData = [
        new Info(
            0,
            "아이디", 
            "text", 
            "user_id", 
            "예: miwu0928",
            updateId,
            "소문자, 대문자, 숫자로 10자 이하",
            ""
        ),
        new Info(
            1,
            "비밀번호", 
            "password", 
            "password", 
            "비밀번호를 입력해주세요",
            updatePw,
            "소문자, 대문자, 숫자, 특수문자로 6자 이상 20자 이하",
            ""
        ),
        new Info(
            2,
            "이름", 
            "text", 
            "name", 
            "사용자님의 이름을 입력해주세요",
            updateName,
            "",
            ""
        ),
    ];

    const infoList = infoData.map((info) => (
        <InfoInput 
            key={info.id} 
            label={info.label} 
            type={info.type} 
            name={info.name} 
            placeholder={info.placeholder}
            handler={info.handler}
            condition={info.condition}
            notice={info.notice}
        />
    ));
    
    const onSubmit = (event) => { // 회원가입 버튼 눌렀을 때 실행되는 함수
        event.preventDefault();
        
        // /api/register = http://localhost:8080/register
        // json 파일 형식으로 송신
        axios.post('/api/register', 
            {
                user_id: id,
                password: pw,
                name: name,
            },
            {
                headers: {
                    "Content-Type": "application/json"
                }
            }
        )
        .then((response) => {
            console.log(response);  
        })
        .catch((error) => { // 실패했을 경우 에러 출력
            console.log(error);
        })
    }

    return (
        <div id="register">
            <h1>회원가입</h1>
            {infoList}
            <button onClick={onSubmit} id="signup" className="btn btn-primary">회원가입</button>
        </div>
    );
}

export default Register;