// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.gray_test_open_sg.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.gray_test_open_sg.v1.model.CreateMotoReq;
import com.lark.oapi.service.gray_test_open_sg.v1.model.CreateMotoResp;
import com.lark.oapi.service.gray_test_open_sg.v1.model.GetMotoReq;
import com.lark.oapi.service.gray_test_open_sg.v1.model.GetMotoResp;
import com.lark.oapi.service.gray_test_open_sg.v1.model.ListMotoReq;
import com.lark.oapi.service.gray_test_open_sg.v1.model.ListMotoResp;

public class GrayTestOpenSgService {

  private final Moto moto; // moto

  public GrayTestOpenSgService(Config config) {
    this.moto = new Moto(config);
  }

  /**
   * moto
   *
   * @return
   */
  public Moto moto() {
    return moto;
  }

  public static class Moto {

    private final Config config;

    public Moto(Config config) {
      this.config = config;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/CreateMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/CreateMotoSample.java</a>
     * ;
     */
    public CreateMotoResp create(CreateMotoReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/gray_test_open_sg/v1/motos"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      CreateMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/CreateMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/CreateMotoSample.java</a>
     * ;
     */
    public CreateMotoResp create(CreateMotoReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/gray_test_open_sg/v1/motos"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      CreateMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/GetMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/GetMotoSample.java</a>
     * ;
     */
    public GetMotoResp get(GetMotoReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/gray_test_open_sg/v1/motos/:moto_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      GetMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/GetMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/GetMotoSample.java</a>
     * ;
     */
    public GetMotoResp get(GetMotoReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/gray_test_open_sg/v1/motos/:moto_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      GetMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/ListMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/ListMotoSample.java</a>
     * ;
     */
    public ListMotoResp list(ListMotoReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/gray_test_open_sg/v1/motos"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      ListMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=gray_test_open_sg&resource=moto&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=gray_test_open_sg&resource=moto&version=v1</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/ListMotoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/gray_test_open_sgv1/ListMotoSample.java</a>
     * ;
     */
    public ListMotoResp list(ListMotoReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/gray_test_open_sg/v1/motos"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      ListMotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListMotoResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

}