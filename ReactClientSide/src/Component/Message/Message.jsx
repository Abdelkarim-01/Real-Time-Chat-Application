import { icon } from '@fortawesome/fontawesome-svg-core'
import React from 'react'
import styles from './Message.module.css'
const Message = ({id,content,time,incoming}) => {
    const isToday = (date)=> {
        const today = new Date();
        return date.getDate() === today.getDate() &&
               date.getMonth() === today.getMonth() +1 &&
               date.getFullYear() === today.getFullYear();
    }
    const isYesterday = (date) => {
        const today = new Date();
        const yesterday = new Date(today);
        yesterday.setDate(today.getDate() - 1);
        return date.getDate() === yesterday.getDate() &&
               date.getMonth() === yesterday.getMonth() +1 &&
               date.getFullYear() === yesterday.getFullYear();
    }
    const displayDate=(date)=>{
        let GlobalDate =''
        if (isToday(date)) {
            GlobalDate='Today'
        }
        if (isYesterday(date)){
            GlobalDate='Yesterday'
        }
        return `${GlobalDate} ${date.getHours()}:${date.getMinutes()} `
    }
  return (
    <div className={incoming?styles.left:styles.right}>
        <div className={incoming?styles.incoming_message:styles.sended_message}>
        {content}
        <span>
            {
            displayDate(time)
            }
        </span>

        </div>
    </div>

  )
}

export default Message
