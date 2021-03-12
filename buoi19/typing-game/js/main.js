//Khai báo biến
let inputEl = document.getElementById('text')
let timeEl = document.getElementById('time')
let wordEl = document.getElementById('word')
let scoreEl = document.getElementById('score')
let words = [
    'write',
    'read',
    'play',
    'sleep',
    'eye',
]
let word
let time = 10
let score = 0
let interval
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
    if (time <= 5) {
        timeEl.style.color = 'blue'

    } else {
        timeEl.style.color = 'orange'
    }
    if (time == 0)
        clearInterval(interval)
}

function UpadateScore() {
    score++
    scoreEl.innerText = score
}
interval = setInterval(updateTime, 1000)

window.onload = addWordToDom