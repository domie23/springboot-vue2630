package com.dao;

import com.entity.ZizhumingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhumingdanView;

/**
 * 资助名单 Dao 接口
 *
 * @author 
 */
public interface ZizhumingdanDao extends BaseMapper<ZizhumingdanEntity> {

   List<ZizhumingdanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
