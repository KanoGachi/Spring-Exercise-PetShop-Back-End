package test.modules.dao;

import com.petshop.cms.modules.dao.BaseDao;
import com.petshop.cms.modules.entity.base.BasePet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: test.modules.dao
 * @Author: LostKIKI
 * @CreateTime: 2022-05-07  09:16
 * @Description: BaseDaoTest
 * @Version: 1.0
 */
public class BaseDaoTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseDao baseDao = (BaseDao) context.getBean("baseDao");
        BasePet queryPet = new BasePet();
        queryPet.setId(1);
        queryPet.setType("doge");
        System.out.println(queryPet.toString());
        System.out.println(baseDao.getStock(queryPet));
    }
}
