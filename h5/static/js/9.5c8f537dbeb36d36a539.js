webpackJsonp([9], {
    cOqS: function(t, i, e) {
        "use strict";
        Object.defineProperty(i, "__esModule", {
            value: !0
        });
        var s = e("Gu7T"),
            n = e.n(s),
            l = e("k0Pr"),
            o = e("hTlg"),
            a = (l.a, o.a, {
                components: {
                    Snav: l.a,
                    ListSection: o.a
                },
                data: function() {
                    return {
                        modulelist: [{
                            title: "搞笑轻松",
                            link: "fun",
                            color: "#7B72E9"
                        }, {
                            title: "战斗热血",
                            link: "fight",
                            color: "#FF4351"
                        }, {
                            title: "日常卖萌",
                            link: "daily",
                            color: "#FEAE18"
                        }, {
                            title: "致郁惊悚",
                            link: "depress",
                            color: "#A5DE37"
                        }, {
                            title: "治愈感动",
                            link: "cure",
                            color: "#33CC99"
                        }, {
                            title: "异界幻想",
                            link: "world",
                            color: "#1B9AF7"
                        }, {
                            title: "所有番剧",
                            link: "all",
                            color: "#117a65"
                        }]
                    }
                },
                computed: {
                    toplist: function() {
                        var t = [].concat(n()(this.modulelist), [{
                            title: "站长推荐",
                            link: "recommend",
                            color: "#1B9AF7"
                        }, {
                            title: "评分排行",
                            link: "rate",
                            color: "#117a65"
                        }]);
                        return t
                    }
                },
                methods: {
                    goToCat: function(t) {
                        this.$router.push({
                            path: "/cat/" + t
                        })
                    }
                },
                mounted: function() {
                    0 != this.$store.state.animate.time.fun.length && 0 != this.$store.state.animate.time.daily.length && 0 != this.$store.state.animate.time.fiight.length || this.$store.dispatch("getanimatekind")
                }
            }),
            c = {
                render: function() {
                    var t = this,
                        i = t.$createElement,
                        e = t._self._c || i;
                    return e("div", {
                        staticClass: "topic"
                    }, [e("Snav", {
                        attrs: {
                            secnav: "2"
                        }
                    }), t._v(" "), e("div", {
                        staticClass: "topic-con"
                    }, t._l(t.toplist, function(i) {
                        return e("div", {
                            staticClass: "topic-list",
                            style: {
                                backgroundColor: i.color
                            },
                            on: {
                                click: function(e) {
                                    return t.goToCat(i.link)
                                }
                            }
                        }, [t._v("\n      " + t._s(i.title) + "\n    ")])
                    }), 0), t._v(" "), t._l(t.modulelist, function(t) {
                        return [e("ListSection", {
                            attrs: {
                                seclist: t
                            }
                        })]
                    })], 2)
                },
                staticRenderFns: []
            };
        var r = e("VU/8")(a, c, !1, function(t) {
            e("d4DV")
        }, "data-v-19d6cb4e", null);
        i.default = r.exports
    },
    d4DV: function(t, i) {},
    hTlg: function(t, i, e) {
        "use strict";
        e("cJ47");
        var s = e("pjeT"),
            n = (s.a, {
                props: ["seclist"],
                components: {
                    List: s.a
                },
                data: function() {
                    return {}
                },
                computed: {
                    listrate: function() {
                        if ("rate" == this.seclist.link) return !0
                    },
                    showday: function() {},
                    list: function() {
                        return "rate" == this.seclist.link ? this.$store.state.animate.time.rate.slice(0, 6) : "all" == this.seclist.link ? this.$store.state.animate.time.all.slice(0, 6) : this.$store.state.animate.time[this.seclist.link].slice(0, 6)
                    }
                },
                methods: {
                    goToCat: function(t) {
                        this.$router.push({
                            path: "/cat/" + t
                        })
                    }
                },
                mounted: function() {}
            }),
            l = {
                render: function() {
                    var t = this,
                        i = t.$createElement,
                        e = t._self._c || i;
                    return e("div", {
                        staticClass: "section"
                    }, [e("div", {
                        staticClass: "section-header"
                    }, [e("div", {
                        staticClass: "header-title",
                        style: {
                            color: t.seclist.color
                        }
                    }, [t._v("\n      " + t._s(t.seclist.title) + "\n    ")]), t._v(" "), e("div", {
                        staticClass: "header-link",
                        style: {
                            backgroundColor: t.seclist.color
                        },
                        on: {
                            click: function(i) {
                                return t.goToCat(t.seclist.link)
                            }
                        }
                    }, [t._v("\n      查看更多\n    ")])]), t._v(" "), e("div", {
                        staticClass: "section-main"
                    }, [e("List", {
                        attrs: {
                            list: t.list,
                            rate: t.listrate,
                            showday: t.showday
                        }
                    })], 1)])
                },
                staticRenderFns: []
            };
        var o = e("VU/8")(n, l, !1, function(t) {
            e("mSa7")
        }, "data-v-afc6ec86", null);
        i.a = o.exports
    },
    mSa7: function(t, i) {}
});