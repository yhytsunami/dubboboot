package boot.impl;

import boot.mybatis.entity.TreeVo;
import boot.mybatis.mapper.TreeNodeMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import entity.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import service.TreeNodeService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/6/6
 * Time: 23:29
 * Description:
 */
@Service
public class TreeNodeServiceImpl implements TreeNodeService {

    @Autowired
    private TreeNodeMapper mapper;

    @Override
    public String insert(TreeNode node) {
         mapper.insert(node);
         return node.getId();
    }

    @Override
    public String JsonTree() {
        List<TreeNode> treeNodes = mapper.queryChildren("0");
        iteratorQueryChildren(treeNodes);
        return JSONArray.toJSONString(treeNodes);
    }

    public void iteratorQueryChildren(List<TreeNode> treeNodes){
        if (CollectionUtils.isEmpty(treeNodes)){
            return;
        }
        for (TreeNode node: treeNodes) {
            List<TreeNode> children = mapper.queryChildren(node.getId());
            node.setChildren(children);
            iteratorQueryChildren(children);
        }
    }

    @Override
    public int deleteNode(String id) {
        return mapper.deleteNode(id);
    }
}
