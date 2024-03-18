
let loop = `y`;
while (loop == `y` || loop == `Y`) {
    let age = parseInt(prompt(`Enter Your Age`));
    let ans = age >= 18 ? `You can Drive` :` You cannot drive`;
    alert(ans)
loop = prompt(`Do You Wish to continue ? y or n`)
}
