//factorial of an array
let arr =[ 3 ,4 ,5];

let factorial = arr.reduce((acc ,curr) => {
    return acc *curr}, 1);

    //reduce me do parameters hai accumulator and currentvalue upar me jo 1 hai wo initially accumulator ki value set ho jati hai 
    //or kuch nhi likhe to by default 1 rehti hai 

// function factorials(acc , cur ){
//   return acc *cur;
// }

console.log(factorial);
