'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the minimumSwaps function below.
function minimumSwaps(arr) {
    let swap = 0,visited =[]
    for (let i = 0; i < arr.length; i++) {
        console.log("i \t ->"+i)
        let j = i, cycle = 0;
        console.log("j \t ->" + j)
        while (!visited[j]) {
            console.log("in while loop")
            console.log(visited[j])
            visited[j] = true;
            j = arr[j] - 1;
            console.log("j \t ->" + j)
            cycle++;
        }
        if (cycle != 0)
            swap += cycle - 1;
        console.log("swap \t ->" + swap)
    }
    return swap;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    const res = minimumSwaps(arr);

    ws.write(res + '\n');

    ws.end();
}
