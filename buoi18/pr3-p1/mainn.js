// Mockup mảng công việc (todo)
let idUpdate = null
let isUpdate = false
let options = document.querySelectorAll('.todo-option-item input')
function randomId() {
    return Math.floor(Math.random() * 100000)
}
let todos = []
console.log(todos)

// Lấy data từ local storage để render
function getDataFromLocalStorage(){
    let dataLocalStorage = localStorage.getItem("todos")
    if(dataLocalStorage){
        todos = JSON.parse(dataLocalStorage)
    }else{
        todos=[]
    }
    RenderUI(todos)
}
// Từ todo => render ra ngoài giao diện
let todo_list = document.querySelector('.todo-list')
function RenderUI(arr) {
    // Lọc đữ liệu
    let optionValue = getOptionSelected()
    console.log(optionValue)
    let newTodos = []
    switch (optionValue) {
        case 1:
            newTodos = [...arr]
            break;
        case 2:
            newTodos = todos.filter((todo) => todo.status == false)
            break;
        case 3:
            newTodos = todos.filter((todo) => todo.status == true)
            break;
        default:
            newTodos = [...todos]
            break;
    }
    todo_list.innerHTML = '';

    // Kiem tra danhc sach todos co rong hay khong
    if (newTodos.length == 0) {
        todo_list.innerHTML = `<p class='todos-empty'> Hết rồi</p>`;
        return
    }
    for (let i = 0; i < newTodos.length; i++) {
        let t = newTodos[i]
        todo_list.innerHTML += `
<div class="todo-item ${t.status ? 'active-todo' : ''}">
                    <div class="todo-item-title">
                        <input type="checkbox" ${t.status ? 'checked' : ''} onclick=toggleStatus(${t.id})>
                        <p>${t.title}</p>
                    </div>
                    <div class="option">
                        <button class="btn btn-update">
                            <img src="./img/pencil.svg" alt="icon" onclick=rename(${t.id})  >
                        </button>
                        <button class="btn btn-delete" onclick=deleteTodo(${t.id})>
                            <img src="./img/remove.svg" alt="icon">
                        </button>
                    </div>
                </div>
`
    }
}
options.forEach(option => {
    option.addEventListener('change', function(){
        RenderUI(todos)
    })
})

function getOptionSelected() {
    for (let i = 0; i < options.length; i++) {
        if (options[i].checked == true) {
            return Number(options[i].value)
        }
    }
}
 
// // set data
function setDatatoLocalStorage(todos){
    localStorage.setItem("todos",JSON.stringify(todos))
    RenderUI(todos)
}
function deleteTodo(id) {
    // lap qua mang todo
    for (let i = 0; i < todos.length; i++) {
        if (todos[i].id == id) {
            todos.splice(i, 1)
        }
    }
    setDatatoLocalStorage(todos)

}

function toggleStatus(id) {
    for (let i = 0; i < todos.length; i++) {
        if (todos[i].id == id) {
            if (todos[i].status == false) {
                todos[i].status = true
            } else {
                todos[i].status = false
            }
        }

    }
    setDatatoLocalStorage(todos)
}
// Ấn nut thêm thì thêm công việc
let todo_input = document.querySelector('#todo-input')
let btn_add = document.querySelector('#btn-add')
// thêm công việc
btn_add.addEventListener('click', function () {
    // Lấy dư liệu từ ô input
    let title = todo_input.value
    // Kiểm tra dữ liệu
    if (title == '') {
        alert(' nhập vào đi')
        return
    }
    if (isUpdate) {
        // Sửa
        for (let i = 0; i < todos.length; i++) {
            if (todos[i].id == idUpdate) {
                todos[i].title = title;
            }
        }
        idUpdate = null;
        isUpdate = false;
        btn_add.innerText = 'Thêm';
    } else {
        // Thêm todo mới vào mảng todos
        let newTodo = {
            id: randomId(),
            title: title,
            status: false,
        };
        todos.push(newTodo);
    }
    todo_input.value = ''
    setDatatoLocalStorage(todos)
})



function rename(id) {
    for (let i = 0; i < todos.length; i++) {
        if (todos[i].id == id) {
            todo_input.value = todos[i].title

        }
    }
    btn_add.innerText = 'Sửa'
    todo_input.focus()
    idUpdate = id
    isUpdate = true
}
window.onload = getDataFromLocalStorage()

// Todo item => status = true => thêm class "active-todo", input - checked