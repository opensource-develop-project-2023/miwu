import React, { useEffect, useState } from 'react';
import InfoInput from './InfoInput';

const Register = () => {
    class Info {
        constructor(label, type, name, placeholder) {
            this.label = label;
            this.type = type;
            this.name = name;
            this.placeholder = placeholder;
        }
    }
    const infoData = [
        new Info(
            "아이디", 
            "text", 
            "user_id", 
            "예: miwu0928"
        ),
        new Info(
            "비밀번호", 
            "password", 
            "password", 
            "비밀번호를 입력해주세요"
        ),
        new Info(
            "비밀번호를 한번 더 입력해주세요", 
            "password", 
            "check_password", 
            "비밀번호를 한번 더 입력해주세요"
        ),
        new Info(
            "이름", 
            "text", 
            "name", 
            "사용자님의 이름을 입력해주세요"
        ),
        new Info(
            "이메일",
            "email",
            "email",
            "예: miwu0928@cbnu.ac.kr"
        ),
        new Info(
            "휴대폰",
            "tel",
            "tel",
            "예: 010-1234-5678"
        ),
    ];
    const infoList = infoData.map((info) => (
        <InfoInput 
            label={info.label} 
            type={info.type} 
            name={info.name} 
            placeholder={info.placeholder}
        />
    ));

    return (
        <div id="register">
            <h1>회원가입</h1>
            {infoList}
        </div>
    );
}

export default Register;