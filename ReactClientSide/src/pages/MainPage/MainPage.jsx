import MainChat from "../../Component/MainChat/MainChat"
import SideBare from "../../Component/SideBare/SideBare"
import './MainPage.style.css' 
const MainPage = () => {
  return (
    <div className="main-page">
        <SideBare />
        <MainChat />
    </div>
  )
}

export default MainPage
