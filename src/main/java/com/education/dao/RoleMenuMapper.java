package com.education.dao;

import com.education.pojo.RoleMenuKey;

public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(RoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insert(RoleMenuKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insertSelective(RoleMenuKey record);
}