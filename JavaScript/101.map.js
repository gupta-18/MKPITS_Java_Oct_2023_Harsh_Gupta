let fruits = [`mango`,`banana`, `papaya`,`kiwi`,`orange`];

let number =[3,5,7,8,4,2];
// creates a new array by performing some operation on each array element
let num =number.map((value , index,array) => {
    return value + value;
})

console.log(num);