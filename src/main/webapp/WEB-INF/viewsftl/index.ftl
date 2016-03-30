
<!DOCTYPE HTML>
<html>
<head>
    <title>后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="/res/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="/res/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="/res/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">root</span><a href="/chinapost/index.php?m=Public&a=logout" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">业务管理</div></li>		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">系统管理</div></li>

        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="/res/assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/res/assets/js/bui.js"></script>
<script type="text/javascript" src="/res/assets/js/common/main.js"></script>
<script type="text/javascript" src="/res/assets/js/config.js"></script>
<script>
    BUI.use('common/main',function(){
        var config = [
        {id:'5',homePage : '51',menu:[{text:'业务管理',items:[
		        {id:'51',text:'试剂入库',href:'/reagent/in_stock.html'},
		        {id:'52',text:'试剂出库',href:'reagent/out_stock.html'},
				{id:'53',text:'入库查询',href:'reagent/query_in_stock.html'},
				{id:'54',text:'出库查询',href:'reagent/query_out_stock.html'},
				{id:'55',text:'供应商管理',href:'reagent/provider_managerment.html'},
				{id:'56',text:'客户管理',href:'reagent/client_managerment.html'},
				{id:'57',text:'试剂库',href:'reagent/reagent_template_add.html'}]},]},
		{id:'1',homePage : '11',menu:[{text:'系统管理',items:[
				{id:'11',text:'机构管理',href:'Node/index.html'},
				{id:'12',text:'角色管理',href:'Role/index.html'},
				{id:'13',text:'用户管理',href:'User/index.html'},
				{id:'14',text:'菜单管理',href:'Menu/index.html'}]}]}
				];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
<div style="text-align:center;">
</div>
</body>
</html>