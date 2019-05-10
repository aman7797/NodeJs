'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the sockMerchant function below.
function sockMerchant(n, ar) {
    let countval = 0, val = 0, output=0
    for (let i = 0; i < n; i++){
        val = ar[i]
        // console.log("val"+val)
        for (let j = i + 1; j < n; j++){
            // console.log("value of j" + ar[j])  
            if (ar[j] == val) {
                // console.log("Comes in if condition")
                countval++
                // console.log("countval" + countval)  
            }
            
        } 
        let odd = countval % 2
        console.log("odd" + odd)
        countval = 0 
        output +=odd
    }
    console.log("output" + output)
    return output
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const ar = readLine().split(' ').map(arTemp => parseInt(arTemp, 10));

    let result = sockMerchant(n, ar);

    ws.write(result + "\n");

    ws.end();
}
