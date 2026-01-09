
//Length of Longest Substring without any Repeating Character

Step
1. intialize l and r as 0 . also a variable to store max lenght
2. intailize a HashSet to store occurance of character in string

fun main() {
    println(lengthOfLongestSubstring("abcabcbb")) // 3
    println(lengthOfLongestSubstring("bbbbb"))    // 1
    println(lengthOfLongestSubstring("pwwkew"))   // 3
    println(lengthOfLongestSubstring(""))         // 0
}

fun lengthOfLongestSubstring(value : String): Int {

var l = 0
var r = 0
var maxLen = 0
val set = HashSet<Char>()

while(r<value.length){
if(set.contains(value[r])){
set.remove(value[l])
l++
}

set.add(value[r])
maxLen = maxOf(maxLen,r-l+1)
r++

}
return maxLen

}
