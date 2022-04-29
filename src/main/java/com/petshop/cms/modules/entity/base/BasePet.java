package com.petshop.cms.modules.entity.base;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.modules.entity.base
 * @Author: LostKIKI
 * @CreateTime: 2022-04-29  14:59
 * @Description: BasePet
 * @Version: 1.0
 */
public class BasePet {
    private int id;
    private String name;
    private String type;
    private String buyTime;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getBuyTime() { return buyTime; }

    public void setBuyTime(String buyTime) { this.buyTime = buyTime; }
}
