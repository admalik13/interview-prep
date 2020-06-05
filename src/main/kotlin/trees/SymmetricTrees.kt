package trees

class SymmetricTrees {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root,root)
    }

    private fun isMirror(leftNode: TreeNode?, rightNode: TreeNode?): Boolean{
        return leftNode.let{ left ->
            rightNode.let { right ->
                when {
                    left != null && right != null->
                        left.`val` == right.`val` &&
                                isMirror(left.left, right.right) &&
                                isMirror(left.right, right.left)
                    right == null && left!= null -> return false
                    right !=null && left == null -> return false
                    else -> return true
                }
            }
        }

    }
}