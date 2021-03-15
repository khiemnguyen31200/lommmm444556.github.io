let nameplayer1El = document.getElementById('name-1')
let nameplayer2El = document.getElementById('name-2')
let scoreplayer1El = document.getElementById('score-1')
let scoreplayer2El = document.getElementById('score-2')
let currscoreplayer1El = document.getElementById('current-0')
let currscoreplayer2El = document.getElementById('current-1')
let dice1 = document.getElementById('dice-1')
let dice2 = document.getElementById('dice-2')
let btnlacxucxac = document.querySelector('.btn-roll')
let activePlayer = 0
let btnsavepoint = document.querySelector('.btn-hold')

//Part-2
function init() {
    nameplayer1El.innerText = "Player 1"
    nameplayer2El.innerText = "Player 2"
    scoreplayer1El.innerText = 0
    scoreplayer2El.innerText = 0
    currscoreplayer1El.innerText = 0
    currscoreplayer2El.innerText = 0
    dice1.style.display = "none"
    dice2.style.display = "none"
}
window.onload = init()
//Part 3+4
btnlacxucxac.addEventListener('click', function () {
    let number1 = Math.floor(Math.random() * 6) + 1;
    let number2 = Math.floor(Math.random() * 6) + 1;
    dice1.src = `./img/dice-${number1}.png`
    dice2.src = `./img/dice-${number2}.png`
    dice1.style.display = "block"
    dice2.style.display = "block"
    if (number1 != 1 && number2 != 1) {
        lastscore = document.getElementById(`current-${activePlayer}`).innerText = number1 + number2 + Number(document.getElementById(`current-${activePlayer}`).innerText)

    } else {
        if (activePlayer == 0) {
            activePlayer = 1
            currscoreplayer1El.innerText = 0


        } else {

            activePlayer = 0
            currscoreplayer2El.innerText = 0
        }
    }
})
btnsavepoint.addEventListener('click', function () {
    if (activePlayer = 0) {
        scoreplayer1El.innerText = `${lastscore}`
    } else {
        scoreplayer2El.innerText = `${lastscore}`

    }
})