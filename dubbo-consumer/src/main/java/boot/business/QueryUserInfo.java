package boot.business;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.Honey;
import org.springframework.stereotype.Service;
import service.HoneyService;

import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/3/23
 * Time: 13:55
 * Description:
 */
@Service
public class QueryUserInfo {
    @Reference
    private HoneyService honeyService;

    public List<Honey> queryHoneis(){
        return honeyService.queryAll();
    }

    public Honey queryHoneyById(String id){ return honeyService.queryOne(id);}

    public boolean insert(Honey honey){return honeyService.insert(honey);}
}
