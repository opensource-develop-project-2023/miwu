import React, { component,useState, memo } from 'react';
import { useNavigate, Link } from 'react-router-dom'

import "./Login.scss";
const Login = ({login}) => {
    const [Id, setId] = useState("");
    const [Pw, setPw] = useState("");
    const realId = "user";
    const realPw = "12345678";
    
    const navigate = useNavigate();


    const onIdHandler = (event) => {
        setId(event.currentTarget.value);
    }

    const onPwHandler = (event) => {
        setPw(event.currentTarget.value);
    }

    function onSubmitHandler(event) {
        event.preventDefault();
        if (Id == realId && Pw == realPw) {
            console.log(Id);
            navigate("/");
            login(Id);
        } else {
            alert("로그인 실패");
        }
    }
    
    return (
        <form id="login" onSubmit={onSubmitHandler}>
            <div>
                <label>아이디</label>
                <input 
                    type="text" 
                    name="id" 
                    value={Id}
                    placeholder="아이디" 
                    onChange={onIdHandler}
                />
                </div>
            <div>
                <label>비밀번호</label>
                <input 
                    type="password" 
                    name="pw" 
                    value={Pw}
                    placeholder="비밀번호" 
                    onChange={onPwHandler}
                />
            </div>
            <button type="submit">로그인</button>
            <div>
                <p>비밀번호를 잊어버리셨나요?</p>
                <Link to="/register">
                    <p>회원가입</p>
                </Link>
            </div>
        </form>
    );
    
}
export default Login;