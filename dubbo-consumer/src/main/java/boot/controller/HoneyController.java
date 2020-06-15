package boot.controller;

import boot.business.QueryUserInfo;
import entity.Honey;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;

/**
 * Created By yhytsunami
 * Date: 2020/3/23
 * Time: 14:01
 * Description:
 */
@RestController
@CrossOrigin
public class HoneyController {

    @Resource
    private QueryUserInfo query;

    @RequestMapping("/honeyList")
    public List<Honey> getUsersInfo(){
        return query.queryHoneis();
    }

    @RequestMapping("/honeyDetail")
    public Honey queryHoney(String id ){
        return query.queryHoneyById(id);
    }

    @RequestMapping("/insert")
    public boolean insertHoney(@RequestBody Honey honey, HttpServletRequest request){
        String info = request.getParameter("info");
        Enumeration<String> parameterNames = request.getParameterNames();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        honey.setId(uuid);
        return query.insert(honey);
    }
}
