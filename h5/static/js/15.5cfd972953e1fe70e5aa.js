webpackJsonp([15], {
    BusT: function(t, s, n) {
        "use strict";
        Object.defineProperty(s, "__esModule", {
            value: !0
        });
        n("ytdl");
        var a = n("cJ47"),
            o = {
                components: {},
                data: function() {
                    return {
                        index: 1,
                        longpost: {
                            write: [],
                            like: [],
                            report: []
                        }
                    }
                },
                methods: {
                    getlongpost: function(t) {
                        var s = this;
                        Object(a.a)({
                            method: "post",
                            url: "/anime/longpost",
                            data: {
                                type: t
                            }
                        }).then(function(n) {
                            null !== n.data && (s.longpost[t] = n.data)
                        }).catch(function(t) {
                            console.log("连接错误")
                        })
                    },
                    goto: function(t) {
                        this.$router.push({
                            name: "post",
                            params: {
                                id: t
                            }
                        })
                    }
                },
                mounted: function() {
                    this.getlongpost("write"), this.getlongpost("like"), this.getlongpost("report")
                }
            },
            i = {
                render: function() {
                    var t = this,
                        s = t.$createElement,
                        n = t._self._c || s;
                    return n("div", {
                        staticClass: "user-longpost"
                    }, [n("div", {
                        staticClass: "animate-header"
                    }, [n("div", {
                        staticClass: "animate-header-btn",
                        class: 0 == t.index ? "active" : "",
                        on: {
                            click: function(s) {
                                t.index = 0
                            }
                        }
                    }, [t._v("\n      我的长文\n    ")]), t._v(" "), n("div", {
                        staticClass: "animate-header-btn",
                        class: 1 == t.index ? "active" : "",
                        on: {
                            click: function(s) {
                                t.index = 1
                            }
                        }
                    }, [t._v("\n      收藏长文\n    ")]), t._v(" "), n("div", {
                        staticClass: "animate-header-btn",
                        class: 2 == t.index ? "active" : "",
                        on: {
                            click: function(s) {
                                t.index = 2
                            }
                        }
                    }, [t._v("\n      举报反馈\n    ")])]), t._v(" "), n("div", {
                        staticClass: "longpost-main"
                    }, [n("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 0 == t.index,
                            expression: "index == 0"
                        }],
                        staticClass: "longpost-panel"
                    }, [t.longpost.write.length > 0 ? n("div", {
                        staticClass: "longpost-write"
                    }, [n("div", {
                        staticClass: "longpost-container"
                    }, t._l(t.longpost.write, function(s) {
                        return n("div", {
                            staticClass: "longpost-list",
                            on: {
                                click: function(n) {
                                    return t.goto(s.id)
                                }
                            }
                        }, [n("div", {
                            staticClass: "longpost-bg",
                            style: {
                                backgroundImage: "url(" + s.headimg + ")"
                            }
                        }, [n("div", {
                            staticClass: "longpost-bg-cover"
                        }, [n("div", {
                            staticClass: "longpost-title"
                        }, [t._v("\n                    " + t._s(s.title) + "\n                  ")]), t._v(" "), n("div", {
                            staticClass: "longpost-content"
                        }, [t._v("\n                    " + t._s(s.content) + "\n                  ")]), t._v(" "), n("div", {
                            staticClass: "longpost-header"
                        }, [n("div", {
                            staticClass: "longpost-author"
                        }, [n("div", {
                            staticClass: "longpost-author-avatar",
                            style: {
                                backgroundImage: "url(" + s.avatar + ")"
                            }
                        }), t._v(" "), n("div", {
                            staticClass: "longpost-author-name"
                        }, [t._v("\n                        " + t._s(s.author) + "\n                      ")])]), t._v(" "), n("div", {
                            staticClass: "longpost-view"
                        }, [n("span", [n("Icon", {
                            attrs: {
                                type: "ios-text"
                            }
                        }), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), n("span", [n("Icon", {
                            attrs: {
                                type: "md-eye"
                            }
                        }), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])])])])])
                    }), 0)]) : n("div", {
                        staticClass: "nolist"
                    }, [t._v("\n        暂无结果\n      ")])]), t._v(" "), n("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 1 == t.index,
                            expression: "index == 1"
                        }],
                        staticClass: "longpost-panel"
                    }, [t.longpost.like.length > 0 ? n("div", {
                        staticClass: "longpost-like"
                    }, [n("div", {
                        staticClass: "longpost-container"
                    }, t._l(t.longpost.like, function(s) {
                        return n("div", {
                            staticClass: "longpost-list",
                            on: {
                                click: function(n) {
                                    return t.goto(s.id)
                                }
                            }
                        }, [n("div", {
                            staticClass: "longpost-bg",
                            style: {
                                backgroundImage: "url(" + s.headimg + ")"
                            }
                        }, [n("div", {
                            staticClass: "longpost-bg-cover"
                        }, [n("div", {
                            staticClass: "longpost-title"
                        }, [t._v("\n                    " + t._s(s.title) + "\n                  ")]), t._v(" "), n("div", {
                            staticClass: "longpost-content"
                        }, [t._v("\n                    " + t._s(s.content) + "\n                  ")]), t._v(" "), n("div", {
                            staticClass: "longpost-header"
                        }, [n("div", {
                            staticClass: "longpost-author"
                        }, [n("div", {
                            staticClass: "longpost-author-avatar",
                            style: {
                                backgroundImage: "url(" + s.avatar + ")"
                            }
                        }), t._v(" "), n("div", {
                            staticClass: "longpost-author-name"
                        }, [t._v("\n                        " + t._s(s.author) + "\n                      ")])]), t._v(" "), n("div", {
                            staticClass: "longpost-view"
                        }, [n("span", [n("Icon", {
                            attrs: {
                                type: "ios-text"
                            }
                        }), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), n("span", [n("Icon", {
                            attrs: {
                                type: "md-eye"
                            }
                        }), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])])])])])
                    }), 0)]) : n("div", {
                        staticClass: "nolist"
                    }, [t._v("\n        暂无结果\n      ")])]), t._v(" "), n("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 2 == t.index,
                            expression: "index == 2"
                        }],
                        staticClass: "longpost-panel"
                    }, [t.longpost.report.length > 0 ? n("div", {
                        staticClass: "longpost-report"
                    }, [n("div", {
                        staticClass: "longpost-container"
                    }, t._l(t.longpost.report, function(s) {
                        return n("div", {
                            staticClass: "longpost-report-list",
                            on: {
                                click: function(n) {
                                    return t.goto(s.id)
                                }
                            }
                        }, [n("div", {
                            staticClass: "longpost-report-bg",
                            style: {
                                backgroundImage: "url(" + s.headimg + ")"
                            }
                        }, [n("div", {
                            staticClass: "longpost-bg-cover"
                        }, [n("div", {
                            staticClass: "longpost-header"
                        }, [n("div", {
                            staticClass: "longpost-view"
                        }, [n("span", [n("Icon", {
                            attrs: {
                                type: "ios-text"
                            }
                        }), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), n("span", [n("Icon", {
                            attrs: {
                                type: "md-eye"
                            }
                        }), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])])])]), t._v(" "), n("div", {
                            staticClass: "longpost-report-main"
                        }, [n("span", [t._v("标题: " + t._s(s.title))]), t._v(" "), n("span", [t._v("时间: " + t._s(s.time))]), t._v(" "), n("span", [t._v("状态: " + t._s(s.status))]), t._v(" "), n("span", [t._v("举报原因: " + t._s(s.report))])])])
                    }), 0)]) : n("div", {
                        staticClass: "nolist"
                    }, [t._v("\n        暂无结果\n      ")])])])])
                },
                staticRenderFns: []
            };
        var e = n("VU/8")(o, i, !1, function(t) {
            n("Rt82")
        }, "data-v-798c1db5", null);
        s.default = e.exports
    },
    Rt82: function(t, s) {}
});