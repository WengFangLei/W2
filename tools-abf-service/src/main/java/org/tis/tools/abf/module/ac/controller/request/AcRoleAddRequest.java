package org.tis.tools.abf.module.ac.controller.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;
import org.tis.tools.core.entity.request.RestRequest;
@Data
@EqualsAndHashCode(callSuper = false)
public class AcRoleAddRequest extends RestRequest {
    @NotBlank(message = "角色代码不能为空")
    private String rolecode;

    @NotBlank(message = "角色名称不能为空")
    private String rolename;

    @NotBlank(message = "隶属应用不能为空")
    private String guidapp;

    @NotBlank(message = "是否启用不能为空")
    private String enabled;


}
