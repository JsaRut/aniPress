webpackJsonp([19], {
    JFkc: function(a, t) {},
    uEKL: function(a, t, i) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var e = i("pjeT"),
            n = i("cJ47"),
            s = (e.a, {
                components: {
                    List: e.a
                },
                data: function() {
                    return {
                        navigation: {
                            current: 1,
                            size: 30
                        },
                        params: {
                            animatearea: 0,
                            animateyear: 0,
                            animatetag: 0
                        },
                        taxonomy: {
                            area: [],
                            year: [],
                            tag: []
                        },
                        filterShow: !1
                    }
                },
                computed: {
                    cat: function() {
                        return this.$route.params.cat
                    },
                    cattitle: function() {
                        return this.$store.state.util[this.cat]
                    },
                    list: function() {
                        return this.$store.state.animate.time[this.cat]
                    },
                    pagetotal: function() {
                        return this.$store.state.animate.total[this.cat]
                    }
                },
                methods: {
                    pageChange: function(a) {
                        this.navigation.current = a;
                        var t = {
                            per_page: 30,
                            page: this.navigation.current
                        };
                        0 !== this.params.animatearea && (t.animatearea = this.params.animatearea), 0 !== this.params.animateyear && (t.animateyear = this.params.animateyear), 0 !== this.params.animatetag && (t.animatetag = this.params.animatetag);
                        var i = {
                            type: this.cat,
                            params: t
                        };
                        this.$store.dispatch("updateanimatecat", i), window.scroll(0, 0)
                    },
                    initTaxonomy: function(a) {
                        var t = this;
                        Object(n.a)({
                            method: "get",
                            url: "/animate" + a,
                            params: {
                                orderby: "count",
                                order: "desc",
                                per_page: 30
                            }
                        }).then(function(i) {
                            t.taxonomy[a] = i.data
                        })
                    },
                    addparams: function(a, t) {
                        this.params[a] == t ? this.params[a] = 0 : this.params[a] = t, this.pageChange(1)
                    }
                },
                mounted: function() {
                    this.initTaxonomy("area"), this.initTaxonomy("year"), this.initTaxonomy("tag"), 0 == this.list.length && this.pageChange(1), window.document.title = "Qinmei - " + this.cattitle
                }
            }),
            r = {
                render: function() {
                    var a = this,
                        t = a.$createElement,
                        i = a._self._c || t;
                    return i("div", {
                        staticClass: "animatecat"
                    }, [i("div", {
                        staticClass: "catheader"
                    }, [i("span", [a._v(a._s(a.cattitle))]), a._v(" "), i("div", {
                        staticClass: "catheader-filter",
                        on: {
                            click: function(t) {
                                a.filterShow = !a.filterShow
                            }
                        }
                    }, [a._v("\n        筛选\n        "), i("i", {
                        staticClass: "iconfont icon-down"
                    })])]), a._v(" "), i("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: a.filterShow,
                            expression: "filterShow"
                        }],
                        staticClass: "aniamte-filter"
                    }, [i("div", {
                        staticClass: "animate-taxonomy"
                    }, [a._m(0), a._v(" "), i("div", {
                        staticClass: "taxonomy-list"
                    }, a._l(a.taxonomy.area, function(t) {
                        return i("span", {
                            staticClass: "taxonomy-single",
                            class: a.params.animatearea == t.id ? "active" : "",
                            on: {
                                click: function(i) {
                                    return a.addparams("animatearea", t.id)
                                }
                            }
                        }, [a._v(a._s(t.name))])
                    }), 0)]), a._v(" "), i("div", {
                        staticClass: "animate-taxonomy"
                    }, [a._m(1), a._v(" "), i("div", {
                        staticClass: "taxonomy-list"
                    }, a._l(a.taxonomy.year, function(t) {
                        return i("span", {
                            staticClass: "taxonomy-single",
                            class: a.params.animateyear == t.id ? "active" : "",
                            on: {
                                click: function(i) {
                                    return a.addparams("animateyear", t.id)
                                }
                            }
                        }, [a._v(a._s(t.name))])
                    }), 0)]), a._v(" "), i("div", {
                        staticClass: "animate-taxonomy"
                    }, [a._m(2), a._v(" "), i("div", {
                        staticClass: "taxonomy-list"
                    }, a._l(a.taxonomy.tag, function(t) {
                        return i("span", {
                            staticClass: "taxonomy-single",
                            class: a.params.animatetag == t.id ? "active" : "",
                            on: {
                                click: function(i) {
                                    return a.addparams("animatetag", t.id)
                                }
                            }
                        }, [a._v(a._s(t.name))])
                    }), 0)])]), a._v(" "), i("div", {
                        staticClass: "catlist"
                    }, [i("List", {
                        attrs: {
                            list: a.list,
                            rate: !0
                        }
                    })], 1), a._v(" "), i("div", {
                        staticClass: "navigation"
                    }, [i("Page", {
                        attrs: {
                            total: a.pagetotal,
                            current: a.navigation.current,
                            "page-size": a.navigation.size,
                            "show-elevator": ""
                        },
                        on: {
                            "on-change": a.pageChange
                        }
                    })], 1)])
                },
                staticRenderFns: [function() {
                    var a = this.$createElement,
                        t = this._self._c || a;
                    return t("div", {
                        staticClass: "taxonomy-header"
                    }, [t("span", [this._v("地区:")])])
                }, function() {
                    var a = this.$createElement,
                        t = this._self._c || a;
                    return t("div", {
                        staticClass: "taxonomy-header"
                    }, [t("span", [this._v("年份:")])])
                }, function() {
                    var a = this.$createElement,
                        t = this._self._c || a;
                    return t("div", {
                        staticClass: "taxonomy-header"
                    }, [t("span", [this._v("标签:")])])
                }]
            };
        var o = i("VU/8")(s, r, !1, function(a) {
            i("JFkc")
        }, null, null);
        t.default = o.exports
    }
});