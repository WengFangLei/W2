package org.tis.tools.abf.module.sys.controller;

import org.tis.tools.abf.module.sys.service.ISysDictItemService;
import org.springframework.validation.annotation.Validated;
import org.tis.tools.core.web.controller.BaseController;
import org.tis.tools.core.web.vo.SmartPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.abf.module.sys.entity.SysDictItem;
import org.springframework.web.bind.annotation.*;
import org.hibernate.validator.constraints.NotBlank;
import org.tis.tools.core.web.vo.ResultVO;

/**
 * sysDictItem的Controller类
 * 
 * @author Auto Generate Tools
 * @date 2018/04/23
 */
@RestController
@RequestMapping("/sysDictItem")
public class SysDictItemController extends BaseController<SysDictItem>  {

    @Autowired
    private ISysDictItemService sysDictItemService;

    @PostMapping("/add")
    public ResultVO add(@RequestBody @Validated SysDictItem sysDictItem) {
        sysDictItemService.insert(sysDictItem);
        return ResultVO.success("新增成功！");
    }
    
    @PutMapping
    public ResultVO update(@RequestBody @Validated SysDictItem sysDictItem) {
        sysDictItemService.updateById(sysDictItem);
        return ResultVO.success("修改成功！");
    }
    
    @DeleteMapping("/{id}")
    public ResultVO delete(@PathVariable @NotBlank(message = "id不能为空") String id) {
        sysDictItemService.deleteById(id);
        return ResultVO.success("删除成功");
    }
    
    @GetMapping("/{id}")
    public ResultVO detail(@PathVariable @NotBlank(message = "id不能为空") String id) {
        SysDictItem sysDictItem = sysDictItemService.selectById(id);
        if (sysDictItemService == null) {
            return ResultVO.error("404", "找不到对应记录或已经被删除！");
        }
        return ResultVO.success("查询成功", sysDictItem);
    }
    
    @PostMapping("/list")
    public ResultVO list(@RequestBody @Validated SmartPage<SysDictItem> page) {
        return  ResultVO.success("查询成功", sysDictItemService.selectPage(getPage(page), getCondition(page)));
    }
    
}

