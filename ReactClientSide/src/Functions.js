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
export const getLastSeen=(date)=>{
    const hours =date.getHours().toString();
    const minutes =date.getMinutes().toString().padStart(2, '0');

    if(isToday(date)){
        return `Today ${hours}:${minutes}` 
    }
    if(isYesterday(date)){
        return `Yesterday ${hours}:${minutes}` 
    }
    return `${date.getDate()}/${date.getMonth()}/${date.getFullYear()}`
}