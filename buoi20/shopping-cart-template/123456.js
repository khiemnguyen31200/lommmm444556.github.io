// function random
function randomId() {
    return Math.floor(Math.random() * 100000);
}

function convertMoney(num) {
    return num.toLocaleString('it-IT', {style : 'currency', currency : 'VND'});
}

// mockup danh sách sản phẩm
let products = [
    {
        id : randomId(),
        name : 'Áo hoodie',
        description : 'felt',
        price : 350000,
        count : 3,
        image : 'https://www.mockupworld.co/wp-content/uploads/2018/01/free-hoodie-front-back-mockup-psd.jpg',
    },
    {
        id : randomId(),
        name : 'Áo cộc',
        description : 'cotton',
        price : 250000,
        count : 2,
        image : 'https://topcomshop.com/uploads/images/aa7/8479556039-521144967.jpg',
    },
    {
        id : randomId(),
        name : 'Quần short',
        description : 'kaki',
        price : 150000,
        count : 4,
        image : 'https://s1.storage.5giay.vn/image/2017/04/20170401_8e4bfa291afecc0fe952eeaf028d9ab5_1491032621.jpg',
    },
];

// Danh sách mã giảm giá
let promotionCode = {
    A : 10,
    B : 20,
    C : 30,
    D : 40,
}

// Truy cập vào các thành phần
let productsEl = document.querySelector('.products');
let countEl = document.querySelector('.count');

let subtotalEl = document.querySelector('.subtotal span');
let vatEl = document.querySelector('.vat span');
let totalEl = document.querySelector('.total span');

let discount = document.querySelector('.discount');
let discountEl = document.querySelector('.discount span');

let inputPromoCode = document.querySelector('#promo-code');

// Hiển thị sản phẩm ra ngoài giao diện
function renderProducts(arr) {
    productsEl.innerHTML = '';

    // Cập nhật số lượng sản phẩm
    countEl.innerText = `${updateTotalProduct(arr)} items in the bag`;
    
    // Cập nhật tổng số tiền
    updateTotalMoney(arr)
    if(arr.length == 0){
        document.querySelector('.option-container').classList.add('hide');
        productsEl.insertAdjacentHTML('afterbegin',
        '<li>K cos san pham nao</li>');
        return;
    }


    // Hiển thị sản phẩm
    for (let i = 0; i < arr.length; i++) {
        var p = arr[i];
        productsEl.innerHTML += `
        <li class="row">
					<div class="col left">
						<div class="thumbnail">
							<a href="#">
								<img src="${p.image}" alt="${p.name}">
							</a>
						</div>
						<div class="detail">
							<div class="name"><a href="#">${p.name}</a></div>
							<div class="description">
								${p.description}
							</div>
							<div class="price">${convertMoney(p.price)}</div>
						</div>
					</div>

					<div class="col right">
						<div class="quantity">
							<input type="number" class="quantity" step="1" value="${p.count}"
                            onchange="updateCountProduct(${p.id}, event)"
                            ">
						</div>

						<div class="remove" onclick="deleteProduct(${p.id})">
							<span class="close"><i class="fa fa-times" aria-hidden="true"></i></span>
						</div>
					</div>
				</li>`
    }
}

// Cập nhật số lượng sẩn phẩm
function updateTotalProduct(arr) {
    let sum = 0;
    for (let i = 0 ; i < arr.length; i++){
        sum += arr[i].count
    }
    return sum
}


// Kieerm tra so luong san pham co hay k


function updateTotalMoney(arr) {
    let subtotal = 0;
    let discountMoney = 0;
    for (let i = 0; i < arr.length; i++) {
        subtotal += (arr[i].count * arr[i].price);
    }


    // Tính toán giảm giá
    let data = checkPromotionCode();
    if(data.status){
        discountMoney = subtotal * data.value / 100;
        discount.classList.remove("hide");
    } else {
        discount.classList.add('hide');
    }

    subtotalEl.innerText = convertMoney(subtotal);
    vatEl.innerText = convertMoney(subtotal * 0.1 );
    discountEl.innerText = convertMoney(discountMoney);
    totalEl.innerText = convertMoney(subtotal * 1.1 - discountMoney );

}

// Xóa sản phẩm
function deleteProduct(id) {
    for (let i = 0; i < products.length; i++){
        if ( products[i].id == id){
            products.splice(i, 1)
        }
    }
    renderProducts(products)
}

// Cập nhật sản phẩm theo ô input
function updateCountProduct(id, e){
        for (let i = 0; i < products.length; i++){
        if ( products[i].id == id){
            products[i].count = Number(e.target.value);
        }
    }
    renderProducts(products)
}

// Kiểm tra mã giảm giá hợp lệ hay không
function checkPromotionCode() {
    let code = inputPromoCode.value
    if ( promotionCode[code]){
        return {status : true, value: promotionCode[code] };
    } else {
        return {status : false, value: 0 };
    }
}

document.querySelector('.promotion button').addEventListener('click',function() {
updateTotalMoney(products);

});

window.onload = renderProducts(products)
