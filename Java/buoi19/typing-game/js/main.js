//Khai báo biến
let inputEl = document.getElementById('text')
let timeEl = document.getElementById('time')
let wordEl = document.getElementById('word')
let scoreEl = document.getElementById('score')
let btnStartGame = document.getElementById('btn-start-game')
let level = document.getElementById('level')
let startGameEle = document.querySelector('#start-game')
let gameEle = document.querySelector('.container')
let endGameEle = document.querySelector('#end-game-container')
let endgamebtn = document.querySelector('#btn-reload-game')
let words = [
    'write',
    'read',
    'play',
    'sleep',
    'eye',
]
let time
let word
let score = 0
let interval
btnStartGame.addEventListener('click', function () {
    level = level.value
    startGameEle.style.display = 'none'
    gameEle.style.display = 'flex'
    if (level == 'easy') {
        
        time = 30
        
    } else if (level == 'medium') {
        
        time = 20

    } else if (level == 'hard') {
        
        time = 10
    }
    addWordToDom()
    interval = setInterval(updateTime, 1000)
})
//Xử lí gõ phím
inputEl.addEventListener('input', function () {
    let value = inputEl.value
    let characters = document.querySelectorAll('#word span')
    if (!word.startsWith(value)) {
        wordEl.style.backgroundColor = 'red'

    } else {
        wordEl.style.backgroundColor = 'transparent'

        for (let i = 0; i < [...value].length; i++) {
            characters[i].style.color = 'green'
        }
    }

    if (value == word) {
        // Cập nhật điểm
        UpadateScore()
        // Ramdom ra từ mới
        addWordToDom()
        inputEl.value = ''
    }

})

//Bắt đầu vào game
function randomWord() {
    let index = Math.floor(Math.random() * words.length)
    return words[index]
}

function addWordToDom() {
    // Gọi ra hàm random đển random ra một từ
    word = randomWord()
    wordEl.innerHTML = [...word].map(char => `<span>${char}</span>`).join('');
}

function updateTime() {
    time--
    timeEl.innerText = `${time}s`
    if (time == 0) {
        clearInterval(interval)
        gameEle.style.display = 'none'
        endGameEle.style.display = 'flex'
        document.querySelector('.score').innerText = score

    }
}

function UpadateScore() {
    score++
    scoreEl.innerText = score
}


endgamebtn.addEventListener('click', function () {
    window.location.reload() 
})
