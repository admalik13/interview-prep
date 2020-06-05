package trees

/**
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree">max-depth-binary-tree</a>
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
 * return its depth = 3.
*/

import kotlin.math.max

class MaxDepth {

    fun maxDepth(root: TreeNode?): Int {
        return dfs(root)
    }

    private fun dfs(node: TreeNode?): Int{
        if(node == null) return 0
        return 1 + max(dfs(node.left), dfs(node.right))
    }
}