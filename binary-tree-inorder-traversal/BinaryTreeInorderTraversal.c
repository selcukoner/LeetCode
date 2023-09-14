/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void addToArray(int *returnArray, struct TreeNode* root, int *arrayIndex, int *returnSize);

int* inorderTraversal(struct TreeNode* root, int* returnSize){

    int *arrayIndex = (int*) malloc(sizeof(int));
    *arrayIndex = 0;

    *returnSize = 0;

    int *returnArray =(int *) malloc(sizeof(int)* 100);
    
    addToArray(returnArray, root, arrayIndex, returnSize);

    returnArray = (int *) realloc(returnArray, sizeof(int) * (*returnSize));

    return returnArray;
}

void addToArray(int *returnArray, struct TreeNode* root, int *arrayIndex, int *returnSize){
    if(root == NULL)
        return;

    if(root -> left != NULL){
        addToArray(returnArray, root -> left, arrayIndex, returnSize);
    }

    returnArray[*arrayIndex]  = root -> val;
    (*arrayIndex)++;
    (*returnSize)++;

    if(root -> right != NULL){
        addToArray(returnArray, root -> right, arrayIndex, returnSize);
    }

    return;
}