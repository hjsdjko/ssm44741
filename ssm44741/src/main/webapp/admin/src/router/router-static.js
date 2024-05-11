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
    import shiwurenling from '@/views/modules/shiwurenling/list'
    import shizhutousu from '@/views/modules/shizhutousu/list'
    import shizhuxinyong from '@/views/modules/shizhuxinyong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xunwuqishi from '@/views/modules/xunwuqishi/list'
    import yonghutousu from '@/views/modules/yonghutousu/list'
    import shiwuguihai from '@/views/modules/shiwuguihai/list'
    import shizhu from '@/views/modules/shizhu/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import yonghuxinyong from '@/views/modules/yonghuxinyong/list'
    import config from '@/views/modules/config/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'


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
	path: '/shiwurenling',
        name: '失物认领',
        component: shiwurenling
      }
      ,{
	path: '/shizhutousu',
        name: '失主投诉',
        component: shizhutousu
      }
      ,{
	path: '/shizhuxinyong',
        name: '失主信用',
        component: shizhuxinyong
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xunwuqishi',
        name: '寻物启示',
        component: xunwuqishi
      }
      ,{
	path: '/yonghutousu',
        name: '用户投诉',
        component: yonghutousu
      }
      ,{
	path: '/shiwuguihai',
        name: '拾物归还',
        component: shiwuguihai
      }
      ,{
	path: '/shizhu',
        name: '失主',
        component: shizhu
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/yonghuxinyong',
        name: '用户信用',
        component: yonghuxinyong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
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
