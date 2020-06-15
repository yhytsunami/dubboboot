package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/6/6
 * Time: 22:56
 * Description:
 */
public class TreeNode implements Serializable {
    private String label;
    private String id;
    private String parentId;

    private List<TreeNode> children;
    public String getLabel() {
        return label;
    }

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "label='" + label + '\'' +
                ", id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", children=" + children +
                '}';
    }
}
