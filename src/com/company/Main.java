// you can also use imports, for example:
// import java.util.*;
import java.util.Set;
import java.util.HashSet;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        Set<Integer> Perms = new HashSet<Integer>();
        int maxValue = 0;

        for(int i = 0; i<A.length; ++i){

            if(!Perms.contains(A[i])){
                Perms.add(A[i]);
            } else {
                return 0;
            }

            if(A[i]>maxValue){
                maxValue = A[i];
            }

        }

        if(Perms.size() == maxValue && Perms.contains(1)){
            return 1;
        } else {
            return 0;
        }


    }
}