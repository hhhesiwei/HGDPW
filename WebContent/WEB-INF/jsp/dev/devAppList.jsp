<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="devTop.jsp" %>
	  <div class="right_col" role="main">
	  	  <div class="page-title">
              <div class="title_left">
                <h3>当前登录信息：${loginUser.devName }</h3>
              </div>
              </div>
              <div class="clearfix"></div>
            <div class="row">
              	<!-- 复制 -->
              	<div class="col-md-12 col-xs-12 col-sm-12">
              	<form action="${pageContext.request.contextPath }/dev/getAppInfoList" method="get" class="form-horizontal form-label-left input_mask">
             	 <div class="x_panel">
             	  <div class="x_content">
             	   <br>
				 <label class="control-label col-md-2 col-sm-2 col-xs-12">软件名称</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <input type="text" class="form-control" value="" name ="softwareName" placeholder="请输入软件名">
                        </div>
                       
                       <label class="control-label col-md-2 col-sm-2 col-xs-12">所属平台</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" id="platform" name="flatformId">
                            <option value = "0">请选择平台</option>
                          </select>
                        </div> 
                        <br><br><br>  
  <label class="control-label col-md-2 col-sm-2 col-xs-12">App状态</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" name="status" id="appState">
                           <option value ="0">请选择状态</option>
                          </select>
                        </div>
                     
 <label class="control-label col-md-2 col-sm-2 col-xs-12">一级分类</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" name="cateLevel1.id" id="categoryLevel1">
                            <option value ="0">请选择分类</option>
                          </select>
                        </div> 
                                                <br><br><br> 
 <label class="control-label col-md-2 col-sm-2 col-xs-12">二级分类</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" name="cateLevel2.id" id="categoryLevel2">
                            <option value ="0">请选择分类</option>
                          </select>
                        </div>
 <label class="control-label col-md-2 col-sm-2 col-xs-12">三级分类</label>
						<div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" name="cateLevel3.id" id="categoryLevel3">
                            <option value ="0">请选择分类</option>
                          </select>
                        </div>
                         </div>
                          <div class="col-md-7 col-sm-7 col-xs-12 col-md-offset-3">
                          <button type="submit" class="btn btn-success col-md-4 col-sm-4 col-xs-12">搜索</button>
             	   </div>
             	   </div> 
             	   </form>
             	    </div>
              	<!-- 复制 -->
              	 </div>
              	<div class="row">
				<div class="col-sm-12">
				 <div class="x_panel">
				 <h2>App信息列表 <small>${loginUser.devName}</small></h2>
					<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
					<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="First name: activate to sort column descending" aria-sort="ascending">软件名称</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										APK名称</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										软件大小(单位:M)</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										所属平台</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										所属分类(一级分类、二级分类、三级分类)</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										状态</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										下载次数</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" aria-label="Last name: activate to sort column ascending">
										最新版本号</th>
									<th class="sorting" tabindex="0" aria-controls="datatable-responsive" rowspan="1" colspan="1" style="width: 124px;" aria-label="Last name: activate to sort column ascending">
										操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${appList}" var="appInfo">
                       	<tr>
                       		<td>${appInfo.softwareName}</td>
                       		<td>${appInfo.APKName}</td>
                       		<td>${appInfo.softwareSize}</td>
                       		<td>${appInfo.flateformName}</td>
                       		<td>${appInfo.cateLevel1.categoryName}->
                       			${appInfo.cateLevel2.categoryName}->
                       			${appInfo.cateLevel3.categoryName}</td>
                       		<td>${appInfo.statusName}</td>
                       		<td>${appInfo.downloads}</td>
                       		<td>${appInfo.version.versionNo}</td>
                       		<td>
                       		<div class="btn-group">
                      <button type="button" class="btn btn-danger">点击操作</button>
                      <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <span class="caret"></span>
                        <span class="sr-only">Toggle Dropdown</span>
                      </button>
                      <ul class="dropdown-menu" role="menu">
                 
                        <li><a href="#">修改</a>
                        </li>
                        <li><a href="${pageContext.request.contextPath }/dev/getAppInfo/${appInfo.id}" data-toggle="tooltip" data-placement="left" title="查看应用信息">查看</a>
                        </li>
                        <li><a href="#">删除</a>
                        </li>
                      </ul>
                    </div>
                    </td>
                       	</tr>
                       </c:forEach>
							</tbody>
					</table>
				</div>
				<div class="row">
                   <%--  <div class="col-sm-5">
                    <div class="dataTables_info" id="datatable_info" role="status" aria-live="polite">
                    Showing ${fromIndex } to ${endIndex } of ${count } entries</div>
                    </div> --%>
                    <div class="col-sm-12">
                    <div style="text-align: center;">
						<nav aria-label="...">
							<ul class="pagination">
							<c:choose>
								<c:when test="${pageNow==1 }">
								<li class="page-item disabled">
     							 <a class="page-link" href="javascript:;" tabindex="-1">首页</a>
    							</li>
								</c:when>
								<c:otherwise>
								<li class="page-item">
     							 <a class="page-link" href='${pageContext.request.contextPath }/dev/getAppInfoList?softwareName=${aig.softwareName }&flatformId=${aig.flatformId }&status=${aig.status}&cateLevel1.id=${aig.cateLevel1.id }&cateLevel2.id=${aig.cateLevel2.id }&cateLevel3.id=${aig.cateLevel3.id }&pageNow=${1}' tabindex="-1">首页</a>
    							</li>
								</c:otherwise>
							</c:choose>
							
								<c:forEach var="i" begin="1" end="${pageCount }" step="1">
								<c:choose>
									<c:when test="${i ==pageNow}">
									 <li class="page-item active">
      									<a class="page-link" href='javascript:;'> ${i} <span class="sr-only"></span></a>
    								</li>
									</c:when>
									<c:otherwise>
										<li class="page-item">
								<a class="page-link"  href='${pageContext.request.contextPath }/dev/getAppInfoList?softwareName=${aig.softwareName }&flatformId=${aig.flatformId }&status=${aig.status}&cateLevel1.id=${aig.cateLevel1.id }&cateLevel2.id=${aig.cateLevel2.id }&cateLevel3.id=${aig.cateLevel3.id }&pageNow=${i}' data-dt-idx='1'>${i }
								</a>
								</li>
									</c:otherwise>
								</c:choose>
								
                   <%--  <li class="paginate_button active">
                    <a tabindex="0" aria-controls="datatable" 
                     href='${pageContext.request.contextPath }/dev/getAppInfoList?softwareName=${aig.softwareName }&flatformId=${aig.flatformId }&status=${aig.status}&cateLevel1.id=${aig.cateLevel1.id }&cateLevel2.id=${aig.cateLevel2.id }&cateLevel3.id=${aig.cateLevel3.id }&pageNow=${i}' data-dt-idx='1'>${i }</a></li>
                     --%>
                    </c:forEach> 
                    <c:choose>
								<c:when test="${pageNow==pageCount }">
								<li class="page-item disabled">
     							 <a class="page-link" href="javascript:;" tabindex="-1">尾页</a>
    							</li>
								</c:when>
								<c:otherwise>
								<li class="page-item">
     							 <a class="page-link" href='${pageContext.request.contextPath }/dev/getAppInfoList?softwareName=${aig.softwareName }&flatformId=${aig.flatformId }&status=${aig.status}&cateLevel1.id=${aig.cateLevel1.id }&cateLevel2.id=${aig.cateLevel2.id }&cateLevel3.id=${aig.cateLevel3.id }&pageNow=${pageCount}' tabindex="-1">首页</a>
    							</li>
								</c:otherwise>
							</c:choose>
							</ul>
						</nav>
                    </div>
                    </div>
				</div>
				</div>
				</div>     	 
              	  </div>
              	   
<%@ include file="devBotton.jsp" %>
 <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/ajax.js"></script>
  <script type="text/javascript">
  var path = "${pageContext.request.contextPath }";
  $(function(){
	  var $platform = $("#platform");
	  var $appState = $("#appState");
	  getDicList($platform,"APP_FLATFORM");
	  getDicList($appState,"APP_STATUS");
	  var $categoryLevel1 = $("#categoryLevel1");
		var $categoryLevel2 = $("#categoryLevel2");
		var $categoryLevel3 = $("#categoryLevel3");
		//加载1级分类
		getCategoryList($categoryLevel1,"0");
		$categoryLevel1.on("change",function(){
			//为避免三级分类数据与一级、二级分类不对应
			//在加载二级分类前，清除三级分类
			$categoryLevel2.children().not(":first").remove();
			$categoryLevel3.children().not(":first").remove();
			//一级分类选项改变加载二级分类
			getCategoryList($categoryLevel2,$(this).val());
		});
		$categoryLevel2.on("change",function(){
			//二级分类选项改变加载三级分类
			getCategoryList($categoryLevel3,$(this).val());
		});
  });
  $(function() {
		$("[data-toggle='tooltip']").tooltip();
	});
  </script>