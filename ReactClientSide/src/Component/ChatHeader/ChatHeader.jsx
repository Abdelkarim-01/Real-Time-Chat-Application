import { faMagnifyingGlass } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import React from 'react'
import styles from './ChatHeader.module.css'
const ChatHeader = () => {
  return (
    <div className={styles.chat_header}>
        <div className={styles.left_side}>
            <img src={'https://www.pngplay.com/wp-content/uploads/12/User-Avatar-Profile-PNG-Photos.png'} alt="" />
            <div className={styles.user_info}>
                <p className={styles.user_name}>Abdelkarim Idrissi</p>
                <p className={styles.status}><span className={styles.status}> </span> Online</p>
            </div>
        </div>
      <label htmlFor="search" className={styles.input_search}>
        <FontAwesomeIcon icon={faMagnifyingGlass} className={styles.search_icon} />
        <input type="text" name="" id="search" ></input>
      </label>
    </div>
  )
}

export default ChatHeader
