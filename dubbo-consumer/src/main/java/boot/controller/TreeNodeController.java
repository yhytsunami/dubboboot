package boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.Honey;
import entity.TreeNode;
import org.springframework.web.bind.annotation.*;
import service.TreeNodeService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created By yhytsunami
 * Date: 2020/6/7
 * Time: 11:12
 * Description:
 */
@RestController
@RequestMapping("/tree")
@CrossOrigin
public class TreeNodeController  {

    @Reference
    private TreeNodeService treeNodeService;

    @RequestMapping("/queryTree")
    public String queryTree(){
        return treeNodeService.JsonTree();
    }

    @RequestMapping("/insert")
    public TreeNode insertNode(@RequestBody TreeNode node, HttpServletRequest request){
        String insert = treeNodeService.insert(node);
        node.setId(insert);
        return node;
    }

    @RequestMapping("/delete")
    public int deleteNode(@RequestBody TreeNode node, HttpServletRequest request){
        return treeNodeService.deleteNode(node.getId());
    }
}
