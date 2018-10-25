//控制层
app.controller('articleController', function ($scope, $controller, articleService) {

  $controller('baseController', {$scope: $scope});//继承
  //分页
  $scope.search = function (page, size) {
    articleService.getPage(page, size).success(
        function (response) {
          $scope.list = response.rows;
          $scope.paginationConf.totalItems = response.total;//更新总记录数
        }
    );
  };

});