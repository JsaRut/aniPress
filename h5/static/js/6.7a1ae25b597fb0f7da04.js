webpackJsonp([6], {
    Y6A4: function(t, e, n) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var i = n("cJ47"),
            r = n("k0Pr"),
            a = n("pjeT"),
            s = n("piuB"),
            o = (s.b, Number, {
                name: "button-tab",
                mixins: [s.b],
                props: {
                    height: Number
                }
            }),
            c = {
                render: function() {
                    var t = this.$createElement;
                    return (this._self._c || t)("div", {
                        staticClass: "vux-button-group"
                    }, [this._t("default")], 2)
                },
                staticRenderFns: []
            };
        var d = n("VU/8")(o, c, !1, function(t) {
                n("ZVV4")
            }, null, null).exports,
            l = (s.a, {
                name: "button-tab-item",
                mixins: [s.a],
                computed: {
                    classes: function() {
                        return {
                            "vux-button-group-current": this.currentIndex === this.$parent.currentIndex,
                            "vux-button-tab-item-first": 0 === this.currentIndex,
                            "vux-button-tab-item-last": this.currentIndex === this.$parent.$children.length - 1,
                            "vux-button-tab-item-middle": this.currentIndex > 0 && this.currentIndex !== this.$parent.$children.length - 1
                        }
                    },
                    style: function() {
                        if (this.$parent.height) return {
                            height: this.$parent.height + "px",
                            lineHeight: this.$parent.height + "px"
                        }
                    }
                }
            }),
            u = {
                render: function() {
                    var t = this.$createElement;
                    return (this._self._c || t)("a", {
                        staticClass: "vux-button-tab-item",
                        class: this.classes,
                        style: this.style,
                        attrs: {
                            href: "javascript:"
                        },
                        on: {
                            click: this.onItemClick
                        }
                    }, [this._t("default")], 2)
                },
                staticRenderFns: []
            },
            h = n("VU/8")(l, u, !1, null, null, null).exports,
            f = n("odqc"),
            b = n("Znkm"),
            m = n("fBcm"),
            v = n("b+jt"),
            x = (r.a, a.a, f.a, b.a, m.a, v.a, {
                components: {
                    Snav: r.a,
                    ButtonTab: d,
                    ButtonTabItem: h,
                    List: a.a,
                    Tab: f.a,
                    TabItem: b.a,
                    Swiper: m.a,
                    SwiperItem: v.a
                },
                data: function() {
                    return {
                        index: 0,
                        dayindex: 0,
                        userlike: [],
                        firstday: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"]
                    }
                },
                computed: {
                    list: function() {
                        return this.$store.state.newList
                    },
                    firstlist: function() {
                        return [this.$store.state.animate.time.day7, this.$store.state.animate.time.day1, this.$store.state.animate.time.day2, this.$store.state.animate.time.day3, this.$store.state.animate.time.day4, this.$store.state.animate.time.day5, this.$store.state.animate.time.day6]
                    },
                    newlist: function() {
                        var t = this.firstlist,
                            e = (new Date).getDay();
                        return t = t.concat(t), t = t.splice(e, 7), t
                    },
                    newday: function() {
                        var t = this.firstday,
                            e = (new Date).getDay();
                        return t = (t = t.concat(t)).splice(e, 7)
                    }
                },
                methods: {
                    initUserLike: function() {
                        var t = this;
                        Object(i.a)({
                            method: "post",
                            url: "/userdata/info",
                            data: {
                                type: "animate_like"
                            }
                        }).then(function(e) {
                            console.log(e), e.data && "404" !== e.data && (t.userlike = e.data)
                        }).catch(function(t) {
                            console.log("连接错误")
                        })
                    }
                },
                created: function() {},
                mounted: function() {
                    this.initUserLike()
                }
            }),
            p = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("div", {
                        staticClass: "new"
                    }, [n("Snav", {
                        attrs: {
                            secnav: "1"
                        }
                    }), t._v(" "), n("div", {
                        staticClass: "new-btn"
                    }, [n("button-tab", {
                        model: {
                            value: t.index,
                            callback: function(e) {
                                t.index = e
                            },
                            expression: "index"
                        }
                    }, [n("button-tab-item", {
                        on: {
                            "on-item-click": function(e) {
                                t.index = 0
                            }
                        }
                    }, [t._v("新番连载")]), t._v(" "), n("button-tab-item", {
                        on: {
                            "on-item-click": function(e) {
                                t.index = 1
                            }
                        }
                    }, [t._v("我的追番")])], 1)], 1), t._v(" "), n("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 0 == t.index,
                            expression: "index == 0"
                        }]
                    }, [n("tab", {
                        attrs: {
                            "line-width": 2,
                            "active-color": "#fc378c"
                        },
                        model: {
                            value: t.dayindex,
                            callback: function(e) {
                                t.dayindex = e
                            },
                            expression: "dayindex"
                        }
                    }, t._l(t.newday, function(e, i) {
                        return n("tab-item", {
                            key: i,
                            staticClass: "vux-center",
                            attrs: {
                                selected: i === t.dayindex
                            },
                            on: {
                                click: function(e) {
                                    t.dayindex = i
                                }
                            }
                        }, [t._v(t._s(e))])
                    }), 1), t._v(" "), n("swiper", {
                        attrs: {
                            height: "600px",
                            "show-dots": !1
                        },
                        model: {
                            value: t.dayindex,
                            callback: function(e) {
                                t.dayindex = e
                            },
                            expression: "dayindex"
                        }
                    }, t._l(t.newlist, function(t, e) {
                        return n("swiper-item", {
                            key: e,
                            staticClass: "new-swiper"
                        }, [n("List", {
                            attrs: {
                                list: t,
                                showday: !0
                            }
                        })], 1)
                    }), 1)], 1), t._v(" "), n("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 1 == t.index,
                            expression: "index == 1"
                        }]
                    }, [t.userlike.length > 0 ? n("List", {
                        attrs: {
                            list: t.userlike,
                            simple: "true"
                        }
                    }) : n("div", {
                        staticClass: "nodata"
                    }, [t._v("暂无追番信息")])], 1)], 1)
                },
                staticRenderFns: []
            };
        var g = n("VU/8")(x, p, !1, function(t) {
            n("gCCE")
        }, "data-v-274fddd0", null);
        e.default = g.exports
    },
    ZVV4: function(t, e) {},
    Znkm: function(t, e, n) {
        "use strict";
        var i = n("piuB"),
            r = (i.a, String, Boolean, String, String, String, {
                name: "tab-item",
                mixins: [i.a],
                props: {
                    activeClass: String,
                    disabled: Boolean,
                    badgeBackground: {
                        type: String,
                        default: "#f74c31"
                    },
                    badgeColor: {
                        type: String,
                        default: "#fff"
                    },
                    badgeLabel: String
                },
                computed: {
                    style: function() {
                        return {
                            borderWidth: this.$parent.lineWidth + "px",
                            borderColor: this.$parent.activeColor,
                            color: this.currentSelected ? this.$parent.activeColor : this.disabled ? this.$parent.disabledColor : this.$parent.defaultColor,
                            border: this.$parent.animate ? "none" : "auto"
                        }
                    }
                }
            }),
            a = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("div", {
                        staticClass: "vux-tab-item",
                        class: [t.currentSelected ? t.activeClass : "", {
                            "vux-tab-selected": t.currentSelected,
                            "vux-tab-disabled": t.disabled
                        }],
                        style: t.style,
                        on: {
                            click: t.onItemClick
                        }
                    }, [t._t("default"), t._v(" "), void 0 !== t.badgeLabel && "" !== t.badgeLabel ? n("span", {
                        staticClass: "vux-tab-item-badge",
                        style: {
                            background: t.badgeBackground,
                            color: t.badgeColor
                        }
                    }, [t._v("\n  " + t._s(t.badgeLabel))]) : t._e()], 2)
                },
                staticRenderFns: []
            },
            s = n("VU/8")(r, a, !1, null, null, null);
        e.a = s.exports
    },
    Zw8t: function(t, e) {},
    gCCE: function(t, e) {},
    odqc: function(t, e, n) {
        "use strict";
        var i = n("piuB"),
            r = (i.b, Number, String, String, String, String, Boolean, Function, String, Boolean, Number, String, {
                name: "tab",
                mixins: [i.b],
                mounted: function() {
                    var t = this;
                    this.$nextTick(function() {
                        setTimeout(function() {
                            t.hasReady = !0
                        }, 0)
                    })
                },
                props: {
                    lineWidth: {
                        type: Number,
                        default: 3
                    },
                    activeColor: String,
                    barActiveColor: String,
                    defaultColor: String,
                    disabledColor: String,
                    animate: {
                        type: Boolean,
                        default: !0
                    },
                    customBarWidth: [Function, String],
                    preventDefault: Boolean,
                    scrollThreshold: {
                        type: Number,
                        default: 4
                    },
                    barPosition: {
                        type: String,
                        default: "bottom",
                        validator: function(t) {
                            return -1 !== ["bottom", "top"].indexOf(t)
                        }
                    }
                },
                computed: {
                    barLeft: function() {
                        if (this.hasReady) {
                            var t = this.$refs.nav,
                                e = this.scrollable ? t.offsetWidth / this.$children[this.currentIndex || 0].$el.getBoundingClientRect().width : this.number;
                            return this.currentIndex * (100 / e) + "%"
                        }
                    },
                    barRight: function() {
                        if (this.hasReady) {
                            var t = this.$refs.nav,
                                e = this.scrollable ? t.offsetWidth / this.$children[this.currentIndex || 0].$el.getBoundingClientRect().width : this.number;
                            return (e - this.currentIndex - 1) * (100 / e) + "%"
                        }
                    },
                    innerBarStyle: function() {
                        return {
                            width: "function" == typeof this.customBarWidth ? this.customBarWidth(this.currentIndex) : this.customBarWidth,
                            background: this.barActiveColor || this.activeColor
                        }
                    },
                    barStyle: function() {
                        var t = {
                            left: this.barLeft,
                            right: this.barRight,
                            display: "block",
                            height: this.lineWidth + "px",
                            transition: this.hasReady ? null : "none"
                        };
                        return this.customBarWidth ? t.background = "transparent" : t.background = this.barActiveColor || this.activeColor, t
                    },
                    barClass: function() {
                        return {
                            "vux-tab-ink-bar-transition-forward": "forward" === this.direction,
                            "vux-tab-ink-bar-transition-backward": "backward" === this.direction
                        }
                    },
                    scrollable: function() {
                        return this.number > this.scrollThreshold
                    }
                },
                watch: {
                    currentIndex: function(t, e) {
                        this.direction = t > e ? "forward" : "backward", this.$emit("on-index-change", t, e), this.hasReady && this.scrollToActiveTab()
                    }
                },
                data: function() {
                    return {
                        direction: "forward",
                        right: "100%",
                        hasReady: !1
                    }
                },
                methods: {
                    scrollToActiveTab: function() {
                        var t = this;
                        if (this.scrollable && this.$children && this.$children.length) {
                            var e = this.$children[this.currentIndex].$el,
                                n = 0;
                            window.requestAnimationFrame(function i() {
                                var r = t.$refs.nav;
                                r.scrollLeft += (e.offsetLeft - (r.offsetWidth - e.offsetWidth) / 2 - r.scrollLeft) / 15, ++n < 15 && window.requestAnimationFrame(i)
                            })
                        }
                    }
                }
            }),
            a = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("div", {
                        staticClass: "vux-tab-wrap",
                        class: "top" === t.barPosition ? "vux-tab-bar-top" : ""
                    }, [n("div", {
                        staticClass: "vux-tab-container"
                    }, [n("div", {
                        ref: "nav",
                        staticClass: "vux-tab",
                        class: [{
                            "vux-tab-no-animate": !t.animate
                        }, {
                            scrollable: t.scrollable
                        }]
                    }, [t._t("default"), t._v(" "), t.animate ? n("div", {
                        staticClass: "vux-tab-ink-bar",
                        class: t.barClass,
                        style: t.barStyle
                    }, [t.customBarWidth ? n("span", {
                        staticClass: "vux-tab-bar-inner",
                        style: t.innerBarStyle
                    }) : t._e()]) : t._e()], 2)])])
                },
                staticRenderFns: []
            };
        var s = n("VU/8")(r, a, !1, function(t) {
            n("Zw8t")
        }, null, null);
        e.a = s.exports
    },
    piuB: function(t, e, n) {
        "use strict";
        n.d(e, "b", function() {
            return r
        }), n.d(e, "a", function() {
            return a
        });
        var i = n("0FxO"),
            r = {
                mounted: function() {
                    this.value >= 0 && (this.currentIndex = this.value), this.updateIndex()
                },
                methods: {
                    updateIndex: function() {
                        if (this.$children && this.$children.length) {
                            this.number = this.$children.length;
                            for (var t = this.$children, e = 0; e < t.length; e++) t[e].currentIndex = e, t[e].currentSelected && (this.index = e)
                        }
                    }
                },
                props: {
                    value: Number
                },
                watch: {
                    currentIndex: function(t, e) {
                        e > -1 && this.$children[e] && (this.$children[e].currentSelected = !1), t > -1 && this.$children[t] && (this.$children[t].currentSelected = !0), this.$emit("input", t), this.$emit("on-index-change", t, e)
                    },
                    index: function(t) {
                        this.currentIndex = t
                    },
                    value: function(t) {
                        this.index = t
                    }
                },
                data: function() {
                    return {
                        index: -1,
                        currentIndex: this.index,
                        number: this.$children.length
                    }
                }
            },
            a = {
                props: {
                    selected: {
                        type: Boolean,
                        default: !1
                    }
                },
                mounted: function() {
                    this.$parent.updateIndex()
                },
                beforeDestroy: function() {
                    var t = this.$parent;
                    this.$nextTick(function() {
                        t.updateIndex()
                    })
                },
                methods: {
                    onItemClick: function(t) {
                        var e = this;
                        this.$parent.preventDefault ? this.$parent.$emit("on-before-index-change", this.currentIndex) : (void 0 !== this.disabled && !1 !== this.disabled || (this.currentSelected = !0, this.$parent.currentIndex = this.currentIndex, this.$nextTick(function() {
                            e.$emit("on-item-click", e.currentIndex)
                        })), !0 === t && Object(i.a)(this.link, this.$router))
                    }
                },
                watch: {
                    currentSelected: function(t) {
                        t && (this.$parent.index = this.currentIndex)
                    },
                    selected: function(t) {
                        this.currentSelected = t
                    }
                },
                data: function() {
                    return {
                        currentIndex: -1,
                        currentSelected: this.selected
                    }
                }
            }
    }
});