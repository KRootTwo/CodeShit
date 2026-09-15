var a = 12;
var b = 10;
var c;
// console.log(a)

function sumAswap(a, b) {
    var s = a + b;
    var x = a;
    a = b;
    b = x;
    return s;
}

c = sumAswap(a, b);

console.log(a, b, c);

// -------- //

a = [1, 2, 3];
b = a;

a.pop();        /* del from end */
console.log(a, b);

a.push(9);      
console.log(a, b);

a.unshift(7);
console.log(a, b);

a.shift();      /* del from start */
console.log(a, b);

a.splice(2, 2)
console.log(a, b);

for (var i = 0; i < 10; i++) {
    // console.log("nigger");
}



