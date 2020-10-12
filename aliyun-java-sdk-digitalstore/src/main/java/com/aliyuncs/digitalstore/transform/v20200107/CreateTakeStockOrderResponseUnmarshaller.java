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

package com.aliyuncs.digitalstore.transform.v20200107;

import com.aliyuncs.digitalstore.model.v20200107.CreateTakeStockOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTakeStockOrderResponseUnmarshaller {

	public static CreateTakeStockOrderResponse unmarshall(CreateTakeStockOrderResponse createTakeStockOrderResponse, UnmarshallerContext _ctx) {
		
		createTakeStockOrderResponse.setRequestId(_ctx.stringValue("CreateTakeStockOrderResponse.RequestId"));
		createTakeStockOrderResponse.setOrderId(_ctx.stringValue("CreateTakeStockOrderResponse.OrderId"));
		createTakeStockOrderResponse.setSuccess(_ctx.booleanValue("CreateTakeStockOrderResponse.Success"));
	 
	 	return createTakeStockOrderResponse;
	}
}