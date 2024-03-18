

let generated = Math.ceil(Math.random()*100);
// console.log(generated)

let userinput = parseInt( prompt(`Enter the number ${generated}`)); 
 
let guess = 0;

let useInput1 = () => {
    userinput = parseInt(prompt(`Enter the correct number`));
};
if(isNaN(userinput)){
    alert("please enter valid number");
}


for (guess; guess < 3; guess++) {
  if(generated != userinput){
    alert("Wrong input please try again ");
    useInput1();
  }

  if(generated == userinput){
    alert(`You Enter the correct Number It's ${generated}`);
  } 

}

console.log(` you have used all 3 chance`);


// while(generated != userinput ){
//     alert("Wrong input please try again ");
//     useInput1();
//     guess++;
// }


// console.log(`You took ${guess} chances`)

