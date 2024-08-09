import React, { memo } from 'react'
import './SideBare.style.css'
import ChatRow from '../ChatRow/ChatRow'
import {users} from '../../data'
const ChatsRoom = () => {
  // const [isClicked,setISClicked]=useState(false)

  return (
      <div className='users-div'>
        {
          users.map((chat)=>{
            return <ChatRow key={chat.id} {...chat}/>
          })
        }
      </div>
  )
}

export default memo(ChatsRoom)
