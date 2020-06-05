package trees

class ZigZagTraversal {

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val levelOrderList = mutableListOf<MutableList<Int>>()
        if (root != null) getLevelOrderList(0, root, levelOrderList)
        return levelOrderList
    }

    private fun getLevelOrderList(level: Int, node: TreeNode?, list: MutableList<MutableList<Int>>) {
        if (node == null) return
        if (list.size <= level) list.add(mutableListOf())
        when (level.isEven()) {
            true -> list[level].add(node.`val`)
            false -> list[level].add(0, node.`val`)
        }
        getLevelOrderList(level + 1, node.left, list)
        getLevelOrderList(level + 1, node.right, list)
    }

    private fun Int.isEven(): Boolean = this and 1 == 1
}
