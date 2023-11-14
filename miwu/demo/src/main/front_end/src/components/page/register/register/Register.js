import React, { useEffect, useState } from 'react';
import axios from 'axios';

import InfoInput from '../infoInput/InfoInput';
import HintSelect from '../hintSelect/HintSelect';

import "./Register.scss";

const Register = () => {
    class Info {
        constructor(id, label, name, placeholder, handler, condition, validity) {
            this.id = id; // 아이디
            this.label = label; // 라벨링
            this.name = name; // 태그 이름
            this.placeholder = placeholder; // input box 안 설명
            this.handler = handler;
            this.condition = condition; // 아이디 조건 안내
            this.validity = validity;
        }
    }
    class Query {
        constructor(id, q) {
            this.id = id; // 아이디
            this.q = q;
        }
    }

    const [id, setId] = useState("");
    const [pw, setPw] = useState("");
    const [name, setName] = useState("");
    const [queryId, setQueryId] = useState(1);
    const [answer, setAnswer] = useState("");

    const [idValidity, setIdValidity] = useState(false);
    const [pwValidity, setPwValidity] = useState(false);
    const [nameValidity, setNameValidity] = useState(false);
    const [answerValidity, setAnswerValidity] = useState(false);

    const updateId = (event) => {    
        setId(event.currentTarget.value);
        setIdValidity(checkIdValidity(id));
        // console.log("updateId: " + idValidity);
    } // 아이디 값이 변경되면, 상태값도 업데이트함

    const updatePw = (event) => {
        setPw(event.currentTarget.value);
        setPwValidity(checkPwValidity(pw));
        // console.log("updatePw: " + pwValidity);
    } // 비밀번호 값이 변경되면, 상태값도 업데이트함

    const updateName = (event) => {
        setName(event.currentTarget.value);
        setNameValidity(checkNameValidity(name));
    } // 이름 값이 변경되면, 상태값도 업데이트함
    
    const updateQueryId = (event) => {
        setQueryId(event.currentTarget.value);
    } // 힌트 질문 선택값이 변경되면, 상태값도 업데이트함

    const updateAnswer = (event) => {
        setAnswer(event.currentTarget.value);
        setAnswerValidity(checkAnswerValidity(answer));
    } // 힌트 대답 값이 변경되면, 상태값도 업데이트함

    const checkIdValidity = (id) => { // 아이디 유효성 검사
        return /[a-zA-Z0-9]{6,10}$/.test(id);
    }

    const checkPwValidity = (pw) => { // 비밀번호 유효성 검사
        return /[a-zA-Z0-9`~!@#$%^&*()-_=+]{6,20}$/.test(pw);
    }

    const checkNameValidity = (name) => { // 이름 유효성 검사
        return /[가-힣]{2,4}$/.test(name); 
    }

    const checkAnswerValidity = (answer) => { // 힌트 유효성 검사
        return /[가-힣0-9]+/.test(answer);
    }

    const infoData = [
        new Info(
            1, // 고유 id
            "아이디", // 라벨링
            "user_id", // 태그 이름
            "예: miwu0928", // input box 안 설명
            updateId,
            "소문자, 대문자, 숫자로 6자 이상 10자 이하", // 조건 안내
            idValidity
        ),
        new Info(
            2,
            "비밀번호", 
            "password", 
            "비밀번호를 입력해주세요",
            updatePw,
            "소문자, 대문자, 숫자, 특수문자로 6자 이상 20자 이하",
            pwValidity,
        ),
        new Info(
            3,
            "이름", 
            "name", 
            "사용자님의 이름을 입력해주세요",
            updateName,
            "",
            nameValidity
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
            validity={info.validity}
        />
    ));
    
    const queryData = [
        new Query(1, "내가 좋아하는 여행지는?"),
        new Query(2, "내 고향은?"),
        new Query(3, "테스트 질문"),
    ];

    const queryList = queryData.map((query) => (
        <option key={query.id} value={query.id}>
            {query.q}
        </option>
    ));
    
    const onSubmit = (event) => { // 회원가입 버튼 눌렀을 때 실행되는 함수
        event.preventDefault();
        
        // /api/register = http://localhost:8080/register
        // json 파일 형식으로 송신
        console.log("updateQueryId: " + queryId);
        axios.post('/api/register', 
            {
                user_id: id,
                password: pw,
                name: name,
                query_id: queryId,
                answer: answer,
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
            <HintSelect 
                options={queryList} 
                queryId={queryId}
                queryIdHandler={updateQueryId}
                answerHandler={updateAnswer} 
                validity={answerValidity} 
            />
            {
                (idValidity && pwValidity && nameValidity && answerValidity) ?
                <button onClick={onSubmit} id="signup" className="btn btn-primary">회원가입</button> :
                <button className="btn btn-secondary" disabled>회원가입</button> 
            }
        </div>
    );
}

export default Register;