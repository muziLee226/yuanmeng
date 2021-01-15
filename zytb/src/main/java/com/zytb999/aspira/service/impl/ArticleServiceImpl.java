package com.zytb999.aspira.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zytb999.aspira.domian.Article;
import com.zytb999.aspira.mapper.IArticleMapper;
import com.zytb999.aspira.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<IArticleMapper, Article> implements IArticleService {

    @Autowired
    private IArticleMapper articleMapper;

    /**
     * 根据标签id获取资讯
     *
     * @param tabsId
     * @return
     */
    @Override
    public List<Article> selectArticleByTabsId(int tabsId) {
        return articleMapper.selectArticleByTabsId(tabsId);
    }
    @Override
    public List<Article> getHotNews() {
        return articleMapper.getHotNews();
    }

    /**
     * 获取头条接口1条
     * @return
     */
    @Override
    public List<Article>  getTopLine() {
        return articleMapper.getTopLine();
    }
}
