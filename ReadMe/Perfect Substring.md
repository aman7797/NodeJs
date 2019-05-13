# Perfect Substring
You are given a string s and an integer `k`. String `s` consists of digits from O to 9 . A substring `s[L:R] (where O<L<R< sizeof(s))` is a contiguous group of characters with `s`. A substring is called a peffect substring if all of its elements occur exactly `k` times.


## Functional Description

For example, s =1102027222 and k = 2. Its 6 perfect substrings are:
 1. _s[0:1]_=_11_ 
 2. _s[0:5]_=_110202_
 3. _s[1:6]_=_102021_
 4. _s[2:4]_=_0202_ 
 5. _s[7:8]_=_22_ 
 6. _s[8:9]_=_22_ 

Calculate the number of perfect substrings in `s`. 

## Output Format

Return the total number of substring.

## What I have tried !!!
```js
let val = k * 2
let count = 0
var logic = true
let len=s.length
for (let i = 0; i < len; i++)
{
    let str = s.substr(i, i + val-i)
    console.log("str \t" + str)
    logic = isPalindrome(str)
    if (logic == true) 
    {   
        count++
        console.log("In logic function::- " + count)
    }
}
return count
```
