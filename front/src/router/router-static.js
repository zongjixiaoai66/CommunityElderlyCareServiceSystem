import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shequfuwu from '@/views/modules/shequfuwu/list'
    import wupinzhonglei from '@/views/modules/wupinzhonglei/list'
    import huodongfenlei from '@/views/modules/huodongfenlei/list'
    import wuyeshoufei from '@/views/modules/wuyeshoufei/list'
    import wupinxinxi from '@/views/modules/wupinxinxi/list'
    import menu from '@/views/modules/menu/list'
    import guihaixinxi from '@/views/modules/guihaixinxi/list'
    import discusszixunzhongxin from '@/views/modules/discusszixunzhongxin/list'
    import discussshequfuwu from '@/views/modules/discussshequfuwu/list'
    import fuwuzhonglei from '@/views/modules/fuwuzhonglei/list'
    import jieyongxinxi from '@/views/modules/jieyongxinxi/list'
    import yiqingjiance from '@/views/modules/yiqingjiance/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import messages from '@/views/modules/messages/list'
    import fuwuyuyue from '@/views/modules/fuwuyuyue/list'
    import discussshequhuodong from '@/views/modules/discussshequhuodong/list'
    import shequhuodong from '@/views/modules/shequhuodong/list'
    import config from '@/views/modules/config/list'
    import zixunzhongxin from '@/views/modules/zixunzhongxin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shequfuwu',
        name: '社区服务',
        component: shequfuwu
      }
      ,{
	path: '/wupinzhonglei',
        name: '物品种类',
        component: wupinzhonglei
      }
      ,{
	path: '/huodongfenlei',
        name: '活动分类',
        component: huodongfenlei
      }
      ,{
	path: '/wuyeshoufei',
        name: '物业收费',
        component: wuyeshoufei
      }
      ,{
	path: '/wupinxinxi',
        name: '物品信息',
        component: wupinxinxi
      }
      ,{
	path: '/menu',
        name: '菜单列表',
        component: menu
      }
      ,{
	path: '/guihaixinxi',
        name: '归还信息',
        component: guihaixinxi
      }
      ,{
	path: '/discusszixunzhongxin',
        name: '资讯中心评论',
        component: discusszixunzhongxin
      }
      ,{
	path: '/discussshequfuwu',
        name: '社区服务评论',
        component: discussshequfuwu
      }
      ,{
	path: '/fuwuzhonglei',
        name: '服务种类',
        component: fuwuzhonglei
      }
      ,{
	path: '/jieyongxinxi',
        name: '借用信息',
        component: jieyongxinxi
      }
      ,{
	path: '/yiqingjiance',
        name: '疫情监测',
        component: yiqingjiance
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/messages',
        name: '意见中心',
        component: messages
      }
      ,{
	path: '/fuwuyuyue',
        name: '服务预约',
        component: fuwuyuyue
      }
      ,{
	path: '/discussshequhuodong',
        name: '社区活动评论',
        component: discussshequhuodong
      }
      ,{
	path: '/shequhuodong',
        name: '社区活动',
        component: shequhuodong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zixunzhongxin',
        name: '资讯中心',
        component: zixunzhongxin
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
