import React, { useState } from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faArrowsSpin, faBars, faMagnifyingGlass, faRightToBracket, faXmark } from '@fortawesome/free-solid-svg-icons';
import { faMoon, faUser } from '@fortawesome/free-regular-svg-icons';

const SidebareHeader = ({isShow ,setIsShow}) => {
    
  return (
      <div className="sidebare-header" >
        {
            isShow 
                && 
            <div className="bare-menu">
                <div className='row-menu'>
                    <FontAwesomeIcon icon={faUser} className='icon-menu' />
                    <p>Profile</p>
                </div>
                <div className='row-menu'>
                    <FontAwesomeIcon icon={faMoon} className='icon-menu'/>
                    <p>Dark Mode</p>
                    <label className="switch">
                        <input type="checkbox" />
                        <span className="slider"></span>
                    </label>
                </div>
                <div className='row-menu'>
                    <FontAwesomeIcon icon={faArrowsSpin} className='icon-menu'/>
                    <p>Stories</p>
                </div>
                <div className='row-menu leave'>
                    <FontAwesomeIcon icon={faRightToBracket} className='icon-menu leave'/>
                    <p>Leave Channel</p>
                </div>
            </div>
        }
        
        <button className='bar-icon' onClick={()=>setIsShow(!isShow)}>
          <FontAwesomeIcon icon={faBars} />
        </button>
        <div className='input-search'>
          <FontAwesomeIcon icon={faMagnifyingGlass} className='search-icon' />
          <input type="text" placeholder={'Search'} />
          {/* <FontAwesomeIcon icon={faXmark} className='xmark-button' /> */}
        </div>
      </div>
  )
}

export default SidebareHeader
