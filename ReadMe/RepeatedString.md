# Repeated String

Lilah has a string, $s$ , of lowercase English letters that she repeated infinitely many times.

Given an integer,$n$ , find and print the number of letter a's in the first $n$ letters of Lilah's infinite string.

For example, if the string $s='abcac'$ and $n=10$, the substring we consider is **_abcacabcac_**, the first $10$ characters of her infinite string. There are $4$ occurrences of a in the substring.

## Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  $n$ in the infinitely repeating string.

repeatedString has the following parameter(s):

* s: a string to repeat
* n: the number of characters to consider

## Input Format

The first line contains a single string,$s$ . 

The second line contains an integer,$n$.

## Constraints
$$1 \leq |s| \leq 100$$
$$1 \leq n \leq 10^{12}$$
For 25% of the test cases, $n\leq10^6$

## Output Format
Single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

## Sample Input
    aba
    10

## Sample Output
    7

## Explanation
The first $n=10$ letters of the infinite string are abaabaabaa. Because there are 7 a's, we print 7 on a new line.

## Sample Input
    a
    1000000000000

## Sample Output
    1000000000000

## Explanation
Because all of the first $n=1000000000000$ letters of the infinite string are a, we print 1000000000000 on a new line.

## What I have Tried !!!
```js
function repeatedString(s, n) {
    let num = parseInt(n / s.length)
    let rem = n % s.length;
    let aCount = 0;
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) == 'a') {
            aCount += num;
            if (i < rem)
                aCount++;
        }
    }
    return aCount

}
```