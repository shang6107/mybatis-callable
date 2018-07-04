package com.test.ssm.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 上官炳强
 * @description
 * @since 2018-07-04 / 08:41:29
 */
public interface CommonDao {

    void onceCall(@Param("dbName") String dbName);

    void oneMoreTimeCall(List<String> dbName);

}
