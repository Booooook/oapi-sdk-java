// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class FileUploadPrepareResult {
    @SerializedName("upload_id")
    private String uploadId;
    @SerializedName("block_size")
    private Integer blockSize;
    @SerializedName("block_num")
    private Integer blockNum;

    public String getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getBlockSize() {
        return this.blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Integer getBlockNum() {
        return this.blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

}
