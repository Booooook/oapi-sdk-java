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

package com.lark.oapi.service.okr.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.okr.v1.model.BatchGetOkrReq;
import com.lark.oapi.service.okr.v1.model.BatchGetOkrResp;
import com.lark.oapi.service.okr.v1.model.CreateProgressRecordReq;
import com.lark.oapi.service.okr.v1.model.CreateProgressRecordResp;
import com.lark.oapi.service.okr.v1.model.DeleteProgressRecordReq;
import com.lark.oapi.service.okr.v1.model.DeleteProgressRecordResp;
import com.lark.oapi.service.okr.v1.model.GetProgressRecordReq;
import com.lark.oapi.service.okr.v1.model.GetProgressRecordResp;
import com.lark.oapi.service.okr.v1.model.ListPeriodReq;
import com.lark.oapi.service.okr.v1.model.ListPeriodResp;
import com.lark.oapi.service.okr.v1.model.ListUserOkrReq;
import com.lark.oapi.service.okr.v1.model.ListUserOkrResp;
import com.lark.oapi.service.okr.v1.model.UpdateProgressRecordReq;
import com.lark.oapi.service.okr.v1.model.UpdateProgressRecordResp;
import com.lark.oapi.service.okr.v1.model.UploadImageReq;
import com.lark.oapi.service.okr.v1.model.UploadImageResp;

public class OkrService {

  private final Image image; // 图片
  private final Okr okr; // OKR
  private final Period period; // OKR周期
  private final ProgressRecord progressRecord; // OKR进展记录
  private final UserOkr userOkr; // 用户OKR

  public OkrService(Config config) {
    this.image = new Image(config);
    this.okr = new Okr(config);
    this.period = new Period(config);
    this.progressRecord = new ProgressRecord(config);
    this.userOkr = new UserOkr(config);
  }

  /**
   * 图片
   *
   * @return
   */
  public Image image() {
    return image;
  }

  /**
   * OKR
   *
   * @return
   */
  public Okr okr() {
    return okr;
  }

  /**
   * OKR周期
   *
   * @return
   */
  public Period period() {
    return period;
  }

  /**
   * OKR进展记录
   *
   * @return
   */
  public ProgressRecord progressRecord() {
    return progressRecord;
  }

  /**
   * 用户OKR
   *
   * @return
   */
  public UserOkr userOkr() {
    return userOkr;
  }

  public static class Image {

    private final Config config;

    public Image(Config config) {
      this.config = config;
    }

    /**
     * 上传图片，上传图片
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/image/upload">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/image/upload</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UploadImageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UploadImageSample.java</a>
     * ;
     */
    public UploadImageResp upload(UploadImageReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }
      reqOptions.setSupportUpload(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/okr/v1/images/upload"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      UploadImageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UploadImageResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 上传图片，上传图片
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/image/upload">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/image/upload</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UploadImageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UploadImageSample.java</a>
     * ;
     */
    public UploadImageResp upload(UploadImageReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();
      reqOptions.setSupportUpload(true);

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/okr/v1/images/upload"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      UploadImageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UploadImageResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Okr {

    private final Config config;

    public Okr(Config config) {
      this.config = config;
    }

    /**
     * 批量获取OKR，根据OKR id批量获取OKR
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/okr/batch_get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/okr/batch_get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/BatchGetOkrSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/BatchGetOkrSample.java</a>
     * ;
     */
    public BatchGetOkrResp batchGet(BatchGetOkrReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/okrs/batch_get"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      BatchGetOkrResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchGetOkrResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 批量获取OKR，根据OKR id批量获取OKR
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/okr/batch_get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/okr/batch_get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/BatchGetOkrSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/BatchGetOkrSample.java</a>
     * ;
     */
    public BatchGetOkrResp batchGet(BatchGetOkrReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/okrs/batch_get"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      BatchGetOkrResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchGetOkrResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Period {

    private final Config config;

    public Period(Config config) {
      this.config = config;
    }

    /**
     * 获取OKR周期列表，获取OKR周期列表
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/period/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/period/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListPeriodSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListPeriodSample.java</a>
     * ;
     */
    public ListPeriodResp list(ListPeriodReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/periods"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListPeriodResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListPeriodResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取OKR周期列表，获取OKR周期列表
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/period/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/period/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListPeriodSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListPeriodSample.java</a>
     * ;
     */
    public ListPeriodResp list(ListPeriodReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/periods"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListPeriodResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListPeriodResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class ProgressRecord {

    private final Config config;

    public ProgressRecord(Config config) {
      this.config = config;
    }

    /**
     * 创建OKR进展记录，创建OKR进展记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/CreateProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/CreateProgressRecordSample.java</a>
     * ;
     */
    public CreateProgressRecordResp create(CreateProgressRecordReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/okr/v1/progress_records"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      CreateProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 创建OKR进展记录，创建OKR进展记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/create</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/CreateProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/CreateProgressRecordSample.java</a>
     * ;
     */
    public CreateProgressRecordResp create(CreateProgressRecordReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/okr/v1/progress_records"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      CreateProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除OKR进展记录，根据ID删除OKR进展记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/DeleteProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/DeleteProgressRecordSample.java</a>
     * ;
     */
    public DeleteProgressRecordResp delete(DeleteProgressRecordReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      DeleteProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 删除OKR进展记录，根据ID删除OKR进展记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/delete</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/DeleteProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/DeleteProgressRecordSample.java</a>
     * ;
     */
    public DeleteProgressRecordResp delete(DeleteProgressRecordReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      DeleteProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取OKR进展记录，根据ID获取OKR进展记录详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/GetProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/GetProgressRecordSample.java</a>
     * ;
     */
    public GetProgressRecordResp get(GetProgressRecordReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      GetProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取OKR进展记录，根据ID获取OKR进展记录详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/get</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/GetProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/GetProgressRecordSample.java</a>
     * ;
     */
    public GetProgressRecordResp get(GetProgressRecordReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      GetProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新OKR进展记录，根据OKR进展记录ID更新进展详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/update</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UpdateProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UpdateProgressRecordSample.java</a>
     * ;
     */
    public UpdateProgressRecordResp update(UpdateProgressRecordReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      UpdateProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 更新OKR进展记录，根据OKR进展记录ID更新进展详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/progress_record/update</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UpdateProgressRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/UpdateProgressRecordSample.java</a>
     * ;
     */
    public UpdateProgressRecordResp update(UpdateProgressRecordReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/okr/v1/progress_records/:progress_id"
          , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
          , req);

      // 反序列化
      UpdateProgressRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateProgressRecordResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class UserOkr {

    private final Config config;

    public UserOkr(Config config) {
      this.config = config;
    }

    /**
     * 获取用户的OKR列表，根据用户的id获取OKR列表
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/user-okr/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/user-okr/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListUserOkrSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListUserOkrSample.java</a>
     * ;
     */
    public ListUserOkrResp list(ListUserOkrReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/users/:user_id/okrs"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListUserOkrResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserOkrResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    /**
     * 获取用户的OKR列表，根据用户的id获取OKR列表
     * <p> 使用<md-tag mode="inline" type="token-tenant">tenant_access_token</md-tag>需要额外申请权限<md-perm
     * ;href="/ssl:ttdoc/ukTMukTMukTM/uQjN3QjL0YzN04CN2cDN">以应用身份访问OKR信息</md-perm> ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/user-okr/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/okr-v1/user-okr/list</a>
     * ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListUserOkrSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/okrv1/ListUserOkrSample.java</a>
     * ;
     */
    public ListUserOkrResp list(ListUserOkrReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/okr/v1/users/:user_id/okrs"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListUserOkrResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserOkrResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

}