webpackJsonp([22], {
    OeIj: function(t, s, e) {
        "use strict";
        Object.defineProperty(s, "__esModule", {
            value: !0
        });
        var i = e("cJ47"),
            n = {
                data: function() {
                    return {
                        publicpost: []
                    }
                },
                methods: {
                    getpostlist: function() {
                        var t = this,
                            s = this.$store.state.posts[0].id;
                        Object(i.a)({
                            method: "get",
                            url: "/posts?categories=" + s
                        }).then(function(s) {
                            s.data && (t.$Spin.hide(), t.publicpost = s.data)
                        }).catch(function(t) {
                            console.log("链接错误")
                        })
                    },
                    gotopost: function(t) {
                        this.$router.push({
                            name: "post",
                            params: {
                                id: t
                            }
                        })
                    }
                },
                mounted: function() {
                    this.$Spin.show(), this.getpostlist()
                }
            },
            o = {
                render: function() {
                    var t = this,
                        s = t.$createElement,
                        e = t._self._c || s;
                    return e("div", {
                        staticClass: "user-public"
                    }, [e("div", {
                        staticClass: "public-post"
                    }, t._l(t.publicpost, function(s) {
                        return e("div", {
                            staticClass: "post-list",
                            on: {
                                click: function(e) {
                                    return t.gotopost(s.id)
                                }
                            }
                        }, [e("div", {
                            staticClass: "post-list-title"
                        }, [e("span", [t._v(t._s(s.animate))]), t._v("\n          " + t._s(s.title.rendered) + "\n        ")]), t._v(" "), e("Time", {
                            attrs: {
                                time: s.date_gmt
                            }
                        })], 1)
                    }), 0)])
                },
                staticRenderFns: []
            };
        var a = e("VU/8")(n, o, !1, function(t) {
            e("wacT")
        }, "data-v-2a15ac67", null);
        s.default = a.exports
    },
    wacT: function(t, s) {}
});