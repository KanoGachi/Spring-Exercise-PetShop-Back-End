package com.petshop.cms.modules.service.base;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.modules.service.base
 * @Author: LostKIKI
 * @CreateTime: 2022-04-29  15:14
 * @Description: BaseService
 * @Version: 1.0
 */
public interface BaseService<T,ID> {
    public int getPetStockCountByType(ID type);
}

