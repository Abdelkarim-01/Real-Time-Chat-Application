import { useState } from 'react'
import styles from './ChatRow.module.css'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faPeopleLine, faUserGroup } from '@fortawesome/free-solid-svg-icons'
import {getLastSeen} from '../../Functions'
const ChatRow = ({id,isRoom,roomName,firstName,lastName,biography,status,lastSeen}) => {
  return (
    <div 
      className={`${styles.user_row}  `} 
      onClick={()=>''}
    >
      <div className={styles.user_avatar}>
        <img src={'https://www.pngplay.com/wp-content/uploads/12/User-Avatar-Profile-PNG-Photos.png'} alt={''} />
        <div className={status==='offline'?styles.status_offline:status==='online'?styles.status_online:''}></div>
      </div>
      <div className={styles.user_info}>
        <p className={styles.user_name}>{isRoom?roomName:`${firstName} ${lastName}`}</p>
        <p className={styles.user_message}>{biography}</p>
      </div>
      {
        isRoom?<FontAwesomeIcon icon={faPeopleLine}  className={styles.groupIcons}/>:null
      }
      {status==='offline'?<p className={styles.last_seen}>{getLastSeen(lastSeen)}</p>:null}
    </div>
  )
}

export default ChatRow
