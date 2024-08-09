import { useState } from 'react'
import ChatsRoom from './ChatsRoom'
import './SideBare.style.css'
import SideBareHeader from './SideBareHeader'

const SideBare = () => {
  const [isShow,setIsShow] =useState(false)
  return (
    <div className='side-container' onMouseLeave={()=>{setIsShow(false)}}>
      <SideBareHeader isShow={isShow} setIsShow={setIsShow}/>
      <ChatsRoom />
    </div>
  )
}

export default SideBare
