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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventTypesResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventTypesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventTypesResponseUnmarshaller {

	public static DescribeSuspEventTypesResponse unmarshall(DescribeSuspEventTypesResponse describeSuspEventTypesResponse, UnmarshallerContext context) {
		
		describeSuspEventTypesResponse.setRequestId(context.stringValue("DescribeSuspEventTypesResponse.RequestId"));
		describeSuspEventTypesResponse.setTotalCount(context.integerValue("DescribeSuspEventTypesResponse.TotalCount"));

		List<Data> eventTypes = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeSuspEventTypesResponse.EventTypes.Length"); i++) {
			Data data = new Data();
			data.setAliseEventType(context.stringValue("DescribeSuspEventTypesResponse.EventTypes["+ i +"].AliseEventType"));
			data.setEventType(context.stringValue("DescribeSuspEventTypesResponse.EventTypes["+ i +"].EventType"));

			eventTypes.add(data);
		}
		describeSuspEventTypesResponse.setEventTypes(eventTypes);
	 
	 	return describeSuspEventTypesResponse;
	}
}