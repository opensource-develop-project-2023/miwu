import React from 'react';
import Privacy from './privacy/privacy/Privacy';

const MyPage = ({id, logout}) => {
    return (
        <div id="my-page">
            <Privacy id={id}/>
        </div>
    );
}
export default MyPage;