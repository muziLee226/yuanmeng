package com.zytb999.aspira.util;

import lombok.Getter;

import java.util.List;

@Getter
public class PageResult<T> {

    private int currentPage; // 用户传入请求
    private int pageSize;    // 用户传入请求
    private int totalCount;  // 数据库得到
    private List<T> data;    // 数据库得到


    private int totalPage;  // 总  页
    private int prevPage;   // 上一页
    private int nextPage;   // 下一页

    public PageResult(int currentPage, int pageSize, int totalCount, List<T> data) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.data = data;


        if(this.totalCount <= this.pageSize) {
            this.totalPage = 1;
            this.prevPage = 1;
            this.nextPage = 1;
            return;
        }

        this.totalPage = this.totalCount % this.pageSize == 0
                ? this.totalCount / this.pageSize
                : this.totalCount / this.pageSize + 1;

        this.prevPage = this.currentPage - 1 >= 1 ? this.currentPage - 1 : 1;

        this.nextPage = this.currentPage + 1 <= this.totalPage ? this.currentPage + 1 : this.totalPage;
    }
}
