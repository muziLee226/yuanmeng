package com.zytb999.aspira.controller;

import com.zytb999.aspira.domian.Article;
import com.zytb999.aspira.service.IArticleService;
import com.zytb999.aspira.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
   @Autowired
    private IArticleService articleService;
   //根据标签id获取资讯
   @GetMapping("getExamNews")
    public JsonResult getExamNews(int tabsId){
       List<Article> articles = articleService.selectArticleByTabsId(tabsId);
       return  JsonResult.success(articles);
   }

    @GetMapping("getHotNews")
    public JsonResult getHotNews(){
        List<Article> articles = articleService.getHotNews();
        return  JsonResult.success(articles);
    }
}
