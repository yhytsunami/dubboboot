package service;

import entity.Honey;

import java.util.List;

/**
 * Created By yhytsunami
 * Date: 2020/3/23
 * Time: 13:43
 * Description:
 */
public interface HoneyService {

    List<Honey> queryAll();

    Honey queryOne(String id);

    boolean insert(Honey user);
}
