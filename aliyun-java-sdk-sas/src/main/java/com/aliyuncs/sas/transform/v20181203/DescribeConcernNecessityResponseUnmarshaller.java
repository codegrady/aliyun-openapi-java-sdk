/*
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
 */

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeConcernNecessityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConcernNecessityResponseUnmarshaller {

	public static DescribeConcernNecessityResponse unmarshall(DescribeConcernNecessityResponse describeConcernNecessityResponse, UnmarshallerContext _ctx) {
		
		describeConcernNecessityResponse.setRequestId(_ctx.stringValue("DescribeConcernNecessityResponse.RequestId"));

		List<String> concernNecessity = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConcernNecessityResponse.ConcernNecessity.Length"); i++) {
			concernNecessity.add(_ctx.stringValue("DescribeConcernNecessityResponse.ConcernNecessity["+ i +"]"));
		}
		describeConcernNecessityResponse.setConcernNecessity(concernNecessity);
	 
	 	return describeConcernNecessityResponse;
	}
}