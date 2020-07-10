import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/Index'
import Login from '@/components/Login/Login'
import JoinRoom from '@/components/JoinRoom/JoinRoom'
import AddRoom from '@/components/AddRoom/AddRoom'
import Personal from '@/components/Personal/Personal'
import Register from '@/components/Register/Register'
import GotoFloor from '@/components/GotoFloor/GotoFloor'
import GotoClass from '@/components/GotoClass/GotoClass'
import ToDo from '@/components/ToDo/ToDo'
import EditTodo from '@/components/EditTodo/EditTodo'
import Target from '@/components/Target/Target'
Vue.use(Router) 
export default new Router({
  routes: [
         {
      path: '/',
      name: '首页',
      component: Index
        },
        {
          path: '/Login',
          name: '登录',
          component: Login
        },
      {
      path: '/Personal',
      name: '个人中心',
      component: Personal
       },
    {
      path: '/AddRoom',
      name: '创建房间',
      component: AddRoom
    },
    {
      path: '/JoinRoom',
      name: '加入房间',
      component: JoinRoom
    },
       {
         path: '/Register',
         name: '注册',
          component: Register
        },
        {
          path: '/GotoFloor',
          name: '走廊',
          component: GotoFloor
        },
        {
      path: '/GotoClass',
      name: '教室',
      component:GotoClass
     },
     {
      path: '/ToDo',
      name: '待办',
      component:ToDo
     },
     {
      path: '/EditTodo',
      name: '编辑待办',
      component:EditTodo
     },
     {
      path: '/Target',
      name: '计划板',
      component:Target
     },
    ]

})

