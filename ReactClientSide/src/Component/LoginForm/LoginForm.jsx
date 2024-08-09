import React, { useState } from 'react'
import styles from './LoginForm.module.css'
const LoginForm = ({setIsLogin}) => {
    const [email,setEmail] = useState('')
  return (
    <div className={styles.form_div}>
        <form action="" >
            <h2>Login now</h2>
            <div className={styles.field_row}>
                <input id='email' type="email" value={email} required onChange={(e)=>{setEmail(e.target.value)}}/>
                <label htmlFor='email'>Enter your Email</label>
            </div>
            <div className={styles.field_row}>
                <input id='password' type="password"  required/>
                <label htmlFor='password'>Enter your Password</label>
            </div>
            <div className={styles.register_div}>
                <p>Don't have an account?</p>
                <span onClick={()=>setIsLogin(false)}>Sign up here.</span>
            </div>
            <button type='submit'> LOGIN </button>
        </form>
    </div>
  )
}

export default LoginForm
