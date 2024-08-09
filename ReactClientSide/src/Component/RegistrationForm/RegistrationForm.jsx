import React from 'react'
import styles from './RegistrationForm.module.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faCircleLeft } from '@fortawesome/free-solid-svg-icons'
const RegistrationForm = ({setIsLogin}) => {
  return (
    <div className={styles.register_div}>
        <form action="">
            <input type="text" placeholder='Username' required/>
            <input type="text" placeholder='First Name' required/>
            <input type="text" placeholder='Last Name' required/>
            <input type="email" placeholder='Email' required/>
            <input type="password" placeholder='password' required/>
            <input type="password" placeholder='confirm you password' required/>
            <button type="submit" className={styles.register_btn}>Register</button>
        </form>
        <FontAwesomeIcon icon={faCircleLeft} className={styles.goBack} onClick={()=>{setIsLogin(true)}}/>
    </div>
  )
}

export default RegistrationForm
