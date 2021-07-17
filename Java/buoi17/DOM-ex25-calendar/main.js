let monthEle = document.querySelector('.month')
let yearEle = document.querySelector('.year')
let btnNext = document.querySelector('.btn-next')
let btnPrev = document.querySelector('.btn-prev')
let dateEle = document.querySelector('.date-container')

let currentMonth = new Date().getMonth()
let currentYear = new Date().getFullYear()

console.log(currentMonth, currentYear)

function displayInfo() {
    // Hiển thị tên"
    let currentMonthName = new Date(currentYear, currentMonth).toLocaleString("en-us", { month: "long" })
    monthEle.innerText = currentMonthName
    // Hiển thị tên tháng
    yearEle.innerText = currentYear
    renderDate()
    //Hiển thị ngày bắt đầu của tháng



}
//Hiển thị ngày trong tháng
btnNext.addEventListener('click', function () {
    if (currentMonth == 11) {
        currentMonth = 0
        currentYear++
    } else {
        currentMonth++
    }
    displayInfo()
})
btnPrev.addEventListener('click', function () {
    if (currentMonth == 0) {
        currentMonth = 11
        currentYear--
    } else {
        currentMonth--
    }
    displayInfo()
})
// Lấy số ngày của một tháng
function getDayInMonth() {
    return new Date(currentYear, currentMonth + 1, 0).getDate()

}
// Lấy ngày bắt đầu của tháng
function getStartDayInMonth() {
    return new Date(currentYear, currentMonth, 1).getDay()
}
//Active ngày hiện tai
function activeCurrentDay(day) {
    let day1 = new Date().toDateString()
    let day2 = new Date(currentYear, currentMonth, day).toDateString()
    return day1 ==  day2 ? "active" : ""
}
//Render ngày lên UI
function renderDate() {
    let DayInMonth = getDayInMonth()
    let StartDay = getStartDayInMonth()
    dateEle.innerHTML = ''
    for (let i = 0; i < StartDay; i++) {
        dateEle.innerHTML += `<div class="day"></div>`
    }


    for (let i = 0; i < DayInMonth; i++) {
        dateEle.innerHTML += `<div class="day ${activeCurrentDay(i + 1)}">${i + 1}</div>`
    }
}

window.onload = displayInfo