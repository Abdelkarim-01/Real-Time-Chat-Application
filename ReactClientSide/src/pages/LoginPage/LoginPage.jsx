import React, { useState } from 'react'
import styles from './LoginPage.module.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faComments } from '@fortawesome/free-solid-svg-icons'
import LoginForm from '../../Component/LoginForm/LoginForm'
import RegistrationForm from '../../Component/RegistrationForm/RegistrationForm'

const LoginPage = () => {
  const [isLogin,setIsLogin] = useState(true)
  return (
    <div className={styles.main_container}>
      <div className={styles.leftSide}></div>
      <div className={styles.main_login}>
        <div  className={styles.leftLogo}>
            <FontAwesomeIcon icon={faComments} className={styles.logo}/>
            <h3>Whisper</h3>
            <p>Stay in Touch, Simply</p>
        </div>
        {
          isLogin? <LoginForm setIsLogin={setIsLogin} /> : <RegistrationForm setIsLogin={setIsLogin}/>
        }
      </div>
    </div>
  )
}

export default LoginPage
