package com.example.androidwebservices.utils.get;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/androidwebservices/utils/get/NewsService;", "", "getNews", "Lretrofit2/Response;", "Lcom/example/androidwebservices/datas/get/NewsList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsTopHeadline", "app_debug"})
public abstract interface NewsService {
    
    @retrofit2.http.GET(value = "v2/everything?q=tesla&from=2023-06-13&sortBy=publishedAt&apiKey=c5a974d6ae66438b8d8ea823cfa26549")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.androidwebservices.datas.get.NewsList>> $completion);
    
    @retrofit2.http.GET(value = "v2/top-headlines?country=us&category=business&apiKey=c5a974d6ae66438b8d8ea823cfa26549")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsTopHeadline(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.androidwebservices.datas.get.NewsList>> $completion);
}