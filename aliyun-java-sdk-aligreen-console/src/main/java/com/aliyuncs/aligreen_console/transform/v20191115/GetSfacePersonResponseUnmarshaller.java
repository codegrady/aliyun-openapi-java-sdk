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

package com.aliyuncs.aligreen_console.transform.v20191115;

import com.aliyuncs.aligreen_console.model.v20191115.GetSfacePersonResponse;
import com.aliyuncs.aligreen_console.model.v20191115.GetSfacePersonResponse.Person;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSfacePersonResponseUnmarshaller {

	public static GetSfacePersonResponse unmarshall(GetSfacePersonResponse getSfacePersonResponse, UnmarshallerContext _ctx) {
		
		getSfacePersonResponse.setRequestId(_ctx.stringValue("GetSfacePersonResponse.RequestId"));

		Person person = new Person();
		person.setPersonId(_ctx.stringValue("GetSfacePersonResponse.Person.PersonId"));
		person.setPersonName(_ctx.stringValue("GetSfacePersonResponse.Person.PersonName"));
		person.setPersonGender(_ctx.stringValue("GetSfacePersonResponse.Person.PersonGender"));
		person.setPersonType(_ctx.stringValue("GetSfacePersonResponse.Person.PersonType"));
		getSfacePersonResponse.setPerson(person);
	 
	 	return getSfacePersonResponse;
	}
}