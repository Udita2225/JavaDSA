package SlidingWindow;
//904. Fruit Into Baskets
/*
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by
an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of
fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.
Example 1:
Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:
Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
Constraints:
1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length
*/
public class LeetCode904FruitIntoBasketsPickToys {
/*
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int maxLen =  Integer.MIN_VALUE;
        int i=0;
        //Expand the window size unless the size of map becomes >2;
        for(int j=0; j<n; j++){
            //Map Formation

            //int ele= fruits[j];
            // if(map.containsKey(ele)){
            //     int freq =  map.get(ele);
            //     map.put(ele, freq+1);
            // }
            // else map.put(ele,1);

            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);

            // Removing elements if map.size()>2 so that only 2 distinct trees will be available in the window.
            while(map.size()>2){
                int leftEle =  fruits[i];
                map.put(leftEle, map.get(leftEle)-1);
                if(map.get(leftEle)==0) map.remove(leftEle);
                i++;
            }
            //Calculating maxLen everytime.
            maxLen = Math.max(maxLen, j-i+1);
        }
    return maxLen;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            // Add current fruit
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            // Shrink window if more than 2 fruit types
            while (map.size() > 2) {
                int leftFruit = fruits[i];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                i++;
            }

            // Update max length
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}

*/
}
