// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class ChatCustomBotCreateResult {
    @SerializedName("bot_id")
    private Long botId;
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("avatar_key")
    private String avatarKey;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("i18n_names")
    private I18nNames iQXnNames;
    @SerializedName("i18n_descriptions")
    private I18nNames iQXnDescriptions;
    @SerializedName("webhook")
    private String webhook;
    @SerializedName("allow_ips")
    private String[] allowIps;
    @SerializedName("key_words")
    private String[] keyWords;
    @SerializedName("signature_status")
    private Boolean signatureStatus;
    @SerializedName("signature")
    private String signature;
    @SerializedName("enable")
    private Boolean enable;
    @SerializedName("invitor_id")
    private Long invitorId;
    @SerializedName("invitor_id_type")
    private String invitorIdType;
    @SerializedName("version")
    private Long version;

    public Long getBotId() {
        return this.botId;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public void setAvatarKey(String avatarKey) {
        this.avatarKey = avatarKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public I18nNames getI18nNames() {
        return this.iQXnNames;
    }

    public void setI18nNames(I18nNames iQXnNames) {
        this.iQXnNames = iQXnNames;
    }

    public I18nNames getI18nDescriptions() {
        return this.iQXnDescriptions;
    }

    public void setI18nDescriptions(I18nNames iQXnDescriptions) {
        this.iQXnDescriptions = iQXnDescriptions;
    }

    public String getWebhook() {
        return this.webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public String[] getAllowIps() {
        return this.allowIps;
    }

    public void setAllowIps(String[] allowIps) {
        this.allowIps = allowIps;
    }

    public String[] getKeyWords() {
        return this.keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }

    public Boolean getSignatureStatus() {
        return this.signatureStatus;
    }

    public void setSignatureStatus(Boolean signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Long getInvitorId() {
        return this.invitorId;
    }

    public void setInvitorId(Long invitorId) {
        this.invitorId = invitorId;
    }

    public String getInvitorIdType() {
        return this.invitorIdType;
    }

    public void setInvitorIdType(String invitorIdType) {
        this.invitorIdType = invitorIdType;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

}
