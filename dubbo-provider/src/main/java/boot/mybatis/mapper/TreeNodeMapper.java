package boot.mybatis.mapper;

import entity.TreeNode;

import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/6/6
 * Time: 22:55
 * Description:
 */
public interface TreeNodeMapper {

    public int insert(TreeNode node);

    public List<TreeNode> queryChildren(String parentId);

    public int deleteNode(String id);
}
