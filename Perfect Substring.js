let val = k * 2
let count = 0
var logic = true
let len=s.length
for (let i = 0; i < len; i++)
{
    let str = s.substr(i,i + val-i)
    console.log("str \t" + str)
    logic = isPalindrome(str)
    //console.log("In palindrome function output " + logic)
    if (logic == true) 
    {   
        count++
        console.log("In logic function::- " + count)
    }
}
return count
