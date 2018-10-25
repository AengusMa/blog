//服务层
app.service('articleService',function($http) {
  //分页
  this.getPage=function(page,size){
    return $http.get('../article/listPage.do?page='+page+'&size='+size);
  };
});