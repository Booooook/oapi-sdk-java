// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.google.gson.annotations.SerializedName;

public class CalendarAclListResult {
    @SerializedName("acls")
    private CalendarAcl[] acls;
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("page_token")
    private String pageToken;

    public CalendarAcl[] getAcls() {
        return this.acls;
    }

    public void setAcls(CalendarAcl[] acls) {
        this.acls = acls;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

}
