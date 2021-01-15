package com.zytb999.aspira.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zytb999.aspira.domian.Article;

import java.util.List;

public interface IArticleService extends IService<Article> {

    /**
     * 根据标签id获取资讯
     *
     * @param tabsId
     * @return
     */
    List<Article> selectArticleByTabsId(int tabsId);
    /**
     * 查询热门资讯前五
     * @return
     */
    List<Article> getHotNews();

    /**
     * 获取头条接口3条
     * @return
     */
    List<Article>  getTopLine();
}
