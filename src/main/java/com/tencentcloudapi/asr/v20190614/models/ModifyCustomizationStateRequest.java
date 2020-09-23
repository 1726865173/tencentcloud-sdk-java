/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomizationStateRequest extends AbstractModel{

    /**
    * 自学习模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 想要变换的模型状态，-1代表下线，1代表上线
    */
    @SerializedName("ToState")
    @Expose
    private Long ToState;

    /**
     * Get 自学习模型ID 
     * @return ModelId 自学习模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 自学习模型ID
     * @param ModelId 自学习模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 想要变换的模型状态，-1代表下线，1代表上线 
     * @return ToState 想要变换的模型状态，-1代表下线，1代表上线
     */
    public Long getToState() {
        return this.ToState;
    }

    /**
     * Set 想要变换的模型状态，-1代表下线，1代表上线
     * @param ToState 想要变换的模型状态，-1代表下线，1代表上线
     */
    public void setToState(Long ToState) {
        this.ToState = ToState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ToState", this.ToState);

    }
}

