package boot.mybatis.mapper;

import boot.mybatis.entity.User;
import entity.Honey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/3/30
 * Time: 23:28
 * Description:
 */
@Repository
public interface HoneyMapper {

    List<Honey> queryAll();

    Honey queryOne(String id);

    int insert(Honey user);
}
