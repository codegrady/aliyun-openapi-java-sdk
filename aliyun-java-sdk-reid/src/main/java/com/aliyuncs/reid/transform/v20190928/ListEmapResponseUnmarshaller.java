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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.ListEmapResponse;
import com.aliyuncs.reid.model.v20190928.ListEmapResponse.OpenEmap;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmapResponseUnmarshaller {

	public static ListEmapResponse unmarshall(ListEmapResponse listEmapResponse, UnmarshallerContext _ctx) {
		
		listEmapResponse.setRequestId(_ctx.stringValue("ListEmapResponse.RequestId"));
		listEmapResponse.setErrorCode(_ctx.stringValue("ListEmapResponse.ErrorCode"));
		listEmapResponse.setErrorMessage(_ctx.stringValue("ListEmapResponse.ErrorMessage"));
		listEmapResponse.setSuccess(_ctx.booleanValue("ListEmapResponse.Success"));

		List<OpenEmap> openEmaps = new ArrayList<OpenEmap>();
		for (int i = 0; i < _ctx.lengthValue("ListEmapResponse.OpenEmaps.Length"); i++) {
			OpenEmap openEmap = new OpenEmap();
			openEmap.setLocationId(_ctx.stringValue("ListEmapResponse.OpenEmaps["+ i +"].LocationId"));
			openEmap.setEmapId(_ctx.stringValue("ListEmapResponse.OpenEmaps["+ i +"].EmapId"));
			openEmap.setName(_ctx.stringValue("ListEmapResponse.OpenEmaps["+ i +"].Name"));
			openEmap.setEmapUrl(_ctx.stringValue("ListEmapResponse.OpenEmaps["+ i +"].EmapUrl"));

			openEmaps.add(openEmap);
		}
		listEmapResponse.setOpenEmaps(openEmaps);
	 
	 	return listEmapResponse;
	}
}