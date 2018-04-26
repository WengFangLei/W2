package org.tis.tools.abf.module.ac.service;

import org.tis.tools.abf.module.ac.entity.AcRole;
import com.baomidou.mybatisplus.service.IService;
import org.tis.tools.abf.module.om.exception.OrgManagementException;

/**
 * acRole的Service接口类
 * 
 * @author Auto Generate Tools
 * @date 2018/04/23
 */
public interface IAcRoleService extends IService<AcRole>  {
    /**
     * <pre>
     * 新建一个角色
     *
     * 说明：
     *
     * </pre>
     *
     * @param rolecode
     *            角色代码
     * @param rolename
     *            角色名称
     * @param guidapp
     *            隶属应用
     * @param enabled
     *            是否启用
     *
     * @return 角色信息
     * @throws OrgManagementException
     */
    AcRole add(String rolecode,String rolename,String guidapp,String enabled);

}

