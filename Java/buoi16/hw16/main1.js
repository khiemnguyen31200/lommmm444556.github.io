// Truy cập
let primary = document.getElementById('primary-number');
let secondary = document.getElementById('secondary-number');
let guessEle = document.getElementById('guess');
let checkbtn = document.getElementById('smt')
let operatorEl = document.getElementById('operator')

// Định nghĩa biến
let firstNumber;
let secondNumber;
let total;
let operator
let operators = ['+', '-', '*']

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
    guessEle.innerText = ''
    randomNumber()
}

// Xử lý khi người chơi kiểm tra kết quá
checkbtn.addEventListener('click', function () {


    let value = Number(guessEle.value);
    if (value == total) {
        alert("Chuẩn rồi")
    } else {
        alert("Sai rồi")
    }

})

window.onload = init;