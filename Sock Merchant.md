# Sock Merchant

John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  `n=7` socks with colors `ar=[1,2,1,2,1,3,2]`. There is one pair of color `1` and one of color `2`. There are three odd socks left, one of each color. The number of pairs is `2`.

## Functional Description

It must return an integer representing the number of matching pairs of socks that are available.

SockMerchant has the following parameter(s):

* n: the number of socks in the pile
* ar: the colors of each sock

## Output Format 

Return the total number of matching pairs of socks that John can sell.

## Sample Input

    9
    10 20 20 10 10 30 50 10 20

## Sample Output
    3


## What I Tried !!!
```js
function sockMerchant(n, ar) {
    let countval = 0, val = 0, output=0
    for (let i = 0; i < n; i++){
        val = ar[i]
        for (let j = i + 1; j < n; j++){ 
            if (ar[j] == val) 
            {
                countval++ 
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
```