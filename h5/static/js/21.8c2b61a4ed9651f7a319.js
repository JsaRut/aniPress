webpackJsonp([21], {
    "2QH8": function(t, s, e) {
        "use strict";
        Object.defineProperty(s, "__esModule", {
            value: !0
        });
        var i = e("pFYg"),
            r = e.n(i),
            a = e("mvHQ"),
            c = e.n(a),
            n = e("cJ47"),
            h = e("pjeT"),
            o = (h.a, {
                components: {
                    List: h.a
                },
                data: function() {
                    return {
                        search: "",
                        searchlist: [],
                        searchhistory: []
                    }
                },
                computed: {
                    searchword: function() {
                        return this.$route.query.s
                    },
                    searchtips: function() {
                        return this.$store.state.config.search_modules
                    }
                },
                watch: {
                    searchword: function() {
                        this.initData()
                    }
                },
                methods: {
                    searchresult: function() {
                        var t = this;
                        this.$router.push({
                            path: "/search",
                            query: {
                                s: this.search
                            }
                        }), 1 != this.searchhistory.some(function(s) {
                            return s == t.search
                        }) && this.searchhistory.push(this.search), localStorage.history = c()(this.searchhistory)
                    },
                    initHistory: function() {
                        var t = localStorage.history;
                        t && r()(JSON.parse(t)) == Array ? this.searchhistory = JSON.parse(t) : localStorage.history = c()(this.searchhistory)
                    },
                    clearhistory: function() {
                        this.searchhistory = [], localStorage.history = c()(this.searchhistory)
                    },
                    goTo: function(t) {
                        this.$router.push({
                            path: "/animate/" + t
                        })
                    },
                    initData: function() {
                        var t = this;
                        this.initHistory(), this.$route.query.s && Object(n.a)({
                            method: "get",
                            url: "/animate",
                            params: {
                                search: this.$route.query.s,
                                per_page: 100
                            }
                        }).then(function(s) {
                            s.data.length > 0 ? t.searchlist = s.data : t.searchlist = []
                        }).catch(function(s) {
                            t.$Notice.error({
                                title: "加载超时,请刷新重试"
                            })
                        })
                    }
                },
                mounted: function() {
                    var t = this;
                    this.initData(), this.$nextTick(function() {
                        t.$refs.input.focus()
                    })
                }
            }),
            u = {
                render: function() {
                    var t = this,
                        s = t.$createElement,
                        e = t._self._c || s;
                    return e("div", {
                        staticClass: "search"
                    }, [e("div", {
                        staticClass: "search-input"
                    }, [e("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.search,
                            expression: "search"
                        }],
                        ref: "input",
                        attrs: {
                            type: "text"
                        },
                        domProps: {
                            value: t.search
                        },
                        on: {
                            keyup: function(s) {
                                return !s.type.indexOf("key") && t._k(s.keyCode, "enter", 13, s.key, "Enter") ? null : t.searchresult(s)
                            },
                            input: function(s) {
                                s.target.composing || (t.search = s.target.value)
                            }
                        }
                    })]), t._v(" "), 0 == t.search.length ? e("div", {
                        staticClass: "search-tips"
                    }, [e("div", {
                        staticClass: "hot-search"
                    }, [e("div", {
                        staticClass: "hot-search-title"
                    }, [t._v("热门搜索")]), t._v(" "), t._l(t.searchtips, function(s) {
                        return e("div", {
                            staticClass: "hot-search-list",
                            on: {
                                click: function(e) {
                                    return t.goTo(s.qinmei_search_slug)
                                }
                            }
                        }, [t._v("\n        " + t._s(s.title) + "\n      ")])
                    })], 2), t._v(" "), e("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: t.searchhistory.length > 0,
                            expression: "searchhistory.length > 0"
                        }],
                        staticClass: "history-search"
                    }, [e("div", {
                        staticClass: "history-search-title"
                    }, [e("span", [t._v("搜索历史")]), t._v(" "), e("i", {
                        staticClass: "iconfont icon-guanbi1",
                        on: {
                            click: t.clearhistory
                        }
                    })]), t._v(" "), t._l(t.searchhistory, function(s) {
                        return e("div", {
                            staticClass: "history-search-list"
                        }, [t._v("\n        " + t._s(s) + "\n      ")])
                    })], 2)]) : e("div", {
                        staticClass: "search-list"
                    }, [t.searchlist.length > 0 ? [e("List", {
                        attrs: {
                            list: t.searchlist
                        }
                    })] : [e("div", {
                        staticClass: "search-list-none"
                    }, [t._v("\n        暂无搜索结果\n      ")])]], 2)])
                },
                staticRenderFns: []
            };
        var l = e("VU/8")(o, u, !1, function(t) {
            e("swWD")
        }, "data-v-2bc62ed1", null);
        s.default = l.exports
    },
    swWD: function(t, s) {}
});