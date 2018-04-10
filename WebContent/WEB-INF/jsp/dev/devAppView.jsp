<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="devTop.jsp" %>
<div class="right_col" role="main" style="min-height: 4000.77px;">
	<div class="row">
	<div class="col-md-12 col-xs-12">
		<div class="x_panel">
			<div class="x_title">
                    <h2>查看APP信息 <small>  <span class="fa fa-user" aria-hidden="true" style="font-size:18px; color: black;"></span>   ${loginUser.devName }</small></h2>
                    <div class="clearfix"></div>
                  </div>
                 <div class="x_title">
                    <h2>APP基础信息 </h2>
                    <div class="clearfix"></div>
                  </div>
                  <form class="form-horizontal form-label-left input_mask">
                  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">软件名称*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.softwareName }">
                        </div>
                      </div>
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">APK名称*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.APKName }">
                        </div>
                      </div>
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">支持ROM*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.supportROM }">
                        </div>
                      </div>
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">界面语言*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.interfaceLanguage }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">软件大小*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.softwareSize }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">下载次数*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.downloads }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">所属平台*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.flateformName }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">所属分类*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.cateLevel1.categoryName }->${appInfo.cateLevel2.categoryName }->${appInfo.cateLevel3.categoryName }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">APP状态*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <input type="text" class="form-control" readonly="readonly" placeholder="${appInfo.statusName }">
                        </div>
                      </div>
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">应用简介*</label>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                          <textarea class="form-control" readonly="readonly" rows="3" style="margin: 0px -4.656px 0px 0px;">${appInfo.appInfo }</textarea>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-6">LOGO图片*</label>
                       <div class="col-md-6 col-sm-6 col-xs-12">
				   <img src="${appInfo.logoPicPath }" width="100px;"/> 
            </div>
            </div>
                  </form>
		
			 <div class="x_title">
                    <h2> 历史版本记录 </h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  
                  	<div class="x_content">

                    <table class="table table-bordered">
                      <thead>
                        <tr>
                          <th>软件名称</th>
                          <th>版本号</th>
                          <th>版本大小(单位:M)</th>
                          <th>发布状态</th>
                          <th>APK文件下载</th> 
                          <th>最近更新时间</th>
                        </tr>
                      </thead>
                      <tbody>
                        	<c:forEach items="${appVersionsList}" var="appVersionsList">
                        	 <tr>
                        		<td>${appVersionsList.softwareName }</td>
                        		<td>${appVersionsList.versionNo }</td>
                        		<td>${appVersionsList.versionSize }</td>
                        		<td>${appVersionsList.valueName }</td>
                        		<td>${appVersionsList.apkFileName }</td>
                        		<td>${appVersionsList.creationDate }</td>
                        		</tr> 
                        	</c:forEach>
                      </tbody>
                    </table>
                    <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-2">
                          <button type="submit" class="btn btn-primary" style="width: 100px;" onclick="javascript:history.back(-1);">返回</button>
                        </div>
                      </div>
                  </div>
                  </div>
		</div>
	</div>
	</div>
<%@ include file="devBotton.jsp" %>