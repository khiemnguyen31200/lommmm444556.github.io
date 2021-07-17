
// function ramdom
function randomId() {
    return Math.floor(Math.random() * 100000);
}

function convertMoney(num) {
    return num.toLocaleString('it-IT', {style : 'currency', currency : 'VND'});
}

//Mockup danh sách sản phẩm
let products = [
    {
        id: randomId(),
        name: 'Quần bò nam',
        description: 'Đây là quần bò dành cho Nam',
        price: 400000,
        count: 3,
        image: 'data:image/jpeg;base64,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',

    },
    {
        id: randomId(),
        name: 'Áo phông nam',
        description: 'Đây là áo phông dành cho Nam',
        price: 250000,
        count: 1,
        image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTS2pKIg0h0QR8SV3EZCipwyk8vCtZI_4fFqNMTO7PsF-GgPz_DIvxwuz7CmhgJ71YeXOb4T3y-&usqp=CAc',

    },
    {
        id: randomId(),
        name: 'Quần đùi nam',
        description: 'Đây là quần đùi dành cho Nam',
        price: 150000,
        count: 1,
        image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxqwDU1GXoxxYTQV7bv7duNnjCVHFiOnFUhvXFCQf-yzYMbXuc4IswTFSwEg&usqp=CAc',

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
