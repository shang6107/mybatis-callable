package com.test.ssm.service;

import java.util.List;

/**
 * @author 上官炳强
 * @description
 * @since 2018-07-04 / 08:42:16
 */
public interface TestService {

    void onceCall(String dbNames);

    void oneMoreTimeCall(List<String> dbNames);

}
