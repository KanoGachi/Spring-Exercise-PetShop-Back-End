package com.petshop.cms.modules.dao;

import com.petshop.cms.modules.entity.base.BasePet;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.modules.dao
 * @Author: LostKIKI
 * @CreateTime: 2022-05-06  11:11
 * @Description: BaseDao
 * @Version: 1.0
 */
@Mapper
public interface BaseDao {
    public Integer getStock(BasePet pet);
}
