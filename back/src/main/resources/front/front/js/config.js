
var projectName = '社区养老服务系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '社区服务',
	url: './pages/shequfuwu/list.html'
}, 
{
	name: '物品信息',
	url: './pages/wupinxinxi/list.html'
}, 
{
	name: '社区活动',
	url: './pages/shequhuodong/list.html'
}, 
{
	name: '资讯中心',
	url: './pages/zixunzhongxin/list.html'
}, 

{
	name: '意见中心',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot654g2/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"服务种类","menuJump":"列表","tableName":"fuwuzhonglei"}],"menu":"服务种类管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区服务","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","审核"],"menu":"服务预约","menuJump":"列表","tableName":"fuwuyuyue"}],"menu":"服务预约管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"物品种类","menuJump":"列表","tableName":"wupinzhonglei"}],"menu":"物品种类管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"物品信息","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","审核"],"menu":"借用信息","menuJump":"列表","tableName":"jieyongxinxi"}],"menu":"借用信息管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"活动分类","menuJump":"列表","tableName":"huodongfenlei"}],"menu":"活动分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"社区活动","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"疫情监测","menuJump":"列表","tableName":"yiqingjiance"}],"menu":"疫情监测管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除","报表"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"资讯中心","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"意见中心","tableName":"messages"}],"menu":"意见中心"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","编辑名称","编辑父级","删除"],"menu":"菜单列表","tableName":"menu"},{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","立即预约"],"menu":"社区服务列表","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["立即借用","查看"],"menu":"物品信息列表","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","立即报名","查看评论"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","查看评论"],"menu":"资讯中心列表","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除"],"menu":"服务预约","menuJump":"列表","tableName":"fuwuyuyue"}],"menu":"服务预约管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","归还"],"menu":"借用信息","menuJump":"列表","tableName":"jieyongxinxi"}],"menu":"借用信息管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["删除","查看"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"疫情监测","menuJump":"列表","tableName":"yiqingjiance"}],"menu":"疫情监测管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","支付"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","编辑名称","编辑父级","删除"],"menu":"菜单列表","tableName":"menu"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","立即预约"],"menu":"社区服务列表","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["立即借用","查看"],"menu":"物品信息列表","menuJump":"列表","tableName":"wupinxinxi"}],"menu":"物品信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","立即报名","查看评论"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","查看评论"],"menu":"资讯中心列表","menuJump":"列表","tableName":"zixunzhongxin"}],"menu":"资讯中心模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
