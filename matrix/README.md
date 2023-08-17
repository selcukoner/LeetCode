# [542. 01 Matrix][question-link]

Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

 


### Example 1:
![01-1-grid](https://github.com/selcukoner/LeetCode/assets/21000541/234380c1-f396-4016-908f-981d985630f2)

```text
Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
```
### Example 2:
![01-2-grid](https://github.com/selcukoner/LeetCode/assets/21000541/1fe6c8a9-ee0a-48ae-9c36-139f30df946e)

```text
Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
 ```

### Constraints:

* m == mat.length
* n == mat[i].length
* 1 <= m, n <= 104
* 1 <= m * n <= 104
* mat[i][j] is either 0 or 1.
* There is at least one 0 in mat.

[question-link]: https://leetcode.com/problems/01-matrix/
