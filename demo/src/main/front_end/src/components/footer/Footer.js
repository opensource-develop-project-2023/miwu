import React from 'react';

export function Footer() {

    return (
       
        <div className="footer">
            <div className="footer__left">
             
            <p className="footer__input" >© 오픈소스 개발프로젝트 1조 </p>
            <hr className='footer_hr' />
            <p className="footer__input" >프론트앤드</p>
            <p className="footer__input_1" >UX/UI 디자인,react:소프트웨어학부 2020039044 김창현</p>
            <p className="footer__input_1" >react:지구환경과학과 2020021007 구경선</p>
                       
           </div>
           <div className="footer__left">
            <br></br>
           <p className="footer__input" >백앤드</p>
           <p className="footer__input_1" >DB, OpenAI:소프트웨어학부 2020039044 전종영  </p>
           <p className="footer__input_1" >DB, csv 분석/분리:소프트웨어학부 2020039044 윤별  </p>
           </div>
                    
                    <div className="header__right">
                       
                    <p className="footer__input" >https://github.com/opensource-develop-project-2023/miwu </p>
                    </div>
                
                </div>
            
               

    );
    
};
export default Footer;