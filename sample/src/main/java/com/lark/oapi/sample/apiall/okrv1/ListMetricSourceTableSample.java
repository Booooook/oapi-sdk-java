package com.lark.oapi.sample.apiall.okrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.okr.v1.model.ListMetricSourceTableReq;
import com.lark.oapi.service.okr.v1.model.ListMetricSourceTableResp;

// GET /open-apis/okr/v1/metric_sources/:metric_source_id/tables
public class ListMetricSourceTableSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListMetricSourceTableReq req = ListMetricSourceTableReq.newBuilder()
                .metricSourceId("7041857032248410131")
                .pageToken("6969864184272078374")
                .pageSize("10")
                .build();

        // 发起请求
        ListMetricSourceTableResp resp = client.okr().metricSourceTable().list(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
