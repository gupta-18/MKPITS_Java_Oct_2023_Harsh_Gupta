// let iterate = parseInt(prompt(`Input Size of an array`));


// // o value elements are not allowed
// for (let index = 0; index < iterate; index++) {
//     inputs = parseInt(prompt(`Enter ${index} index element`));
//     if (inputs != 0) {
//         arr.push(inputs)
//     } else {
//         alert(`0 cant be added`);
//         break;
//     }
    
// }
// console.log(arr)
// // only divisible by 10 are allowed
// let filtered = arr.filter(divisible_10);
//  function divisible_10(value){
//     if (value % 10 == 0) {
//         return true
//     } else {
//         return false
//     }
//  }
//  console.log(filtered);

// // square of array values
//  let square =arr.map((value ) => {
//     return value * value;
// })

// console.log(square);

//factorial of number
let arr =[ 3 ,4 ,5];

let factorial = arr.reduce((acc ,curr) => {
    return acc *curr}, 1);

    //reduce me do parameters hai accumulator and currentvalue upar me jo 1 hai wo initially accumulator ki value set ho jati hai 
    //or kuch nhi likhe to by default 1 rehti hai 

// function factorials(acc , cur ){
//   return acc *cur;
// }

console.log(factorial);

// const array = [5, 4];

// function factorial(n) {
//   if (n === 0 || n === 1) {
//     return 1;
//   } else {
//     return Array.from({ length: n }, (_, index) => index + 1).reduce((acc, curr) => acc * curr, 1);
//   }
// }

// const factorials = array.map(factorial);

// console.log("Factorials of the numbers in the array:", factorials);