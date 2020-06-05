package trees

class LevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        return root.let { node ->
            when {
                node != null -> getLevelOrderList(node)
                else -> list
            }
        }
    }

    private fun getLevelOrderList(treeNode: TreeNode): List<List<Int>> {
        val list = mutableListOf(listOf(treeNode.`val`))
        var nodeList = listOf(treeNode)
        while (!nodeList.isNullOrEmpty()) {
            val elemList = mutableListOf<TreeNode>()
            nodeList.parallelStream().forEachOrdered { node ->
                node.left.let {
                    when {}
                }elemList.add()
            }
            nodeList = elemList
            if (nodeList.isNotEmpty()) list.add(nodeList.map { it.`val` })
        }
        return list
    }

    private fun getLevelOrderList(level: Int, node: TreeNode?, list: MutableList<MutableList<Int>>) {
        if (node == null) return
        if (list.size <= level) {
            list[level] = mutableListOf()
        }
        list[level].add(node.`val`)
        getLevelOrderList(level + 1, node.left, list)
        getLevelOrderList(level + 1, node.right, list)
    }
}