package com.oxygen.design.decorate.role;

/**
 * 角色接口
 */
public interface Role {
    /**
     * 角色名称
     * @return
     */
    String roleName();

    /**
     * 技能
     * @return
     */
    String skill();

    /**
     * 能力值
     * @return
     */
    Integer ability();

}
