webpackJsonp([23], {
    "7DKK": function(i, n) {},
    k4Tb: function(i, n, t) {
        "use strict";
        Object.defineProperty(n, "__esModule", {
            value: !0
        });
        var e = {
            render: function() {
                var i = this,
                    n = i.$createElement,
                    t = i._self._c || n;
                return t("div", {
                    staticClass: "user-list-con"
                }, i._l(i.userlist, function(n) {
                    return t("div", {
                        staticClass: "user-list",
                        on: {
                            click: function(t) {
                                return i.gotouser(n.link)
                            }
                        }
                    }, [t("i", {
                        staticClass: "iconfont",
                        class: n.icon
                    }), i._v(" "), t("span", [i._v(i._s(n.title))])])
                }), 0)
            },
            staticRenderFns: []
        };
        var s = t("VU/8")({
            data: function() {
                return {
                    userlist: [{
                        title: "历史记录",
                        icon: "icon-history1",
                        link: "/user/history"
                    }, {
                        title: "我的追番",
                        icon: "icon-yizhuifan",
                        link: "/user/like"
                    }, {
                        title: "会员等级",
                        icon: "icon-huiyuan",
                        link: "/user/member"
                    }, {
                        title: "番剧相关",
                        icon: "icon-dianshiyouxiandianshishuzidianshimianxing",
                        link: "/user/animate"
                    }, {
                        title: "长文相关",
                        icon: "icon-wenzhang",
                        link: "/user/longpost"
                    }, {
                        title: "评论相关",
                        icon: "icon-pinglun",
                        link: "/user/comment"
                    }, {
                        title: "系统通知",
                        icon: "icon-xitongtongzhi",
                        link: "/user/public"
                    }]
                }
            },
            methods: {
                gotouser: function(i) {
                    this.$router.push({
                        path: i
                    })
                }
            }
        }, e, !1, function(i) {
            t("7DKK")
        }, "data-v-29360e7e", null);
        n.default = s.exports
    }
});