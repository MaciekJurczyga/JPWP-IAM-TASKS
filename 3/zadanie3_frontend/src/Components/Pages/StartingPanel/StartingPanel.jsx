import React, { useState } from 'react';
import { login } from './../../Fun/Login/Login'; //
import { register } from './../../Fun/Register/Register';
import './StartingPanel.css';
import user_icon from './../../Assets/person.png';
import email_icon from './../../Assets/email.png';
import password_icon from './../../Assets/password.png';

const LoginSignup = () => {
    const [action, setAction] = useState("Login");
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const handleFormSubmit = () => {
        const userData = { name, email, password };

        const authFunction = action === 'Login' ? login : register;

        authFunction(userData)
            .then(data => {

            })
            .catch(error => {

            });
    };

    return (
        <div className='container' style={{ backgroundColor: '#f0f0f0', padding: '20px', borderRadius: '10px' }}>
            <div className="header">
                <div className="text">{action}</div>
                <div className="underline"></div>
            </div>
            <div className="inputs">
                {action === "Login" ? null : (
                    <div className="input">
                        <img src={user_icon} alt="" />
                        <input type="text" placeholder="Name" value={name} onChange={(e) => setName(e.target.value)} />
                    </div>
                )}

                <div className="input">
                    <img src={email_icon} alt="" />
                    <input type="email" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div className="input">
                    <img src={password_icon} alt="" />
                    <input type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
            </div>

            {action === "Sign Up" ? null : (
                <div className="forgot-password">Lost Password?
                    <span> Click Here!</span>
                </div>
            )}

            <div className="submit-container">
                <div className={action === "Login" ? "submit gray" : "submit"} onClick={() => setAction("Sign Up")}>Sign Up</div>
                <div className={action === "Sign Up" ? "submit gray" : "submit"} onClick={() => setAction("Login")}>Login</div>
            </div>

            {action === "Sign Up" || action === "Login" ? (
                <div className="submit-container">
                    <div className="submit" onClick={handleFormSubmit}>Submit</div>
                </div>
            ) : null}
        </div>
    );
};

export default LoginSignup;
