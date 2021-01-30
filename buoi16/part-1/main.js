// Truy cập
let primary = document.getElementById('primary-number');
let secondary = document.getElementById('secondary-number');
let guessEle = document.getElementById('guess');
let button = document.getElementById('btn');
let operatorEl = document.getElementById('operator')

let timeEle = document.querySelector('.time')
let scoreEle = document.querySelector('.score')
let highScoreEle = document.querySelector('.high-score')
let listPlayerEl = document.querySelector('.list-player')


// Định nghĩa biến
let firstNumber;
let secondNumber;
let total;
let operator
let operators = ['+', '-', '*']

let score
let highScore = 0
let time
let interval

let ranking = [
    {
        name: 'Bùi Văn Hiên',
        avatar: 'https://techmaster.vn/media/static/crop/brp4jgc51co0c1746n90',
        score: 19,
    },
    {
        name: 'Tào Thúy Quỳnh',
        avatar: 'https://techmaster.vn/media/static/crop/brp4jgc51co0c1746n90',
        score: 7,
    },
    {
        name: 'Nguyễn Hàn Duy',
        avatar: 'https://techmaster.vn/media/static/crop/brp4jgc51co0c1746n90',
        score: 6,
    },
    {
        name: 'Trương Minh Thúy',
        avatar: 'https://techmaster.vn/media/static/crop/brp4jgc51co0c1746n90',
        score: 1,
    },
];

// Random số và hiển thị
function randomNumber() {
    firstNumber = Math.floor(Math.random() * 10)
    secondNumber = Math.floor(Math.random() * 10)
    operator = operators[Math.floor(Math.random() * operators.length)]

    total = eval(`${firstNumber} ${operator} ${secondNumber}`)


    primary.innerText = firstNumber;
    secondary.innerText = secondNumber;
    operatorEl.innerText = operator

}

// Khởi tạo game
function init() {
    score = 0
    time = 10
    scoreEle.innerText = score
    timeEle.innerText = `${time} s`
    highScore.innerText = highScore

    guessEle.innerText = ''
    randomNumber()
    renderRanking(ranking)

    interval = setInterval(countDown, 1000)


}
function countDown() {
    time--
    if (time < 10) {
        timeEle.innerText = `0${time}s`
    } else {
        timeEle.innerText = `${time}s`
    }
    if (time == 0) {
        clearInterval(interval)
        updateHighScore()
        addPlayertoRanking()
        setTimeout(init, 3000)
    }
}
function updateScore() {
    score++
    scoreEle.innerText = score
}
function updateHighScore() {
    highScore = Math.max(score, highScore)
    highScoreEle.innerText = score
}
// Xử lý khi người chơi kiểm tra kết quá
guessEle.addEventListener('keydown', function (e) {

    if (time != 0) {
        if (e.keyCode == 13) {
            let value = Number(this.value) //(this =e.value thang dang thcu hien  su viec)
            if (value == total) {
                updateScore()
                randomNumber()
                this.value = ''
            } else {
                this.value = ''
                return
            }
        }
    }
});
function addPlayertoRanking(){
    let user={
        name: 'Bùi Văn Hiên',
        avatar: 'https://techmaster.vn/media/static/crop/brp4jgc51co0c1746n90',
        score: score,
    }
    ranking.push(user)
    renderRanking(ranking)
}

function renderRanking(arr) {

let sortArr = arr.sort(function (a, b){
        return b.score - a.score
})
listPlayerEl.innerHTML = ''
for (let i = 0; i < arr.length; i++) {
    const p = sortArr[i]
    listPlayerEl.innerHTML += `<div class="list-item">
 <div class="list-rank">${i + 1}</div>
 <div class="list-info">
     <img src="${p.avatar}" alt="${p.name}">
     <div class="info">
         <span class="name">${p.name}</span>
     </div>
 </div>
 <div class="list-score">
     <span class="top-item-icon"><i class="fa fa-star" aria-hidden="true"></i></span>
     <span class="top-item-point">${p.score}</span>
 </div>
</div>`
}
}


window.onload = init;