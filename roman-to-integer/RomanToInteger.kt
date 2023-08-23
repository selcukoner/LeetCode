class Solution {
    fun romanToInt(s: String): Int {
        var map = IntArray(128)
        map['M'.toInt()] = 1000; map['D'.toInt()] = 500; map['C'.toInt()] = 100; 
        map['L'.toInt()] = 50; map['X'.toInt()] = 10; map['V'.toInt()] = 5; map['I'.toInt()] = 1;

        var result:Int = 0
        var previousValue: Int = 0 

        for(ch in s){
            var currentValue = map[ch.toInt()]

            if(previousValue < currentValue)
                result -= 2*previousValue

            result += currentValue
            previousValue = currentValue
        }
        return result
    }
}