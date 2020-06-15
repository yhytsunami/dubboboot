package service;

import entity.TreeNode;

/**
 * Created By yhytsunami
 * Date: 2020/6/6
 * Time: 23:27
 * Description:
 */
public interface TreeNodeService {

    public String insert(TreeNode node);

    public String JsonTree();

    public int deleteNode(String id);
}
