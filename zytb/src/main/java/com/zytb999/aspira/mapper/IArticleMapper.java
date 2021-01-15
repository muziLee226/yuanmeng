package com.zytb999.aspira.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zytb999.aspira.domian.Article;
import com.zytb999.aspira.domian.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 资讯相关接口
 */
@Mapper
public interface IArticleMapper extends BaseMapper<Article> {

    /**
     * 根据标签id获取资讯
     *
     * @param tabsId
     * @return
     */
    List<Article> selectArticleByTabsId(@Param("tabsId") int tabsId);
    /**
     * 查询热门资讯前五
     * @return
     */
    List<Article> getHotNews();
    /**
     * 获取头条接口1条
     * @return
     */
    List<Article>  getTopLine();
}