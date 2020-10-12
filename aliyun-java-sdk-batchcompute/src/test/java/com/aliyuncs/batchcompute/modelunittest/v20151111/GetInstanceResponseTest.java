/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.batchcompute.modelunittest.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.GetInstanceResponse;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/4/16.
 */
public class GetInstanceResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        GetInstanceResponse res = new GetInstanceResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getInstance.json");

        httpResponse.setHttpContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        assertEquals(0, res.getInstance().getInstanceId());
        assertEquals("Stopped", res.getInstance().getState());
    }

    public void testGetInstanceWithUnsupportedEncoding() {

        GetInstanceResponse res = new GetInstanceResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getInstance.json");

        httpResponse.setHttpContent(body.getBytes(), "xxx", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }
    }


    @Test
    public void testGetInstanceWithIncorrectJSON() {
        GetInstanceResponse res = new GetInstanceResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"ResourceId\":\"xxxooo";

        httpResponse.setHttpContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
