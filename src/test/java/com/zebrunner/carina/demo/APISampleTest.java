/*******************************************************************************
 * Copyright 2020-2023 Zebrunner Inc (https://www.zebrunner.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.zebrunner.carina.demo;

import java.lang.invoke.MethodHandles;
import java.lang.module.Configuration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.api.GetTestCases;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;


/**
 * This sample shows how create REST API tests.
 *
 * @author qpsdemo
 */
public class APISampleTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Test()
    @MethodOwner(owner = "dviarokha")
    public void getListTestCases() {
        GetTestCases getListTestCases = new GetTestCases();
        getListTestCases.setHeaders("Authorization", "Basic ZGFyeWE6clNSMjdydmZFcFlsQ3RSZ1lITnpwaUxjdXBGeENMOHdzRm44Rmp4d1dkNFZXRFR6dUI=");
        getListTestCases.callAPIExpectSuccess();
        getListTestCases.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "dviarokha")
    public void getTestCasesById() {
        GetTestCases getTestCasesById = new GetTestCases();
        getTestCasesById.setHeaders("Authorization", "Basic ZGFyeWE6clNSMjdydmZFcFlsQ3RSZ1lITnpwaUxjdXBGeENMOHdzRm44Rmp4d1dkNFZXRFR6dUI=");
        getTestCasesById.callAPIExpectSuccess();
        getTestCasesById.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }



}
