import React from 'react'
import styles from'./MainChat.module.css'
import ChatHeader from '../ChatHeader/ChatHeader'
import ChatFooter from '../ChatFooter/ChatFooter'
import MessagesRoom from '../MessagesRoom/MessagesRoom'
const MainChat = () => {
  return (
    <div className={styles.Main_Chat}>
      <ChatHeader />
      <MessagesRoom />
      <ChatFooter />
    </div>
  )
}

export default MainChat
