webpackJsonp([24], {
    GxEB: function(t, s) {},
    HTyd: function(t, s, a) {
        "use strict";
        Object.defineProperty(s, "__esModule", {
            value: !0
        });
        var n = a("cJ47"),
            i = {
                data: function() {
                    return {
                        postlist: [],
                        navigation: {
                            total: 0,
                            current: 1,
                            size: 30
                        }
                    }
                },
                computed: {
                    storecat: function() {
                        return this.$store.state.config.post
                    },
                    catunion: function() {
                        return this.$route.params.cat
                    },
                    postcat: function() {
                        var t = this;
                        return this.storecat.filter(function(s) {
                            return s.slug === t.catunion
                        })[0]
                    }
                },
                methods: {
                    initData: function() {
                        var t = this;
                        Object(n.a)({
                            method: "get",
                            url: "/posts?categories=" + this.postcat.cat,
                            params: {
                                page: this.navigation.current,
                                per_page: this.navigation.size
                            }
                        }).then(function(s) {
                            t.postlist = s.data, t.navigation.total = parseInt(s.headers["x-wp-total"])
                        }).catch(function(t) {
                            console.log("加载失败")
                        })
                    },
                    gotopost: function(t) {
                        this.$router.push({
                            name: "post",
                            params: {
                                id: t
                            }
                        })
                    },
                    pageChange: function(t) {
                        this.navigation.current = t, this.initData(), window.scroll(0, 0)
                    }
                },
                mounted: function() {
                    this.initData()
                }
            },
            o = {
                render: function() {
                    var t = this,
                        s = t.$createElement,
                        a = t._self._c || s;
                    return a("div", {
                        staticClass: "postcat"
                    }, [a("div", {
                        staticClass: "catheader"
                    }, [a("span", [t._v(t._s(t.postcat.title))])]), t._v(" "), a("div", {
                        staticClass: "postcat-list"
                    }, [t.postlist.length > 0 ? a("div", {
                        staticClass: "longpost-container"
                    }, t._l(t.postlist, function(s) {
                        return a("div", {
                            staticClass: "longpost-list",
                            on: {
                                click: function(a) {
                                    return t.gotopost(s.id)
                                }
                            }
                        }, [a("div", {
                            staticClass: "longpost-bg",
                            style: {
                                backgroundImage: "url(" + s.headimg + ")"
                            }
                        }, [a("div", {
                            staticClass: "longpost-bg-cover"
                        }, [a("div", {
                            staticClass: "longpost-title"
                        }, [t._v("\n                " + t._s(s.title.rendered) + "\n              ")]), t._v(" "), a("div", {
                            staticClass: "longpost-content"
                        }, [a("span", {
                            domProps: {
                                innerHTML: t._s(s.user.smalldes)
                            }
                        })]), t._v(" "), a("div", {
                            staticClass: "longpost-header"
                        }, [a("div", {
                            staticClass: "longpost-author"
                        }, [a("div", {
                            staticClass: "longpost-author-avatar",
                            style: {
                                backgroundImage: "url(" + s.user.avatar + ")"
                            }
                        }), t._v(" "), a("div", {
                            staticClass: "longpost-author-name"
                        }, [t._v("\n                    " + t._s(s.user.name) + "\n                  ")])]), t._v(" "), a("div", {
                            staticClass: "longpost-view"
                        }, [a("span", [a("Icon", {
                            attrs: {
                                type: "ios-text"
                            }
                        }), t._v("\n                    " + t._s(s.comment) + "\n                  ")], 1), t._v(" "), a("span", [a("Icon", {
                            attrs: {
                                type: "md-eye"
                            }
                        }), t._v("\n                    " + t._s(s.view) + "\n                  ")], 1)])])])])])
                    }), 0) : a("div", {
                        staticClass: "longpost-placeholder"
                    }, [t._v("\n      暂无文章\n    ")])]), t._v(" "), a("div", {
                        staticClass: "navigation"
                    }, [a("Page", {
                        attrs: {
                            total: t.navigation.total,
                            current: t.navigation.current,
                            "page-size": t.navigation.size,
                            "show-elevator": ""
                        },
                        on: {
                            "on-change": t.pageChange
                        }
                    })], 1)])
                },
                staticRenderFns: []
            };
        var e = a("VU/8")(i, o, !1, function(t) {
            a("GxEB")
        }, "data-v-17baa5dd", null);
        s.default = e.exports
    }
});