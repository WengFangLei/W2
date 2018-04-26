package org.tis.tools.abf.module.ac.service.impl;

import org.tis.tools.abf.module.ac.entity.AcRole;
import org.tis.tools.abf.module.ac.dao.AcRoleMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.tis.tools.abf.module.ac.service.IAcRoleService;

/**
 * acRole的Service接口实现类
 * 
 * @author Auto Generate Tools
 * @date 2018/04/23
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AcRoleServiceImpl extends ServiceImpl<AcRoleMapper, AcRole> implements IAcRoleService {
    @Override
    public AcRole add(String rolecode, String rolename, String guidapp, String enabled) {
        AcRole acrole = new AcRole();
        acrole.setRoleCode(rolecode);
        acrole.setRoleName(rolename);
        acrole.setGuidApp(guidapp);
        acrole.setEnable(enabled);
        insert(acrole);
        return acrole;
    }
}

