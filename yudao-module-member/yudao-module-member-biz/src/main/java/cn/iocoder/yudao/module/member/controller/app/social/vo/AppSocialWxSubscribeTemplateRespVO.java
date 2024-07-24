package cn.iocoder.yudao.module.member.controller.app.social.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "用户 APP - 获得小程序订阅模版 Response VO")
@Data
public class AppSocialWxSubscribeTemplateRespVO {

    @Schema(description = "添加至账号下的模板 id，发送小程序订阅消息时所需", requiredMode = Schema.RequiredMode.REQUIRED, example = "9Aw5ZV1j9xdWTFEkqCpZ7mIBbSC34khK55OtzUPl0rU")
    private String priTmplId;

    @Schema(description = "模版标题", requiredMode = Schema.RequiredMode.REQUIRED, example = "订单支付通知")
    private String title;

    @Schema(description = "模版内容", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;

    @Schema(description = "模板内容示例", requiredMode = Schema.RequiredMode.REQUIRED, example = "下单时间:2016年8月8日")
    private String example;

    @Schema(description = "模版类型，2 为一次性订阅，3 为长期订阅", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    private Integer type;

}