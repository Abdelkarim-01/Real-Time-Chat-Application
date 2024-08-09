import React from 'react'
import styles from './MessagesRoom.module.css'
import {messages} from '../../data'
import Message from '../Message/Message'
const MessagesRoom = () => {
  return (
    <div className={styles.MessagesRoom}>
      {
        messages.map((message)=> <Message key={message.id} {...message}/>)
      }
    </div>
  )
}

export default MessagesRoom
