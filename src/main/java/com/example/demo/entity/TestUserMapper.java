package com.example.demo.entity;

import com.example.demo.entity.TestUser;

public interface TestUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String testuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    int insert(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    int insertSelective(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    TestUser selectByPrimaryKey(String testuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_USER
     *
     * @mbg.generated Fri Dec 27 21:34:21 GMT+08:00 2019
     */
    int updateByPrimaryKey(TestUser record);
}