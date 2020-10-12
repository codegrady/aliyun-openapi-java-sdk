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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.RecognizeFaceQualityResponse;
import com.aliyuncs.vcs.model.v20200515.RecognizeFaceQualityResponse.Data;
import com.aliyuncs.vcs.model.v20200515.RecognizeFaceQualityResponse.Data.Attributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFaceQualityResponseUnmarshaller {

	public static RecognizeFaceQualityResponse unmarshall(RecognizeFaceQualityResponse recognizeFaceQualityResponse, UnmarshallerContext _ctx) {
		
		recognizeFaceQualityResponse.setRequestId(_ctx.stringValue("RecognizeFaceQualityResponse.RequestId"));
		recognizeFaceQualityResponse.setCode(_ctx.stringValue("RecognizeFaceQualityResponse.Code"));
		recognizeFaceQualityResponse.setMessage(_ctx.stringValue("RecognizeFaceQualityResponse.Message"));

		Data data = new Data();
		data.setQualityScore(_ctx.stringValue("RecognizeFaceQualityResponse.Data.QualityScore"));
		data.setDescription(_ctx.stringValue("RecognizeFaceQualityResponse.Data.Description"));

		Attributes attributes = new Attributes();
		attributes.setLeftTopX(_ctx.integerValue("RecognizeFaceQualityResponse.Data.Attributes.LeftTopX"));
		attributes.setLeftTopY(_ctx.integerValue("RecognizeFaceQualityResponse.Data.Attributes.LeftTopY"));
		attributes.setRightBottomX(_ctx.integerValue("RecognizeFaceQualityResponse.Data.Attributes.RightBottomX"));
		attributes.setRightBottomY(_ctx.integerValue("RecognizeFaceQualityResponse.Data.Attributes.RightBottomY"));
		attributes.setTargetImageStoragePath(_ctx.stringValue("RecognizeFaceQualityResponse.Data.Attributes.TargetImageStoragePath"));
		attributes.setFaceStyle(_ctx.stringValue("RecognizeFaceQualityResponse.Data.Attributes.FaceStyle"));
		attributes.setFaceQuality(_ctx.stringValue("RecognizeFaceQualityResponse.Data.Attributes.FaceQuality"));
		attributes.setFaceScore(_ctx.stringValue("RecognizeFaceQualityResponse.Data.Attributes.FaceScore"));
		data.setAttributes(attributes);
		recognizeFaceQualityResponse.setData(data);
	 
	 	return recognizeFaceQualityResponse;
	}
}