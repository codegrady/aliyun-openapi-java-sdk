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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitSnapshotJobResponseUnmarshaller {

	public static SubmitSnapshotJobResponse unmarshall(SubmitSnapshotJobResponse submitSnapshotJobResponse, UnmarshallerContext _ctx) {
		
		submitSnapshotJobResponse.setRequestId(_ctx.stringValue("SubmitSnapshotJobResponse.RequestId"));

		SnapshotJob snapshotJob = new SnapshotJob();
		snapshotJob.setId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Id"));
		snapshotJob.setUserData(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.UserData"));
		snapshotJob.setPipelineId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.PipelineId"));
		snapshotJob.setState(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.State"));
		snapshotJob.setCode(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Code"));
		snapshotJob.setCount(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Count"));
		snapshotJob.setTileCount(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.TileCount"));
		snapshotJob.setMessage(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Message"));
		snapshotJob.setCreationTime(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.CreationTime"));

		Input input = new Input();
		input.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Bucket"));
		input.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Location"));
		input.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Object"));
		input.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.RoleArn"));
		snapshotJob.setInput(input);

		SnapshotConfig snapshotConfig = new SnapshotConfig();
		snapshotConfig.setTime(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Time"));
		snapshotConfig.setInterval(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Interval"));
		snapshotConfig.setNum(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Num"));
		snapshotConfig.setWidth(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Width"));
		snapshotConfig.setHeight(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Height"));
		snapshotConfig.setFrameType(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.FrameType"));

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Bucket"));
		outputFile.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Location"));
		outputFile.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Object"));
		outputFile.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.RoleArn"));
		snapshotConfig.setOutputFile(outputFile);

		TileOutputFile tileOutputFile = new TileOutputFile();
		tileOutputFile.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Bucket"));
		tileOutputFile.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Location"));
		tileOutputFile.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Object"));
		tileOutputFile.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.RoleArn"));
		snapshotConfig.setTileOutputFile(tileOutputFile);

		TileOut tileOut = new TileOut();
		tileOut.setLines(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Lines"));
		tileOut.setColumns(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Columns"));
		tileOut.setCellWidth(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellWidth"));
		tileOut.setCellHeight(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellHeight"));
		tileOut.setMargin(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Margin"));
		tileOut.setPadding(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Padding"));
		tileOut.setColor(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Color"));
		tileOut.setIsKeepCellPic(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.IsKeepCellPic"));
		tileOut.setCellSelStep(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellSelStep"));
		snapshotConfig.setTileOut(tileOut);
		snapshotJob.setSnapshotConfig(snapshotConfig);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorCode"));
		snapshotJob.setMNSMessageResult(mNSMessageResult);
		submitSnapshotJobResponse.setSnapshotJob(snapshotJob);
	 
	 	return submitSnapshotJobResponse;
	}
}