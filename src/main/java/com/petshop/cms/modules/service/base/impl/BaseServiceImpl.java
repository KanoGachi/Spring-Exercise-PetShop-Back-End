package com.petshop.cms.modules.service.base.impl;

import com.petshop.cms.modules.entity.base.BasePet;
import com.petshop.cms.modules.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.modules.service.base.impl
 * @Author: LostKIKI
 * @CreateTime: 2022-04-29  15:15
 * @Description: BaseServiceImpl
 * @Version: 1.0
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService<BasePet,String> {
    // BaseDao baseDao;
    public int getPetStockCountByType(String type){
        System.out.println(type + "'s PetStockCount is " + "10000!");
        return 10000;
    }
}
