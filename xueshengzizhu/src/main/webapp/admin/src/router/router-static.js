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

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiatingjingji from '@/views/modules/jiatingjingji/list'
    import news from '@/views/modules/news/list'
    import xueshengjianhuren from '@/views/modules/xueshengjianhuren/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zizhumingdan from '@/views/modules/zizhumingdan/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryJiatingjingji from '@/views/modules/dictionaryJiatingjingji/list'
    import dictionaryJiatingjingjiYesno from '@/views/modules/dictionaryJiatingjingjiYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXueshengjianhuren from '@/views/modules/dictionaryXueshengjianhuren/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryJiatingjingji',
        name: '家庭类型',
        component: dictionaryJiatingjingji
    }
    ,{
        path: '/dictionaryJiatingjingjiYesno',
        name: '审核状态',
        component: dictionaryJiatingjingjiYesno
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXueshengjianhuren',
        name: '监护人身份',
        component: dictionaryXueshengjianhuren
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiatingjingji',
        name: '家庭经济信息',
        component: jiatingjingji
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/xueshengjianhuren',
        name: '学生监护人',
        component: xueshengjianhuren
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }
    ,{
        path: '/zizhumingdan',
        name: '资助名单',
        component: zizhumingdan
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
