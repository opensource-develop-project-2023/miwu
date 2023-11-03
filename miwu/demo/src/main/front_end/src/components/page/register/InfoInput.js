import React, { useEffect, useState } from 'react';

const InfoInput = (props) => {
    return (
        <div>
            <label>{props.label}</label>
            <input      
                type={props.type} 
                name={props.name}
                placeholder={props.placeholder}
            />
        </div>
    );
}

export default InfoInput;