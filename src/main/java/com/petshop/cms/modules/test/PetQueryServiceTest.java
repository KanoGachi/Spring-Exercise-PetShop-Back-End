package com.petshop.cms.modules.test;

import com.petshop.cms.modules.service.base.BaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.modules.test
 * @Author: LostKIKI
 * @CreateTime: 2022-04-29  11:31
 * @Description: PetQueryServiceTest
 * @Version: 1.0
 */
public class PetQueryServiceTest {
    public static void main(String[] args) {
        String xpath = "applicationContext.xml";
        ApplicationContext context =
                new ClassPathXmlApplicationContext(xpath);
        BaseService baseService =
                (BaseService) context.getBean("baseService");
        baseService.getPetStockCountByType("doge");
    }
}
