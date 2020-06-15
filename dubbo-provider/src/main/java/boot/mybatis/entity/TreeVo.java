package boot.mybatis.entity;

import java.awt.*;
import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/6/6
 * Time: 23:35
 * Description:
 */
public class TreeVo {
    private String label;

    private String id;

    private List<TreeVo> children;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<TreeVo> children) {
        this.children = children;
    }
}
