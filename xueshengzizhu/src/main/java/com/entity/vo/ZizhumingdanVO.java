package com.entity.vo;

import com.entity.ZizhumingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资助名单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zizhumingdan")
public class ZizhumingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 家庭
     */

    @TableField(value = "jiatingjingji_id")
    private Integer jiatingjingjiId;


    /**
     * 发放资金
     */

    @TableField(value = "zizhumingdan_money")
    private Double zizhumingdanMoney;


    /**
     * 资助详情
     */

    @TableField(value = "zizhumingdan_content")
    private String zizhumingdanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：家庭
	 */
    public Integer getJiatingjingjiId() {
        return jiatingjingjiId;
    }


    /**
	 * 获取：家庭
	 */

    public void setJiatingjingjiId(Integer jiatingjingjiId) {
        this.jiatingjingjiId = jiatingjingjiId;
    }
    /**
	 * 设置：发放资金
	 */
    public Double getZizhumingdanMoney() {
        return zizhumingdanMoney;
    }


    /**
	 * 获取：发放资金
	 */

    public void setZizhumingdanMoney(Double zizhumingdanMoney) {
        this.zizhumingdanMoney = zizhumingdanMoney;
    }
    /**
	 * 设置：资助详情
	 */
    public String getZizhumingdanContent() {
        return zizhumingdanContent;
    }


    /**
	 * 获取：资助详情
	 */

    public void setZizhumingdanContent(String zizhumingdanContent) {
        this.zizhumingdanContent = zizhumingdanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
