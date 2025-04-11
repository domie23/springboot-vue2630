package com.dao;

import com.entity.XueshengjianhurenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjianhurenView;

/**
 * 学生监护人 Dao 接口
 *
 * @author 
 */
public interface XueshengjianhurenDao extends BaseMapper<XueshengjianhurenEntity> {

   List<XueshengjianhurenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
