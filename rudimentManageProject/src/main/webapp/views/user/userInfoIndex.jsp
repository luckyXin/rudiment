<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/js/jquery-easyui-1.3.4/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/js/jquery-easyui-1.3.4/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/js/jquery-easyui-1.3.4/demo.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/jquery-easyui-1.3.4/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/jquery-easyui-1.3.4/jquery.easyui.min.js"></script>
</head>
<body>
   <table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:true,collapsible:true">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
				<th data-options="field:'attr1',width:250">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table>
	
	<img  src="<%=request.getContextPath()%>/resource/image/logo_bg.jpg">
</body>
</html>