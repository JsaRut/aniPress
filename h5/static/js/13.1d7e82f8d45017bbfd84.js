webpackJsonp([13], {
    BpXk: function(t, e) {},
    nXOw: function(t, e, s) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var a = {
            render: function() {
                var t = this,
                    e = t.$createElement,
                    s = t._self._c || e;
                return s("div", {
                    staticClass: "user"
                }, [s("div", {
                    staticClass: "user-header"
                }, [t._m(0), t._v(" "), s("div", {
                    staticClass: "header-title"
                }, [s("span", [t._v(t._s(t.title))]), t._v(" "), s("div", {
                    staticClass: "user-setting",
                    on: {
                        click: t.gotosetting
                    }
                }, [s("i", {
                    staticClass: "iconfont icon-setting"
                })])]), t._v(" "), s("div", {
                    staticClass: "header-main"
                }, [s("div", {
                    staticClass: "header-left"
                }, [s("span", [t._v(t._s(t.user.name))]), t._v(" "), s("span", [t._v(t._s(t.user.email))]), t._v(" "), s("span", [t._v("Aid : " + t._s(t.user.aid))]), t._v(" "), s("span", [t._v("Level : " + t._s(t.user.level))])]), t._v(" "), s("div", {
                    staticClass: "header-right"
                }, [s("div", {
                    staticClass: "user-avatar",
                    style: {
                        backgroundImage: "url(" + t.user.avatar + ")"
                    }
                })])])]), t._v(" "), s("div", {
                    staticClass: "header-member"
                }, [s("span", {
                    on: {
                        click: t.gotomember
                    }
                }, [s("i", {
                    staticClass: "iconfont icon-zuanshihuiyuan"
                }), t._v("现在升级成为高级会员 >")])]), t._v(" "), s("router-view")], 1)
            },
            staticRenderFns: [function() {
                var t = this.$createElement,
                    e = this._self._c || t;
                return e("div", {
                    staticClass: "header-bg"
                }, [e("div", {
                    staticClass: "header-bg-blur"
                })])
            }]
        };
        var i = s("VU/8")({
            data: function() {
                return {}
            },
            computed: {
                user: function() {
                    return this.$store.state.user
                },
                title: function() {
                    return this.$route.meta.title
                }
            },
            methods: {
                gotomember: function() {
                    this.$router.push({
                        path: "/member"
                    })
                },
                gotosetting: function() {
                    this.$router.push({
                        path: "/setting"
                    })
                }
            },
            mounted: function() {}
        }, a, !1, function(t) {
            s("BpXk")
        }, "data-v-9c0f0d6a", null);
        e.default = i.exports
    }
});