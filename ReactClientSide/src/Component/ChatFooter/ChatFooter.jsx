import React from 'react'
import styles from './ChatFooter.module.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faPaperPlane } from '@fortawesome/free-solid-svg-icons'
const ChatFooter = () => {
  return (
    <div className={styles.ChatFooter}>
      <label htmlFor='message_input' className={styles.message_input}>
        <input type="text" id='message_input' placeholder='Message now'/>
      </label>
      <button className={styles.send_message}>
      <FontAwesomeIcon icon={faPaperPlane} />
      </button>
    </div>
  )
}

export default ChatFooter
