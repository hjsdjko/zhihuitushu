package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 论坛
 *
 * @author 
 * @email
 */
@TableName("forum")
public class ForumEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ForumEntity() {

	}

	public ForumEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 帖子标题
     */
    @TableField(value = "forum_name")

    private String forumName;


    /**
     * 读者
     */
    @TableField(value = "duzhe_id")

    private Integer duzheId;


    /**
     * 管理员
     */
    @TableField(value = "users_id")

    private Integer usersId;


    /**
     * 发布内容
     */
    @TableField(value = "forum_content")

    private String forumContent;


    /**
     * 父id
     */
    @TableField(value = "super_ids")

    private Integer superIds;


    /**
     * 帖子类型
     */
    @TableField(value = "forum_types")

    private Integer forumTypes;


    /**
     * 帖子状态
     */
    @TableField(value = "forum_state_types")

    private Integer forumStateTypes;


    /**
     * 发帖时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：帖子标题
	 */
    public String getForumName() {
        return forumName;
    }


    /**
	 * 获取：帖子标题
	 */

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }
    /**
	 * 设置：读者
	 */
    public Integer getDuzheId() {
        return duzheId;
    }


    /**
	 * 获取：读者
	 */

    public void setDuzheId(Integer duzheId) {
        this.duzheId = duzheId;
    }
    /**
	 * 设置：管理员
	 */
    public Integer getUsersId() {
        return usersId;
    }


    /**
	 * 获取：管理员
	 */

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
    /**
	 * 设置：发布内容
	 */
    public String getForumContent() {
        return forumContent;
    }


    /**
	 * 获取：发布内容
	 */

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent;
    }
    /**
	 * 设置：父id
	 */
    public Integer getSuperIds() {
        return superIds;
    }


    /**
	 * 获取：父id
	 */

    public void setSuperIds(Integer superIds) {
        this.superIds = superIds;
    }
    /**
	 * 设置：帖子类型
	 */
    public Integer getForumTypes() {
        return forumTypes;
    }


    /**
	 * 获取：帖子类型
	 */

    public void setForumTypes(Integer forumTypes) {
        this.forumTypes = forumTypes;
    }
    /**
	 * 设置：帖子状态
	 */
    public Integer getForumStateTypes() {
        return forumStateTypes;
    }


    /**
	 * 获取：帖子状态
	 */

    public void setForumStateTypes(Integer forumStateTypes) {
        this.forumStateTypes = forumStateTypes;
    }
    /**
	 * 设置：发帖时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发帖时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：修改时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：修改时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        return "Forum{" +
            "id=" + id +
            ", forumName=" + forumName +
            ", duzheId=" + duzheId +
            ", usersId=" + usersId +
            ", forumContent=" + forumContent +
            ", superIds=" + superIds +
            ", forumTypes=" + forumTypes +
            ", forumStateTypes=" + forumStateTypes +
            ", insertTime=" + insertTime +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
