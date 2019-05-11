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

// Complete the countingValleys function below.
function countingValleys(n, s) {
    let countU=0,countD=0,level=0
    for (let i = 0; i < n; i++){
        var c = s.charAt(i);
        // console.log("c" + c)
        if (c == 'U') {
            countU++ 
        }
        else {
            countD++   
        }
    }
    console.log("countU" + countU)
    console.log("countD" + countD)
    if (countU > 4 || countD > 4) {
        level = countU - countD
        level=level+2
    }
    else {
        level = countU - countD
        level = level + 1
    }
    console.log("Answer" + level)
    return level
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const s = readLine();

    let result = countingValleys(n, s);

    ws.write(result + "\n");

    ws.end();
}
