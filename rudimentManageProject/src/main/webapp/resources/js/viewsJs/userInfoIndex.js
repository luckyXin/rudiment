$(document).ready(function() {
	alert(1);
	$('#userIndex').datagrid({
		columns : [ [ {
			field : 'fileName1',
			title : '文件名称1',
			width : fillsize(0.3),
			sortable : true
		}, {
			field : 'fileName2',
			title : '文件名称2',
			width : fillsize(0.3),
			sortable : true
		}, {
			field : 'fileName3',
			title : '文件名称3',
			width : fillsize(0.3),
			sortable : true
		}, {
			field : 'fileName4',
			title : '文件名称4',
			width : fillsize(0.3),
			sortable : true
		} ] ],
		singleSelect : true,
		pagination : true,
		striped : true
	});
});