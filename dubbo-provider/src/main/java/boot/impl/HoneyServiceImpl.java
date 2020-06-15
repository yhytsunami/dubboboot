package boot.impl;

import boot.mybatis.mapper.HoneyMapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.Honey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.HoneyService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/3/23
 * Time: 13:46
 * Description:
 */
@Service//dubbo暴露服务
@Component//spring管理
public class HoneyServiceImpl implements HoneyService {

    @Autowired
    HoneyMapper honeyMapper;

    @Override
    public List<Honey> queryAll() {
        return honeyMapper.queryAll();
    }

    @Override
    public Honey queryOne(String id) {
        return honeyMapper.queryOne(id);
    }

    @Override
    public boolean insert(Honey honey) {
        return honeyMapper.insert(honey) > 0;
    }
}
