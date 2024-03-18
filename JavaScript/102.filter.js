let fruits = [`mango`,`banana`, `papaya`,`kiwi`,`orange`];

let number =[3,5,7,8,4,2];

let num = number.filter( greater);
//filter an array with values that passes a test 
//function banake call kar rahe hai
function greater (number) {

if (number >5) {
    return true;
} else {
    return false;
}

}

console.log(num);