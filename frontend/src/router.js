
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import WorkWorkOrderManager from "./components/listers/WorkWorkOrderCards"
import WorkWorkOrderDetail from "./components/listers/WorkWorkOrderDetail"

import AccountInfoAccountInfoManager from "./components/listers/AccountInfoAccountInfoCards"
import AccountInfoAccountInfoDetail from "./components/listers/AccountInfoAccountInfoDetail"

import WorkTypeWorkTypeManager from "./components/listers/WorkTypeWorkTypeCards"
import WorkTypeWorkTypeDetail from "./components/listers/WorkTypeWorkTypeDetail"


import UserInfoUserInfoManager from "./components/listers/UserInfoUserInfoCards"
import UserInfoUserInfoDetail from "./components/listers/UserInfoUserInfoDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/works/workOrders',
                name: 'WorkWorkOrderManager',
                component: WorkWorkOrderManager
            },
            {
                path: '/works/workOrders/:id',
                name: 'WorkWorkOrderDetail',
                component: WorkWorkOrderDetail
            },

            {
                path: '/accountInfos/accountInfos',
                name: 'AccountInfoAccountInfoManager',
                component: AccountInfoAccountInfoManager
            },
            {
                path: '/accountInfos/accountInfos/:id',
                name: 'AccountInfoAccountInfoDetail',
                component: AccountInfoAccountInfoDetail
            },

            {
                path: '/workTypes/workTypes',
                name: 'WorkTypeWorkTypeManager',
                component: WorkTypeWorkTypeManager
            },
            {
                path: '/workTypes/workTypes/:id',
                name: 'WorkTypeWorkTypeDetail',
                component: WorkTypeWorkTypeDetail
            },


            {
                path: '/userInfos/userInfos',
                name: 'UserInfoUserInfoManager',
                component: UserInfoUserInfoManager
            },
            {
                path: '/userInfos/userInfos/:id',
                name: 'UserInfoUserInfoDetail',
                component: UserInfoUserInfoDetail
            },



    ]
})
