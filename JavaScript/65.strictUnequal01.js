let a = 2; b=2, c=3; 
let d = {name:"Ram"}; 
let e = {name:"Ram"}; 
let f = e; 
  
console.log(a!==b); 
console.log(a!==c); 
console.log(d!==e); 
console.log(f!==e);

// Since the objects, d, and e contain the same value but have different references so true is returned but objects f and e have the same reference so false is returned.