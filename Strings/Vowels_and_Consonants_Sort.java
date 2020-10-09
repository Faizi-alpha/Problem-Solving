/*
Problem Statement :

Given a lowercase alphabet string s, return a string with all the vowels of s in sorted order followed by all the consonants of s in sorted order.
Note: vowels are ["a", "e", "i", "o", "u"] and consonants are all other characters.

Example :-
Input : s = "decalin"
Output : "aeicdln"

Algo :

First:

Sort the array so when we add vowels or consonants to the string they are already in sorted order.

Second:
Count the number of vowels in the string

Third
Create our answer array with the length of the string.
Set our consonants counter to the number of vowels.
(Everything before this number will be vowels since they go first)
Reset the vowel counter to 0

Fourth
If the character is a vowel add it to the front with a vowel counter initialized at 0.
Else add the consonant after all the vowels with the counter initialized at the number of vowels in the string.


Time Complexity :- O(N logN)
Space Complexity :- O(N)

Code :
*/

import java.util.*;

class Solution {
    public String solve(String s) {
      
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        
        String vow = "aeiou";
        int v = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(vow.indexOf(arr[i]) != -1)
                v++;
        }
        
        int con =v;
        v = 0;
       
        char res[] = new char[s.length()];
        
        for(int i=0;i<s.length();i++)
        {
            if(vow.indexOf(arr[i]) != -1)
                res[v++] = arr[i];
            else
                res[con++] = arr[i];
        }
        
        return new String(res);  // dont use toString
      
    }
}
