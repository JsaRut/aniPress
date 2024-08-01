webpackJsonp([11], {
    "5jdf": function(t, e) {},
    PjKK: function(t, e) {},
    "f/j2": function(t, e, r) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        Number, Array, String, Number, String, Number, String, Boolean, String;
        var s = {
                name: "x-circle",
                props: {
                    strokeWidth: {
                        type: Number,
                        default: 1
                    },
                    strokeColor: {
                        type: [Array, String],
                        default: "#3FC7FA"
                    },
                    trailWidth: {
                        type: Number,
                        default: 1
                    },
                    trailColor: {
                        type: String,
                        default: "#D9D9D9"
                    },
                    percent: {
                        type: Number,
                        default: 0
                    },
                    strokeLinecap: {
                        type: String,
                        default: "round"
                    },
                    anticlockwise: {
                        type: Boolean,
                        default: !1
                    },
                    id: {
                        type: String,
                        default: "vux-circle-gradient"
                    }
                },
                computed: {
                    url: function() {
                        return "url(#" + this.id + ")"
                    },
                    radius: function() {
                        return 50 - this.strokeWidth / 2
                    },
                    pathString: function() {
                        return "M 50,50 m 0,-" + this.radius + "\n      a " + this.radius + "," + this.radius + " 0 1 1 0," + 2 * this.radius + "\n      a " + this.radius + "," + this.radius + " 0 1 1 0,-" + 2 * this.radius
                    },
                    len: function() {
                        return 2 * Math.PI * this.radius
                    },
                    pathStyle: function() {
                        return {
                            "stroke-dasharray": this.len + "px " + this.len + "px",
                            "stroke-dashoffset": (this.anticlockwise ? this.percent - 100 : 100 - this.percent) / 100 * this.len + "px",
                            transition: "stroke-dashoffset 0.6s ease 0s, stroke 0.6s ease"
                        }
                    },
                    isGradient: function() {
                        return "string" != typeof this.strokeColor
                    }
                }
            },
            i = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        r = t._self._c || e;
                    return r("div", {
                        staticClass: "vux-circle"
                    }, [r("svg", {
                        attrs: {
                            viewBox: "0 0 100 100"
                        }
                    }, [t.isGradient ? r("defs", [r("linearGradient", {
                        attrs: {
                            id: t.id,
                            x1: "10%",
                            y1: "45%",
                            x2: "50%",
                            y2: "0%"
                        }
                    }, [r("stop", {
                        style: {
                            "stop-color": t.strokeColor[0],
                            "stop-opacity": 1
                        },
                        attrs: {
                            offset: "0%"
                        }
                    }), t._v(" "), r("stop", {
                        style: {
                            "stop-color": t.strokeColor[1],
                            "stop-opacity": 1
                        },
                        attrs: {
                            offset: "100%"
                        }
                    })], 1)], 1) : t._e(), t._v(" "), r("path", {
                        attrs: {
                            d: t.pathString,
                            stroke: t.trailColor,
                            "stroke-width": t.trailWidth,
                            "fill-opacity": 0
                        }
                    }), t._v(" "), r("path", {
                        style: t.pathStyle,
                        attrs: {
                            d: t.pathString,
                            "stroke-linecap": t.strokeLinecap,
                            stroke: t.isGradient ? t.url : t.strokeColor,
                            "stroke-width": t.strokeWidth,
                            "fill-opacity": "0"
                        }
                    })]), t._v(" "), r("div", {
                        staticClass: "vux-circle-content"
                    }, [t._t("default")], 2)])
                },
                staticRenderFns: []
            };
        var a = r("VU/8")(s, i, !1, function(t) {
                r("PjKK")
            }, null, null).exports,
            n = {
                components: {
                    XCircle: a
                },
                data: function() {
                    return {}
                },
                computed: {
                    user: function() {
                        return this.$store.state.user
                    },
                    percent: function() {
                        return this.user.sorce % 100
                    }
                }
            },
            o = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        r = t._self._c || e;
                    return r("div", {
                        staticClass: "user-member"
                    }, [r("div", {
                        staticClass: "member-top"
                    }, [r("div", {
                        staticClass: "member-circle"
                    }, [r("x-circle", {
                        attrs: {
                            percent: t.percent,
                            "stroke-width": 6,
                            "trail-width": 6,
                            "stroke-color": ["#36D1DC", "#5B86E5"],
                            "trail-color": "#ececec"
                        }
                    }, [r("div", {
                        staticClass: "member-circle-text"
                    }, [r("span", [t._v("等级 : " + t._s(t.user.level))]), t._v(" "), r("span", [t._v("总积分 : " + t._s(t.user.sorce))])])])], 1)]), t._v(" "), t._m(0)])
                },
                staticRenderFns: [function() {
                    var t = this,
                        e = t.$createElement,
                        r = t._self._c || e;
                    return r("div", {
                        staticClass: "member-bottom"
                    }, [r("div", {
                        staticClass: "member-bottom-header"
                    }, [t._v("\n      积分规则\n    ")]), t._v(" "), r("div", {
                        staticClass: "member-bottom-list"
                    }, [r("span", [t._v("1. 用户每次互动即可产生一定的积分,包括发表评论,上架番剧,发布长文等等;")]), t._v(" "), r("span", [t._v("2. 每日获取的最高积分有一定的限制,请勿水评论刷屏等;")]), t._v(" "), r("span", [t._v("3. 一旦被认为是恶意评论或者无营养刷屏,删除后会扣除2倍的获取积分;")]), t._v(" "), r("span", [t._v("4. 用户每升一级需要100积分,等级暂时无上限,购买高级会员一次性赠送1000积分;")]), t._v(" "), r("span", [t._v("5. 积分的用途主要可用于下载,特殊播放线路等等;")])])])
                }]
            };
        var c = r("VU/8")(n, o, !1, function(t) {
            r("5jdf")
        }, "data-v-1043c164", null);
        e.default = c.exports
    }
});